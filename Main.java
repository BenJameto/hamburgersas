/**
 * Metodo que verifica que los menus sean mostrados correctamente
 * @author @Clausyari
 * @author @axlducloux
 * @author @Benjameto
 * @date 2024.03.10
 */
public class Main {
    public static void main(String[] args) {
        Lector lector = new Lector ();
        IterableCollection<Hamburguesa> menuDeluxe = new Delux();
        IterableCollection<Hamburguesa> menuBasico = new Basico();
        IterableCollection<Hamburguesa> menuEspecial = new Especial();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        lector.leeMenu(menuDeluxe);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        lector.leeMenu(menuBasico);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        lector.leeMenu(menuEspecial);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    }
}
