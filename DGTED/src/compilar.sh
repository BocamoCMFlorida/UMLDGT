#!/bin/bash

# Establecer la ruta base para la carpeta src
SRC_DIR=$(pwd)

# Eliminar archivos .class si existen
if ls $SRC_DIR/*.class 1> /dev/null 2>&1; then
    rm -f $SRC_DIR/*.class
fi

# Compilar los archivos .java dentro de src/
javac -d $SRC_DIR $SRC_DIR/*.java

# Crear el archivo .jar dentro de la carpeta src/
jar cfm $SRC_DIR/SistemaGestion.jar $SRC_DIR/MANIFEST.MF -C $SRC_DIR .

# Confirmar que el archivo .jar ha sido creado
echo "El archivo SistemaGestion.jar ha sido creado exitosamente en la carpeta src."
