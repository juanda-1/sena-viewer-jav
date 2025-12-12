## Getting Started
SENA Viewer – Proyecto en Java con conexión MySQL

SENA Viewer es una aplicación de consola desarrollada en Java que simula una plataforma de visualización de contenido multimedia, gestionando películas, series, publicaciones y reportes. El proyecto implementa conceptos fundamentales de Programación Orientada a Objetos (POO) como herencia, encapsulamiento, polimorfismo y modularidad, además de integrar conexión a base de datos MySQL mediante JDBC.

👥 Equipo de desarrollo

Nombre del grupo: Team JAV

Integrantes y roles
Integrante	Rol
Juan Noriega	Líder técnico
Vanessa Ocampo	Planeación y desarrollo
Andrés Portillo	Desarrollo y apoyo técnico

🛠 Herramientas utilizadas

Java: JDK 17+
IDE: IntelliJ IDEA / Eclipse / Visual Studio Code
Base de datos: MySQL 8.0+
Conector JDBC: mysql-connector-j (versión reciente)
Control de versiones: Git + GitHub
Metodología: GitFlow
Colaboración: Notion + GitHub Projects

📁 Estructura del proyecto
SENAVIEWER/
├── src/
│   ├── App.java
│   └── senaviewer/
│       └── model/
│           ├── Book.java
│           ├── Chapter.java
│           ├── Film.java
│           ├── Movie.java
│           ├── Serie.java
│           ├── Publication.java
│           └── Magazine.java
├── bin/
├── lib/   ← Aquí va el mysql-connector-j
├── docs/
│   └── diagrama-clases.png
└── README.md

🧩 Diseño del modelo de clases

El proyecto se organiza en dos categorías principales:

1. Contenido audiovisual

Film actúa como clase padre.
Movie y Serie heredan de Film.

2. Contenido editorial

Publication es la clase padre.
Book y Magazine heredan de Publication.

3. Elementos adicionales

Chapter es una clase independiente para capítulos de series o contenidos.
Principios aplicados
Encapsulamiento
Herencia y reutilización
Modularidad
Sobrescritura de métodos de visualización

El diagrama de clases se encuentra en /docs/diagrama-clases.png.

🗄️ Conexión con MySQL

El proyecto incluye integración con MySQL para almacenar y consultar datos del sistema.
La base de datos utiliza tablas para gestionar información de películas, series o publicaciones.

Requisitos técnicos

Tener instalado MySQL Server y MySQL Workbench.
Crear una base de datos dedicada para el proyecto.
Ubicar el archivo del conector JDBC dentro de la carpeta /lib.
Configurar el archivo de conexión dentro del código fuente utilizando las credenciales del sistema.

Indicadores de conexión exitosa

El programa confirma la conexión al iniciar.
Se pueden hacer consultas, inserciones o actualizaciones sin errores.
No aparecen mensajes como “Driver JDBC no encontrado”.
Errores comunes al conectar
Conector JDBC vacío o corrupto
Ruta incorrecta al archivo .jar
MySQL detenido
Credenciales incorrectas

🔀 Flujo de trabajo Git (GitFlow)

Ramas principales

main: contiene la versión estable del proyecto.
develop: recibe las funcionalidades en desarrollo.
Ramas secundarias (features)

Ejemplos:

feature/movie-model
feature/menu-console
feature/report-system

Buenas prácticas

Commits descriptivos
Revisiones mediante Pull Requests
Integración a develop solo después de revisión del líder técnico

📅 Cronograma de trabajo

Semana	    Actividad	                    Entregable
Semana 1	Planeación y diseño del modelo	README + diagrama de clases
Semana 1	Implementación de clases modelo	Repositorio actualizado
Semana 2	Menú de consola y navegación	App funcional
Semana 2	Integración MySQL + reportes	Demo final + documentación

🤝 Estrategia colaborativa

Trabajo colaborativo mediante Pair Programming
Revisiones cruzadas de código
Tareas gestionadas en Notion y GitHub Projects
Ramas vinculadas a tarjetas de trabajo
Documentación continua en cada entrega


