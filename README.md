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
## Dependencias, Plugins y Configuración gRPC

Para integrar gRPC en tu proyecto, sigue estos pasos:

### 1. Agregar el Plugin de Protobuf

En tu archivo `build.gradle`, añade el plugin que se muestra en la siguiente imagen:

![Plugin Protobuf](images/plugin.png)

### 2. Incluir las Dependencias Necesarias

Añade las dependencias necesarias en la sección `dependencies` de tu archivo `build.gradle`, como se muestra en la imagen a continuación:

![Dependencias gRPC](images/dependencias.png)

### 3. Configurar Protocolo Buffer (Protobuf)

Configura Protobuf en tu `build.gradle` para generar código Java a partir de archivos `.proto`. La configuración se muestra en la siguiente imagen:

![Configuración Protobuf](images/protobuf.png)

### 4. Especificar Directorios para Archivos Generados

Define dónde se guardarán los archivos generados por Protobuf. Puedes ver esta configuración en la imagen:

![Directorios Protobuf](images/directorio.png)

### 5. Compilar y Verificar

Finalmente, ejecuta los siguientes comandos para limpiar y compilar el proyecto, asegurándote de que todo funcione correctamente:

```bash
gradle clean
gradle build
```


## Recursos Adicionales

- [Documentación de Gradle](https://docs.gradle.org/current/userguide/userguide.html)
- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)
- [Documentación de gRPC](https://grpc.io/docs/)
- [Documentación de Protobuf](https://developers.google.com/protocol-buffers/docs/overview)
