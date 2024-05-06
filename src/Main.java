import java.util.ArrayList;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException,ClassNotFoundException {

        PorDefecto();

        CrearJugadores ventana = new CrearJugadores();
        ventana.setVisible(true);


    }
    public static void Crear(int p ,String t,String a) throws IOException, ClassNotFoundException {
        Jugador J = new Jugador(p,t,a);
        Guarda(J);
    }
    public static void PorDefecto() throws IOException, ClassNotFoundException {
        Jugador j = new Jugador(50, "Elfo", "arco,espada,arco");
        Guarda(j);
        Jugador j2 = new Jugador(200,"Troll","Garras, brazons gigantes");
        Guarda(j2);
        Jugador j3 = new Jugador(120,"Mago","Hechizo, invisibilidad");
        Guarda(j3);
    }
    public static void Guarda(Jugador j) throws IOException, ClassNotFoundException {

        FileOutputStream fichero = new FileOutputStream("Prueba.txt");//Crear un fichero
        ObjectOutputStream objeto = new ObjectOutputStream(fichero);               //Crear lo que nos combierte los objetos a bytes
        objeto.writeObject(j);  //Añadir los objetos

        objeto.close();         //Cerrar el flujo

        LeerPorDefecto();

    }
    public static void LeerPorDefecto() throws IOException, ClassNotFoundException {


        FileInputStream FicheroL = new FileInputStream("Prueba.txt");       //Abrir ese fichero
        ObjectInputStream Objetol = new ObjectInputStream(FicheroL);        //Elegir donde lo leo
        Jugador jug = (Jugador) Objetol.readObject();       //Leer lo que hay, hacerle cast a mi clase y guardarlo en una variable
        Objetol.close();
        System.out.println(jug);

    }

}