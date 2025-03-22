package semana5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private  List<Libro> libros;
    private  List<Usuario> usuarios;
    private  List<Prestamo> prestamos;
    public static int diaSimulado = 1;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void avanzarDias() {
        diaSimulado++;
    }

    public void avanzarDias(int dias) {
        diaSimulado += dias;
    }

    // Getters
    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos; 
    }

    public Libro agregarLibro(String titulo, String autor, String isbn, String anio, boolean disponible) {
        Libro libro = new Libro(titulo, autor, isbn, anio, disponible);
        libros.add(libro);
        return libro;
    }

    public Libro agregarLibro(String titulo, String autor) {
        Libro libro = new Libro(titulo, "Desconocido", "Desconocido", "Desconocido", true);
        libros.add(libro);
        return libro;
    }


    public Usuario agregarUsuario(String nombre, String email, String telefono, String direccion) {
        Usuario usuario = new Usuario(nombre, email, telefono, direccion);
        usuarios.add(usuario);
        return usuario;
    }

    // Prestamos
    public Prestamo realizarPrestamo(Usuario usuario, Libro libro, int diasPrestamo) {
        if (libro.getDisponible()) {
            libro.setDisponible(false);
            Prestamo nuevoPrestamo = new Prestamo(libro, usuario, diaSimulado, diasPrestamo);

            // Agregar a la lista de prestamos
            prestamos.add(nuevoPrestamo);

            return nuevoPrestamo;
        } else {
            System.out.println("El libro \""+libro.getTitulo()+ "\" no está disponible para préstamo.");
            return null;
        }
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        Prestamo prestamoPorEliminar = null;

        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.getUsuario().equals(usuario)) {
                prestamoPorEliminar = prestamo;
                break;
            }
        }

        if (prestamoPorEliminar != null) {
            prestamos.remove(prestamoPorEliminar);
            libro.setDisponible(true);

            long diasRetraso = prestamoPorEliminar.calcularRetraso();
            if (diasRetraso > 0) {
                System.out.println("El libro '" + libro.getTitulo() + "' fue devuelto con " + diasRetraso + " días de retraso.");
            }
            else {
                System.out.println("El libro '" + libro.getTitulo() + "' fue devuelto a tiempo.");
            }
        }
        else {
            System.out.println("No se encontró un préstamo activo para este libro y usuario.");
        }
    }

    public void devolverLibro(Prestamo prestamo) {
        devolverLibro(prestamo.getUsuario(), prestamo.getLibro());
    }

    public List<Prestamo> getPrestamosPorUsuario(Usuario usuario) {
        List<Prestamo> prestamosUsuario = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario().equals(usuario)) {
                prestamosUsuario.add(prestamo);
            }
        }

        return prestamosUsuario;
    }

    

    public List<Libro> buscarLibros(String busqueda) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(busqueda.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }

        return librosEncontrados;
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public List<Libro> buscarLibrosPorAnio(String anio) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getañoDePublicacion().equals(anio)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public void generarInforme() {
        System.out.println("[Informe de la biblioteca]");
        System.out.println("Día actual simulado: " + diaSimulado);
        System.out.println("Libros (" + libros.size() + "):");
        for (Libro libro : libros) {
            System.out.println("* " + libro.getTitulo() + " - " + (libro.getDisponible() ? "Disponible" : "No disponible"));
        }

        System.out.println("\nUsuarios (" + usuarios.size() + "):");
        for (Usuario usuario : usuarios) {
            System.out.println("* " + usuario.getNombre() + " - " + usuario.getEmail());
        }

        System.out.println("\nPrestamos (" + prestamos.size() + "):");
        for (Prestamo prestamo : prestamos) {
            System.out.println("* " + prestamo.getUsuario().getNombre() + " - " + prestamo.getLibro().getTitulo() 
                                    + " - Fecha de préstamo: Día #" + prestamo.getFechaPrestamo() 
                                    + " - Fecha de devolución prevista: Día #" + prestamo.getFechaDevolucionPrevista()
                                    + " " + (prestamo.calcularRetraso() > 0 ? "(RETRASO)" : ""));
        }
    }
    
}
