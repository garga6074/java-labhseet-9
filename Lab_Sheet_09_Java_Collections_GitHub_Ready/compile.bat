@echo off
setlocal
if not exist out mkdir out
dir /s /b src\main\java\*.java > sources.txt
javac -encoding UTF-8 -d out @sources.txt
set RESULT=%ERRORLEVEL%
del sources.txt
if not "%RESULT%"=="0" (
  echo Compilation failed.
  exit /b %RESULT%
)
echo All Java programs compiled successfully into out\
