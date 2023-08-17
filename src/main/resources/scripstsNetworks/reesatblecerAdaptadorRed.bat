@echo off

REM Verificar si se tienen privilegios de administrador
>nul 2>&1 "%SYSTEMROOT%\System32\cacls.exe" "%SYSTEMROOT%\System32\config\system"
if "%errorlevel%" neq "0" (
    echo Requerimiento de privilegios administrativos...
    echo.

    REM Solicitar elevación de permisos
    powershell start -verb runas '"%~0" %*'
    exit /b
)
echo Adaptadores de Red Disponibles:
echo.
wmic nic get NetConnectionID
set /p nombre_adaptador=Ingrese el nombre del adaptador de red si desea reestablecerlo en automatico:
netsh int ip set address "%nombre_adaptador%" source = dhcp
netsh interface ip set dns "%nombre_adaptador%" source = dhcp
netsh winsock reset
netsh int ip reset º
netsh int ipv6 reset
ipconfig /release
ipconfig /renew
ipconfig /flushdns
echo.
echo Reinicie el sistema para que los cambios tengan efecto
echo.
pause

exit