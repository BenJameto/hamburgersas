import java.io.*;
/**
 * Clase abstracta que es constructor de Hamburguesa
 * @author @Clausyari
 * @author @axlducloux
 * @author @Benjameto
 * @date 2024.03.10
 */
public abstract class Platillo {

    String id;
    String nombre;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;

    /**
     * Constructor de Platillo
     * @param id Identificador
     * @param nombre Nombre del platillo
     * @param descripcion Que es lo que tiene
     * @param precio Cuanto cuesta
     * @param tieneQueso Si tiene queso
     * @param esVegetariano Si es vegetariana
     */
    public Platillo(String id, String nombre, String descripcion, double precio, boolean tieneQueso, boolean esVegetariano ){
        this.id = id;
        this.nombre =nombre;
        this.descripcion=descripcion;
        this.precio =precio;
        this.tieneQueso=tieneQueso;
        this.esVegetariano=esVegetariano;
    }

    /**
     * Prepara el platillo uniendo todos los ingredientes
     * Si es vegetariana, preparara y agregara soya
     * Si no es vegetariana, preparara y agregara carne
     * Si la persona quiere queso, le pondra queso
     */
    void prepararPlatillo(){
        agregarPan();
        agregarMayonesa();
        agregarMostaza();
        if(esVegetariana() == true){
            prepararProteinaV();
            ponerProteinaV();
        } else{
        prepararProteina();
        ponerProteina();
        }
        if(conQueso()){
            agregarQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    /**
     * Añadimos el mensaje de:
     */
    void agregarPan(){
        System.out.println("Colocando pan...\n");
    }

    /**
     * Añadimos el mensaje de:
     */
    void agregarMayonesa(){
        System.out.println("Agregando mayonesa...\n");
    }

    /**
     * Añadimos el mensaje de:
     */
    void agregarMostaza(){
        System.out.println("Agregando mostaza...\n");
    }

    /**
     * Añadimos el mensaje de:
     */
    void ponerProteina(){
        System.out.println("Agregando carne...\n");
    }

    /**
     * Añadimos el mensaje de:
     * Esta es vegetariana
     */
    void ponerProteinaV(){
        System.out.println("Agregando deliciosa soya!...\n");
    }

    abstract void agregarQueso();

    /**
     * Añadimos el mensaje de:
     */
    void prepararProteina(){
        System.out.println("Preparando rica carne...\n");        
    }

    /**
     * Añadimos el mensaje de:
     * Esta es vegetariana
     */
    void prepararProteinaV(){
        System.out.println("Preparando rica soya...\n");        
    }

    /**
     * Verifica si la hamburguesa es vegetariana
     */
    boolean esVegetariana(){
        return esVegetariano;
    }

    /**
     * Verifica si es con queso. Las Hamburguesas vegetarianas no llevan queso
     */
    boolean conQueso(){
        return tieneQueso;
    }

    /**
     * Añadimos el mensaje de:
     */
    void ponerVegetales(){
        System.out.println("\nAgregando vegetales...\n");
    }

    /**
     * Añadimos el mensaje de:
     */
    void ponerCatsup(){
        System.out.println("Agregando catsup...\n");
    }

    /**
     * Añadimos el mensaje de:
     */
    void ponerPan(){
        System.out.println("Terminando hamburguesa deliciosa!\n");
    }

    @Override
    public String toString (){
        String cadena = id + " " + nombre + " \n"+ descripcion + " " + precio + " " + tieneQueso + " " + esVegetariano + " \n";
        return cadena;
    }

    public String darNombre(){
        return nombre;
    }
}