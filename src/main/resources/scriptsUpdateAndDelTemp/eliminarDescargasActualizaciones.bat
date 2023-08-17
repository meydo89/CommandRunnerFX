@echo off
>nul 2>&1 "%SYSTEMROOT%\System32\cacls.exe" "%SYSTEMROOT%\System32\config\system"
if "%errorlevel%" neq "0" (
    echo Requerimiento de privilegios administrativos...
    echo.

    REM Solicitar elevación de permisos
    powershell start -verb runas '"%~0" %*'
    exit /b
)

del /s /q C:\Windows\SoftwareDistribution\Download\*.*

pause

exit