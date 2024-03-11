import java.util.ArrayList;

/**
 * Especial
 */
public class Especial implements IterableCollection<Hamburguesa> {
    ArrayList<Hamburguesa> platillos = new ArrayList<Hamburguesa>();

    public Especial() {
        platillos.add(new Hamburguesa("Esp1", "clasica", "haburguesa con usa nsola carne especial", 60, true, false));
        platillos.add(new Hamburguesa("Esp2", "hahayana", "la clasica especial con un pedacito de pigna", 70, true, false));
        platillos.add(new Hamburguesa("Esp3", "tehanaa", "lo mismo de la hahayana especial mas un pedacito de tosino", 80, true,false));
        platillos.add(new Hamburguesa("Esp4", "Vegetariana Doble Delux", "Mas rica y deliciosa soya", 500.00, false, true));
    }

    public Iterator<Hamburguesa> createIterator() {
        System.out.println("********* M E N U   E S P E C I A L <3 *********");
        return new EspecialIterator(this);
    }
}
