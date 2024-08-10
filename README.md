# Configuración

## Requisitos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- [Visual Studio Code (VSCode)](https://code.visualstudio.com/)
- [MySQL Workbench](https://www.mysql.com/products/workbench/)

## Configuración de la Base de Datos

1. **Crea la Base de Datos:**
   - Abre MySQL Workbench.
   - Crea una nueva base de datos según las necesidades de tu proyecto.

2. **Configura el archivo `application.properties`:**
   - Configura las credenciales y parámetros de conexión a tu base de datos en el archivo `application.properties` de tu proyecto.

## Instalación de Gradle

1. **Descargar e Instalar Gradle:**
   - Ve a [Gradle Releases](https://gradle.org/releases/).
   - Descarga la distribución más reciente (por ejemplo, `Gradle 8.9 Binary-Only`).

2. **Instalación Manual:**
   - Descomprime el archivo descargado en el directorio deseado. Por ejemplo, `C:/`.
   - Copia la dirección del directorio `bin` (por ejemplo, `C:\workspace\gradle-8.9-bin\gradle-8.9\bin`).

3. **Configurar las Variables de Entorno:**
   - Abre el Panel de Control y ve a `Sistema` > `Configuración avanzada del sistema` > `Variables de entorno`.
   - En `Variables del sistema`, encuentra la variable `Path`, selecciónala y haz clic en `Editar`.
   - Agrega la dirección del directorio `bin` que copiaste anteriormente a la lista de valores.
   - Guarda los cambios.

4. **Verificar la Instalación:**
   - Abre una consola (cmd o terminal) y ejecuta el comando:
     ```bash
     gradle -version
     ```
   - Deberías ver la versión de Gradle instalada si todo está configurado correctamente.

## Verificación del Proyecto

1. **Verifica la Configuración del Proyecto:**
   - Abre una consola en el directorio raíz del proyecto.
   - Ejecuta los siguientes comandos para limpiar y construir el proyecto:
     ```bash
     gradle clean
     gradle build
     ```

2. **Comienza el Desarrollo:**
   - Una vez que hayas verificado que todo está configurado correctamente, puedes comenzar el desarrollo de tu proyecto.

## Recursos Adicionales

- [Documentación de Gradle](https://docs.gradle.org/current/userguide/userguide.html)
- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
