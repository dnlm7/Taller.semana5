package semana5;


public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private int diaPrestamo;
    private int diaDevolucionPrevista;

    public Prestamo(Libro libro, Usuario usuario, int diaPrestamo, int fechaMax) {
        this.libro = libro;
        this.usuario = usuario;
        this.diaPrestamo = diaPrestamo;
        this.diaDevolucionPrevista = diaPrestamo + fechaMax;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getFechaPrestamo() {
        return diaPrestamo;
    }

    public int getFechaDevolucionPrevista() {
        return diaDevolucionPrevista;
    }

    public long calcularRetraso() {
        if (Biblioteca.diaSimulado > diaDevolucionPrevista) {
            return Biblioteca.diaSimulado - diaDevolucionPrevista;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro.getTitulo() +
                ", usuario=" + usuario.getNombre() +
                ", fechaPrestamo=" + diaPrestamo +
                ", fechaDevolucionPrevista=" + diaDevolucionPrevista +
                '}';
    }
}