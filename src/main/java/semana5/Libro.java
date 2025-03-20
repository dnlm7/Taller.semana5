package semana5;

// import java.sql.Date;

public class Libro {
    private String Titulo; 
    private String Autor; 
    private String ISBN; 
    private String añoDePublicacion; 
    private Boolean Disponible; 

    //Constructor 
    public Libro(String Titulo, String Autor, String ISBN, String añoDePublicacion, Boolean Disponible)  {
        this.Titulo = Titulo; 
        this.Autor = Autor; 
        this.ISBN = ISBN;
        this.añoDePublicacion = añoDePublicacion;
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
public String getañoDePublicacion() {
    return añoDePublicacion; 
}
public void setAño_de_publicacion(String añoDePublicacion) {
    this.añoDePublicacion = añoDePublicacion;  
}  
public Boolean getDisponible() {
    return Disponible; 
} 
public void setDisponible(Boolean Disponible) {
    this.Disponible = Disponible; 
} 

//metodo toString 

@Override
public String toString() {
    return "Libro{" +
            "Titulo='" + Titulo + '\'' +
            ", Autor='" + Autor + '\'' +
            ", ISBN='" + ISBN + '\'' +
            ", añoDePublicacion='" + añoDePublicacion + '\'' +
            ", Disponible=" + Disponible +
            '}'; 
}


}