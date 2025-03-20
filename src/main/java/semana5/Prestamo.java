package semana5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionPrevista;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionPrevista = fechaPrestamo.plusDays(diasPrestamo);
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucionPrevista() {
        return fechaDevolucionPrevista;
    }

    public long calcularRetraso() {
        LocalDate hoy = LocalDate.now();
        if (hoy.isAfter(fechaDevolucionPrevista)) {
            return ChronoUnit.DAYS.between(fechaDevolucionPrevista, hoy);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro.getTitulo() +
                ", usuario=" + usuario.getNombre() +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucionPrevista=" + fechaDevolucionPrevista +
                '}';
    }
}