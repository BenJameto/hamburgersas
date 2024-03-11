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
