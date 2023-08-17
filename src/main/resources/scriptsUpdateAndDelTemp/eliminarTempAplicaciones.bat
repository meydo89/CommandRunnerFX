@echo off
>nul 2>&1 "%SYSTEMROOT%\System32\cacls.exe" "%SYSTEMROOT%\System32\config\system"
if "%errorlevel%" neq "0" (
    echo Requerimiento de privilegios administrativos...
    echo.

    REM Solicitar elevación de permisos
    powershell start -verb runas '"%~0" %*'
    exit /b
)
set "extension=.pf"
set "directorio=C:\Windows\Prefetch"
cd /d "%directorio%"
rem Verificar si hay archivos con la extension en el directorio
dir "%directorio%\*%extension%" > nul 2>&1

if errorlevel 1 (
    echo No se encontraron archivos.
) else (
    echo Eliminando archivos...
    del / s/q "%directorio%\*%extension%"
    echo Archivos eliminados.
)
pause