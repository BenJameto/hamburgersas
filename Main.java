public class Main {
    public static void main(String[] args) {
        Lector lector = new Lector ();
        IterableCollection<Hamburguesa> menu = new Delux();
        IterableCollection<Hamburguesa> menu2 = new Basico();
        IterableCollection<Hamburguesa> menu3 = new Especial();
        lector.leeMenu(menu);
        lector.leeMenu(menu2);
        lector.leeMenu(menu3);
    }
}
