package lab9p2_ricardoquiroz_rigobertobarahona;


public class Lenguaje {
    String lengua;

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    public Lenguaje(String lengua) {
        this.lengua = lengua;
    }

    @Override
    public String toString() {
        return lengua;
    }
    
}
