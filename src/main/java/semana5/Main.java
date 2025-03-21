package semana5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");

        Biblioteca biblioteca = new Biblioteca();

        // Libros
        Libro libro1 = biblioteca.agregarLibro("El principito", "Antoine de Saint-Exupéry", "978-84-206-8539-1", "1943", true);
        Libro libro2 = biblioteca.agregarLibro("El señor de los anillos", "J.R.R. Tolkien", "978-84-450-7370-7", "1954", true);
        Libro libro3 = biblioteca.agregarLibro("Harry Potter y la piedra filosofal", "J.K. Rowling", "978-84-9838-000-4", "1997", true);
        Libro libro4 = biblioteca.agregarLibro("Piense Y Hagase Rico", "Napoleon Hill", "978-84-9838-000-5", "1937", true);
        Libro libro5 = biblioteca.agregarLibro("Metafisica 4 en 1 ", "Cony Mendez", "978-84-9838-564-5", "1977", true);
        Libro libro6 = biblioteca.agregarLibro("Un Grito Desperado", "Carlos Sanchez", "978-84-9838-975-5", "1992", true);
        Libro libro7 = biblioteca.agregarLibro("Piense Y Hagase Rico", "Marta Osorio", "978-84-9838-777-5", "1980", true);

        // Usuarios
        Usuario usuario1 = biblioteca.agregarUsuario("Juan Pérez", "juanperez@gmail.com", "3023456789", "Calle 123 # 45-67");
        Usuario usuario2 = biblioteca.agregarUsuario("María Gómez", "gomezmaria10@gmai.com", "3012345678", "Carrera 54 # 32-10");
        Usuario usuario3 = biblioteca.agregarUsuario("Pedro Rodríguez", "pedrorod@gmail.com", "3009876543", "Avenida 12 # 34-56");
        Usuario usuario4 = biblioteca.agregarUsuario("Armando Porro", "perroarmando@gmail.com", "3015642338", "Avenida 67 #33-02");
        Usuario usuario5 = biblioteca.agregarUsuario("Luz Marina", "mar123@gmail.com", "3204606581", "Avenida 12 # 34-56");
        Usuario usuario6 = biblioteca.agregarUsuario("Paz Guerra", "guerrafinal@gmail.com", "3224447788", "Avenida 12 # 34-56");

        // Préstamos
        biblioteca.realizarPrestamo(usuario1, libro1, 5);
        Prestamo prestamo2 = biblioteca.realizarPrestamo(usuario2, libro2, 5);
        biblioteca.realizarPrestamo(usuario3, libro3, 2);

        // Consultar préstamos de Juan Pérez
        List<Prestamo> listaPrestamos = biblioteca.getPrestamosPorUsuario(usuario1);
        System.out.println("Préstamos de " + usuario1.getNombre());
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println("* " + prestamo.getLibro().getTitulo() + " - Fecha de préstamo: " + prestamo.getFechaPrestamo() + " - Fecha de devolución prevista: " + prestamo.getFechaDevolucionPrevista());
        }

        // Consultar todos los prestamos
        System.out.println("\nTodos los préstamos:");
        List<Prestamo> prestamos = biblioteca.getPrestamos();
        for (Prestamo prestamo: prestamos) {
            System.out.println("* " + prestamo.getUsuario().getNombre() + " - " + prestamo.getLibro().getTitulo() + " - Fecha de préstamo: " + prestamo.getFechaPrestamo() + " - Fecha de devolución prevista: " + prestamo.getFechaDevolucionPrevista());
        }
        System.out.println();

        // Devoluciones
        biblioteca.devolverLibro(usuario1, libro1); // Devolver por medio de usario y libro

        // Devolvemos después de 6 días (Con retraso)
        biblioteca.avanzarDias(6);
        biblioteca.devolverLibro(prestamo2); // Devolver por medio de un objeto Prestamo (sobrecarga de método)

        // Buscar libros
        List<Libro> librosEncontrados = biblioteca.buscarLibros("El");
        System.out.println("\nLibros encontrados:");
        for (Libro libro : librosEncontrados) {
            System.out.println("* " + libro.getTitulo());
        }

        // Informe
        System.out.println();
        biblioteca.generarInforme();
        
    }
    
}
