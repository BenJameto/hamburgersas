import java.util.Hashtable;

public class Delux implements IterableCollection <Hamburguesa> {
    Hashtable<String, Hamburguesa> platillos = new Hashtable<>();

    public Delux(){
        Hamburguesa h1 = new Hamburguesa("Del1", "Clasica Especial", "Solo carne de la mejor calidad <3", 100.00, true, false);
        Hamburguesa h2 = new Hamburguesa("Del2", "Doble Hawaiana", "Por que sabemos que tienes un amor insano a la piña, tenemos la opcion para ti", 120.00, true, false);
        Hamburguesa h3 = new Hamburguesa("Del3", "Tejana directo al hospital", "Hawaiana x Carne x100 (Elijase bajo supervision de un medico)", 180.00, true, false);
        Hamburguesa h4 = new Hamburguesa("Del4", "Especial Vegetariana", "Soya exportada y de la mejor calidad", 250.00, false, true);
        Hamburguesa h5 = new Hamburguesa("Del5", "Vegetariana Doble Delux", "Mas rica y deliciosa soya", 500.00, false, true);
    
        platillos.put(h1.id, h1);
        platillos.put(h2.id, h2);
        platillos.put(h3.id, h3);
        platillos.put(h4.id, h4);
        platillos.put(h5.id, h5);
    }
    public Iterator<Hamburguesa> createIterator() {
        System.out.println("********* M E N U   D E L U X E <3 *********");
        return new DeluxIterator(this);
    }
}