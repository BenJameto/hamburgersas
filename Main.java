public class Main {
    public static void main(String[] args) {
        Lector lector = new Lector ();
        IterableCollection<Hamburguesa> menu = new Especial();
        lector.leeMenu(menu);
    }
}
