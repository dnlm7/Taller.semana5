# Actividad Práctica: Implementación de Lógica de Negocio

Este sistema de gestión de biblioteca permite administrar libros, usuarios y préstamos. Incluye funciones para agregar libros, registrar usuarios, realizar y devolver préstamos, además de listar los libros y usuarios registrados. 

## Integrantes de la actividad 
- Daniel Muñoz 
- Martin Amaro 
- Diego Cardenas

<br>

# Biblioteca - Sistema de Préstamos

Este proyecto es una aplicación en Java para gestionar una biblioteca, permitiendo el registro de libros, usuarios y la realización de préstamos con fechas de devolución previstas.

## 📌 Características
- Registrar libros en la biblioteca.
- Registrar usuarios con información de contacto.
- Realizar préstamos de libros con fechas de devolución previstas.
- Consultar préstamos por usuario.
- Devolver libros y calcular retrasos en la devolución.
- Generar un informe del estado actual de la biblioteca.

## 📁 Estructura del Proyecto
```
Taller.semanas-master/
│── src/
│   ├── main/java/semana5/
│   │   ├── Biblioteca.java
│   │   ├── Libro.java
│   │   ├── Main.java
│   │   ├── Prestamo.java
│   │   ├── Usuario.java
│── pom.xml (Si es un proyecto Maven)
│── README.md
```

## 🛠 Tecnologías Usadas
- Java 8+
- Maven (opcional para gestión de dependencias)
- IDE recomendado: IntelliJ IDEA, Eclipse o VS Code

## 📌 Clases Principales
| Clase        | Descripción |
|-------------|-------------|
| `Main.java` | Punto de entrada del programa. |
| `Biblioteca.java` | Administra los libros, usuarios y préstamos. |
| `Libro.java` | Representa un libro en la biblioteca. |
| `Usuario.java` | Contiene la información de un usuario. |
| `Prestamo.java` | Maneja los préstamos y sus fechas de devolución. |

## 📜 Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente
