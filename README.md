# Proyecto POO: Gestión de Contenido Audiovisual

## Descripción del Proyecto
Este proyecto es una aplicación de demostración en Java que utiliza los principios de la Programación Orientada a Objetos (POO) para gestionar diferentes tipos de contenido audiovisual. El objetivo es modelar la jerarquía de clases de películas, series de TV y documentales, aplicando conceptos como herencia, polimorfismo, asociación y composición.

El proyecto ha sido expandido para incluir nuevas clases y funcionalidades, demostrando una comprensión sólida de las relaciones entre objetos y la modularidad del código.

## Clases y Funcionalidades Nuevas
- **Clases de Relación:** Se han añadido `Actor`, `Temporada` e `Investigador` para establecer relaciones de agregación y composición con las clases `Pelicula`, `SerieDeTV` y `Documental` respectivamente. Esto permite modelar datos más complejos, como la lista de actores de una película o las temporadas de una serie.
- **Subclases Adicionales:** Se han creado dos nuevas subclases, `Cortometraje` y `Podcast`, que heredan de `ContenidoAudiovisual`. Esto demuestra la escalabilidad del sistema para incluir nuevos tipos de contenido fácilmente.
- **Sistema Funcional:** La clase `PruebaAudioVisual` ha sido actualizada para instanciar y probar todas las clases y sus relaciones, asegurando que el sistema sea completamente funcional y muestre correctamente los detalles de cada objeto.

## Instrucciones de Instalación y uso
1.  **Clonar el repositorio:** Abre una terminal o tu cliente de Git y ejecuta el siguiente comando para clonar el proyecto:
    ```bash
    git clone [https://github.com/CS-ProgramacionOrientada-Objetos/poo_unidad1](https://github.com/CS-ProgramacionOrientada-Objetos/poo_unidad1)
    ```
2.  **Abrir en Eclipse/IDE:** Importa el proyecto clonado en tu IDE de preferencia (Eclipse, IntelliJ IDEA, etc.).
3.  **Ejecutar la aplicación:** Abre el archivo `PruebaAudioVisual.java` y ejecuta el método `main`. La salida se mostrará en la consola.

