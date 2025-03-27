@echo off
rem Establecer la ruta base para la carpeta src
set SRC_DIR=%cd%

rem Verificar si existen archivos .class y eliminarlos
if exist %SRC_DIR%\*.class del /q %SRC_DIR%\*.class

rem Compilar los archivos .java dentro de src/
javac -d %SRC_DIR% %SRC_DIR%\*.java

rem Crear el archivo .jar dentro de la carpeta src/
jar cfm %SRC_DIR%\SistemaGestion.jar %SRC_DIR%\MANIFEST.MF -C %SRC_DIR% .

rem Confirmar que el archivo .jar ha sido creado
echo El archivo SistemaGestion.jar ha sido creado exitosamente en la carpeta src.
pause
