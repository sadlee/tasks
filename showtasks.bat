call runcrud.bat
if "%ERRORLEVEL%" == "0" goto runbrowser
echo.
echo There were problems with running script.
goto fail


:runbrowser
start chrome "http://localhost:8080/crud-app/v1/task/getTasks"
if "%ERRORLEVEL%" == "0" goto end
echo.
echo There were problems with browser
goto fail

:fail
echo.
echo Something wrong

:end
echo.
echo Work is done