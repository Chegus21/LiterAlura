# LiterAlura

LiterAlura es una aplicación web construida con Spring Boot que demuestra cómo manejar datos JPA con una base de datos PostgreSQL. Este proyecto incluye las funcionalidades básicas de CRUD (Crear, Leer, Actualizar, Eliminar) para manejar datos en una base de datos.

## Requisitos Previos

- Java 17
- Maven
- PostgreSQL

## Configuración del Proyecto

1. Clona este repositorio:
    ```bash
    git clone https://github.com/Chegus21/LiterAlura.git
    cd LiterAlura
    ```

2. Configura la base de datos PostgreSQL:
    - Crea una base de datos llamada `liter_alura`.
    - Actualiza el archivo `application.properties` con tus credenciales de PostgreSQL.

3. Compila y ejecuta la aplicación:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Estructura del Proyecto

- **src/main/java**: Contiene el código fuente de la aplicación.
- **src/main/resources**: Contiene los archivos de configuración.
- **src/test/java**: Contiene las pruebas unitarias.

## Uso

Accede a la aplicación en `http://localhost:5050`.

## Contribuir

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Haz tus cambios y haz commit (`git commit -m 'Agrega nueva funcionalidad'`).
4. Sube tus cambios (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT.
