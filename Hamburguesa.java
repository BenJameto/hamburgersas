
public class Hamburguesa {
    String id;
    String nombre;
    String descripcion;
    int precio;
    boolean tieneQueso;
    boolean esVegetariano;

    public Hamburguesa(String id, String nombre, String descripcion, int precio, boolean tieneQueso, boolean esVegetariano ){
        this.id = id;
        this.nombre =nombre;
        this.descripcion=descripcion;
        this.precio =precio;
        this.tieneQueso=tieneQueso;
        this.esVegetariano=esVegetariano;
    }
    @Override
    public String toString (){
        String cadena = id +" "+ nombre+ " \n"+ descripcion + precio + tieneQueso +esVegetariano;
        return cadena;
    }
}
