import java.util.ArrayList;

/**
 * Especial
 */
public class Especial implements IterableCollection<Hamburguesa> {
    ArrayList<Hamburguesa> platillos = new ArrayList<Hamburguesa>();

    public Especial() {
        platillos.add(new Hamburguesa("Esp1", "Italiana", "Traida desde la preciosa Italia, con lo mejor de la carne", 150.00, true, false));
        platillos.add(new Hamburguesa("Esp2", "China", "Todo lo mejor de la cocina China <NADA CON VIDA>", 160.00, true, false));
        platillos.add(new Hamburguesa("Esp3", "Mexicana", "Recuerda tu preciosa infancia con esta hamburguesa de las mas picosas del restaurante", 180.00, true,false));
        platillos.add(new Hamburguesa("Esp4", "Vegetariana Doble Delux Expecial", "Por que te queremos, queremos que no mueras por falta de proteinas y te daremos esta deliciosa hamburguesa 100% gluten free", 800.00, false, true));
    }

    public Iterator<Hamburguesa> createIterator() {
        System.out.println("********* M E N U   E S P E C I A L <3 *********");
        return new EspecialIterator(this);
    }
}
