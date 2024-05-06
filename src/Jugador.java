import java.io.Serializable;
import java.util.Arrays;

public class Jugador implements Serializable {

    private int poder;
    private  String tipo; //raza

    private String armas;

    public Jugador(int poder, String tipo, String armas){

        setPoder(poder);
        setArmas(armas);
        setTipo(tipo);

    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "poder=" + poder +
                ", tipo='" + tipo + '\'' +
                ", armas=" + armas +
                '}';
    }
}

