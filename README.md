
# Sistema de Gestión de Contenido Audiovisual

## Descripción del Proyecto

Este proyecto es un sistema de gestión de contenido audiovisual desarrollado en Java, que permite a los usuarios gestionar y visualizar una colección de películas, series de TV, documentales, cortometrajes y podcasts. La aplicación está diseñada para demostrar la aplicación de principios de ingeniería de software como SOLID, el patrón de diseño MVC, código limpio y pruebas unitarias con JUnit y Mockito.

---

## 1. Cambios y Mejoras Realizadas

Durante el desarrollo, se realizaron importantes mejoras y refactorizaciones para cumplir con los estándares de calidad del software:

* **Refactorización del Código:** Se corrigieron y mejoraron los métodos `mostrarDetalles()` en todas las clases de contenido (`Cortometraje`, `Documental`, etc.) para que devolvieran un `String` formateado en lugar de imprimir directamente en la consola. Esto mejoró la separación de responsabilidades y la modularidad del código.
* **Aplicación de SOLID:** El sistema se reestructuró para seguir los principios SOLID, con una clara separación de responsabilidades (SRP) en clases como `ContentService` y `ConsoleView`, y el uso de interfaces (`IFileHandler`) para la inversión de dependencias (DIP).
* **Manejo de Archivos Robusto:** Se implementó una lógica de manejo de archivos que incluye la verificación y creación automática de la carpeta `data`, previniendo errores comunes de `FileNotFoundException` y mejorando la estabilidad del sistema.
* **Corrección de Errores Lógicos:** Se identificaron y corrigieron errores en los constructores de las clases `Cortometraje` y `Podcast`, así como un parámetro no utilizado en la clase `SerieDeTV`, lo que mejora la integridad de los datos del modelo.
* **Pruebas Unitarias:** Se configuró un entorno de pruebas con JUnit 5 y Mockito para validar la lógica de negocio del `ContentService` de forma aislada, utilizando mocks para la dependencia de archivos.

---

## 2. Estructura del Código

El proyecto está organizado en paquetes siguiendo el patrón de diseño MVC y un diseño modular:

```

poo\_unidad1/
├── src/
│   ├── poo/
│   │   ├── MainController.java      \# Controlador principal del sistema.
│   │   ├── ConsoleView.java         \# La vista en consola para la interacción con el usuario.
│   │   ├── ContentService.java      \# Lógica de negocio (Controlador).
│   │   ├── IFileHandler.java        \# Interfaz para el manejo de archivos (DIP).
│   │   └── CsvFileHandler.java      \# Implementación del manejo de archivos CSV.
│   └── uni1a/
│       ├── ContenidoAudiovisual.java  \# Clase base abstracta (Modelo).
│       ├── Actor.java                 \# Clase de apoyo para la Película (Modelo).
│       ├── Pelicula.java              \# Subclase de ContenidoAudiovisual (Modelo).
│       ├── SerieDeTV.java             \# Subclase de ContenidoAudiovisual (Modelo).
│       ├── Documental.java            \# Subclase de ContenidoAudiovisual (Modelo).
│       ├── Cortometraje.java          \# Subclase de ContenidoAudiovisual (Modelo).
│       ├── Podcast.java               \# Subclase de ContenidoAudiovisual (Modelo).
│       ├── Investigador.java          \# Clase de apoyo para el Documental (Modelo).
│       └── Temporada.java             \# Clase de apoyo para la Serie de TV (Modelo).
├── data/
│   └── contenidos.csv             \# Archivo de persistencia de datos.
└── test/
└── test/
└── ContentServiceTest.java    \# Pruebas unitarias con JUnit y Mockito.

````

---

## 3. Cómo Clonar y Ejecutar el Proyecto

### Requisitos Previos

* Java Development Kit (JDK) 16 o superior instalado.
* Un IDE como IntelliJ IDEA.

### Pasos para la Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone <URL_DEL_REPOSITORIO>
    ```

2.  **Abrir el proyecto en IntelliJ IDEA:**
    * En la pantalla de bienvenida, selecciona `Open` y elige la carpeta `poo_unidad1`.

3.  **Configurar el JDK:**
    * Ve a `File` -> `Project Structure` (Ctrl+Alt+Shift+S).
    * En `Project Settings` -> `Project`, asegúrate de que el `SDK` esté configurado a una versión compatible (JDK 16+).

4.  **Ejecutar la aplicación:**
    * Navega a la clase `MainController.java`.
    * Haz clic en el botón de "Play" (verde) junto al método `main()` para ejecutar la aplicación en la consola.

---

## 4. Cómo Ejecutar las Pruebas Unitarias

Para asegurar la calidad del código, se han implementado pruebas unitarias para el `ContentService` utilizando JUnit y Mockito.

1.  **Añadir las librerías necesarias:**
    * Asegúrate de que las siguientes dependencias estén en el classpath del proyecto, añadidas a través del menú `Project Structure` -> `Libraries`:
        * `junit-jupiter-api`
        * `junit-jupiter-engine`
        * `mockito-core`
        * `byte-buddy`
        * `byte-buddy-agent`
        * `objenesis`

2.  **Ejecutar las pruebas en IntelliJ IDEA:**
    * Navega a la clase `ContentServiceTest.java` en la carpeta `test/test`.
    * Haz clic en el botón de "Play" (verde) junto al nombre de la clase o junto a un método de prueba específico para ejecutarlo.
    * El IDE mostrará los resultados de las pruebas, indicando si han pasado (`Passed`) o fallado (`Failed`).
````
