@echo off
if "%1"=="" (
  echo Usage: run-example.bat ExerciseClassName
  exit /b 1
)
java -cp out lab09.collections.%1
