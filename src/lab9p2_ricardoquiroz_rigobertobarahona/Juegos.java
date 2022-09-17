package lab9p2_ricardoquiroz_rigobertobarahona;
import java.util.ArrayList;

public class Juegos {
    private String nombre;
    private String genre;
    private int precio;
    private ArrayList<Lenguaje> lenguas;

    public Juegos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Lenguaje> getLenguas() {
        return lenguas;
    }

    public void setLenguas(ArrayList<Lenguaje> lenguas) {
        this.lenguas = lenguas;
    }

    public Juegos(String nombre, String genre, int precio, ArrayList<Lenguaje> lenguas) {
        this.nombre = nombre;
        this.genre = genre;
        this.precio = precio;
        this.lenguas = lenguas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
