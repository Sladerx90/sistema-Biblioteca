# 📚 Sistema de Biblioteca - Colegio El Belloto

Este proyecto es un **sistema de gestión de biblioteca** desarrollado con **Spring Boot y Java**, que permite administrar libros, realizar búsquedas por ISBN mediante la **API de Google Books** y gestionar la información desde una interfaz web sencilla creada con **HTML, CSS y Bootstrap**.

---

## 🗂️ Estructura del Proyecto

```text
📁 biblioteca
│
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java/cl/colegioelbelloto/biblioteca
│   │   │   ├── 📂 controller           → Controladores web (manejo de peticiones HTTP)
│   │   │   ├── 📂 model                → Entidades del modelo (por ejemplo, Libro)
│   │   │   ├── 📂 repository           → Repositorios JPA (acceso a datos)
│   │   │   ├── 📂 service              → Lógica de negocio y conexión con la API de Google Books
│   │   │   └── 📄 BibliotecaApplication.java   → Clase principal de arranque
│   │   │
│   │   ├── 📂 resources
│   │   │   ├── 📂 templates            → Vistas HTML (interfaz web con Thymeleaf)
│   │   │   ├── 📂 static               → Recursos estáticos (CSS, JS, imágenes)
│   │   │   └── ⚙️  application.properties → Configuración del proyecto y base de datos H2
│   │
│   └── 📂 test                         → Pruebas unitarias (JUnit)
│
├── 📄 pom.xml                          → Archivo de dependencias Maven
└── 📄 README.md                        → Documentación del proyecto


---

## 🧩 Diagramas del Proyecto

### 📘 Diagrama de Clases
![Diagrama de Clases](ruta/a/tu/diagrama_clases.png)

### 🎯 Diagrama de Caso de Uso
![Diagrama de Caso de Uso](ruta/a/tu/diagrama_casos_uso.png)

> 📌 *Guarda tus diagramas en la carpeta `/resources/static/img/` o súbelos al repositorio y actualiza las rutas en los enlaces de arriba.*

---

## 👨‍💻 Desarrollador

**Nombre:** Misael Valerio Flores
**Institución:** Colegio El Belloto  
**Proyecto:** Sistema de Biblioteca versión 2  

---

## ⚙️ Tecnologías Utilizadas

### 🖥️ Backend
- **Java 17+**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - H2 Database
  - Thymeleaf

### 📡 Base de Datos
- **H2 Console**
  - Simula una base de datos en memoria.
  - Accesible en `http://localhost:8080/h2-console` (usuario y URL definidos en `application.properties`).

### 🌐 API Externa
- **Google Books API**
  - Permite buscar información de libros mediante su número ISBN.
  - Conexión manejada desde la clase `GoogleBooksService.java`.

### 🎨 Frontend
- **HTML5**
- **CSS3**
- **Bootstrap 5**
- Integración con **Thymeleaf** para renderizar vistas dinámicas.

---

## 🚀 Ejecución del Proyecto

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tuusuario/sistema-biblioteca.git

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta la clase principal: BibliotecaApplication.java

4. Abre tu navegador y entra a: http://localhost:8080

5. Accede a la consola H2 (opcional) en: http://localhost:8080/h2-console

📚 Funcionalidades principales

Registrar, listar, editar y eliminar libros.

Buscar libros automáticamente por ISBN desde Google Books API.

Mostrar resultados en una interfaz web amigable.

Guardar los libros en una base de datos en memoria (H2).

🏁 Estado del Proyecto

✅ Proyecto funcional y ejecutable en entorno local.
🚧 Pendiente: agregar validaciones, manejo de errores y autenticación de usuarios (opcional).    

📄 Licencia

Este proyecto fue desarrollado con fines educativos.
Uso libre con atribución al autor original.

## 🧩 Resolución de Problemas

Durante el desarrollo del proyecto **“Sistema Biblioteca”**, hubieron varios problemas que se debio solucionar, para poder hacer que funcione de la mejor manera.

### 🧩 Problema 1: Error al conectar con la base de datos H2
**Síntoma:**  
La aplicación no iniciaba y mostraba un error de conexión con la base de datos H2 al ejecutar `mvn spring-boot:run`.

**Causa:**  
El archivo `application.properties` no contenía correctamente la URL de conexión a la base de datos.

**Solución:**  
Tras investigar en la documentación de [Spring Boot Data JPA](https://spring.io/projects/spring-data-jpa) y en foros técnicos (Stack Overflow), se corrigió la configuración de la siguiente manera:

```properties
spring.datasource.url=jdbc:h2:mem:biblioteca
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

🧩 Problema 2: No se mostraban los datos en la plantilla HTML

Síntoma:
Los datos de los libros no aparecían en la vista Thymeleaf (listado.html).

Causa:
El modelo no estaba siendo pasado correctamente desde el controlador.

Solución:
Se revisó la documentación de Thymeleaf con Spring Boot
 y se ajustó el controlador:

@GetMapping("/libros")
public String listarLibros(Model model) {
    model.addAttribute("libros", libroService.listarTodos());
    return "listado";
}

🧩 Problema 3: Error al consumir la API de Google Books

Síntoma:
El sistema no devolvía resultados al buscar libros por ISBN.

Causa:
El endpoint de la API no estaba formateado correctamente.

Solución:
Consultando la documentación oficial de Google Books API
, se corrigió el método:

String url = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + isbn;

🔎 Conclusión

Durante la resolución de los errores se utilizaron recursos como:

Stack Overflow para comparar soluciones a errores de conexión y dependencias.

Documentación oficial de Spring Boot y Google Books API.

Asistencia de IA (ChatGPT) para comprender trazas de error y optimizar código.

🧩 Estos pasos demuestran capacidad de análisis, autonomía y resolución de problemas reales 
   en el desarrollo de software.



