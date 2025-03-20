package semana5;

// import java.sql.Date;

public class Libro {
    private String Titulo; 
    private String Autor; 
    private String ISBN; 
    private String Año_de_publicacion; 
    private Boolean Disponible; 

    //Constructor 
    public Libro(String Titulo, String Autor, String ISBN, String Año_de_publicacion, Boolean Disponible)  {
        this.Titulo = Titulo; 
        this.Autor = Autor; 
        this.ISBN = ISBN;
        this.Año_de_publicacion = Año_de_publicacion;
        this.Disponible = Disponible;

    }

    //getters y setters 

    public String getTitulo() {
        return Titulo; 
    }
    public void setTitulo(String Titulo) {
    this.Titulo = Titulo;  

    } 
    public String getAutor() {
        return Autor; 
    } 
    public void setAutor(String Autor) {
        this.Autor = Autor; 
   }
   
   public String getISBN() {
    return ISBN; 
}
public void setISBN(String ISBN) {
    this.ISBN = ISBN; 
} 
public String getAño_de_publicacion() {
    return Año_de_publicacion; 
}
public void setAño_de_publicacion(String Año_de_publicacion) {
    this.Año_de_publicacion = Año_de_publicacion;  
}  
public Boolean getDisponible() {
    return Disponible; 
} 
public void setDisponible(Boolean Disponible) {
    this.Disponible = Disponible; 
} 

//metodo para libro disponible 


}