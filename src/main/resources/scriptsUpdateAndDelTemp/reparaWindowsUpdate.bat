@echo off
>nul 2>&1 "%SYSTEMROOT%\System32\cacls.exe" "%SYSTEMROOT%\System32\config\system"
if "%errorlevel%" neq "0" (
    echo Requerimiento de privilegios administrativos...
    echo.

    REM Solicitar elevación de permisos
    powershell start -verb runas '"%~0" %*'
    exit /b
)
attrib -h -r -s "C:\Windows\System32\catroot2"
attrib -h -r -s "C:\Windows\System32\catroot2\*.*"
net stop wuauserv
net stop CryptSvc
net stop bits
set timestamp=%date:~-4,4%%date:~-7,2%%date:~-10,2%_%time:~0,2%%time:~3,2%%time:~6,2%

ren "C:\Windows\System32\catroot2" catroot2_%timestamp%.old
ren "C:\Windows\SoftwareDistribution" SoftwareDistribution_%timestamp%.old
ren "%ProgramData%\Microsoft\Network\Downloader" downloader_%timestamp%.old
net start bits
net start CryptSvc
net start wuauserv
net stop wuauserv
echo.
echo Desea borrar la cache de Actualizaciones
echo.
del %windir%\SoftwareDistribution\DataStore\*.*
net start wuauserv
sfc /scannow
net stop wuauserv
net start wuauserv
echo.
echo Tarea realizada, reinicie para completar cambios
echo.
pause
exit