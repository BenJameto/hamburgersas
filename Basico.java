
public class Basico implements IterableCollection <Hamburguesa>{
    Hamburguesa platillos[] = new Hamburguesa [5];
    public Basico (){
        platillos [0] = new Hamburguesa("Bs1", "Clasica", "Hamburguesa con una sola carne", 30.00, true, false);
        platillos [1] = new Hamburguesa("Bs2", "Hawaiana", "la clasica con un pedacito de piña", 50.00, true, false);
        platillos [2] = new Hamburguesa("Bs3", "Tejana", "lo mismo de la Hawaiana mas un pedacito de tocino", 80.00, true, false);
        platillos [3] = new Hamburguesa("Bs4", "Vegetariana", "Quitando la fea carne para poner deliciosa soya", 150.00, false, true);
        platillos [4] = new Hamburguesa("Bs5", "Vegetariana Doble", "Mas rica y deliciosa soya", 300.00, false, true);
    }

    public Iterator<Hamburguesa> createIterator(){
        System.out.println("********* M E N U   B A S I C O <3 *********");
        return new BasicoIterator(this);
    }
}
