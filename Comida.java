import java.io.*;
/**
* Metodo que verifica que Platillo y Hamburguesa si implementan Template y muestran la preparacion de una hamburguesa vegana o no
* @author @Clausyari
* @author @axlducloux
* @author @Benjameto
* @date 2024.03.10
*/
public class Comida{
    public static void main(String[] args) {

        Hamburguesa h1 = new Hamburguesa("Del1", "Clásica", "Hamburguesa con una sola carne especial Delux", 60, true, false);
        Hamburguesa h2 = new Hamburguesa("Del1", "Clásica", "Hamburguesa con una sola carne especial Delux", 60, true, true);

        System.out.println("**** Preparando " + h1.darNombre() + "... ****\n");
        h1.prepararPlatillo();

        System.out.println("**** Preparando " + h2.darNombre() + "... ****\n");
        h2.prepararPlatillo();
    }

}
