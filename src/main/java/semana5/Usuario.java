package semana5;

public class Usuario {
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;

    public Usuario(String nombre, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }
}
