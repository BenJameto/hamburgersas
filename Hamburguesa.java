import java.io.*;
/**
 * Clase abstracta que es constructor de Hamburguesa
 * @author @Clausyari
 * @author @axlducloux
 * @author @Benjameto
 * @date 2024.03.10
 */
public class Hamburguesa extends Platillo{

    /**
     * Constructor de Hamburguesa
     * @override
     */
    public Hamburguesa(String id, String nombre, String descripcion, double precio, boolean tieneQueso, boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    public void agregarQueso(){
        System.out.println("\nAgregando rico queso!");
    }
    
    /**
     * Preguntamos al cliente si quiere queso en su hamburguesa en caso de no ser vegetariana
     * @return
     */
    public boolean conQueso(){
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que solicita la respuesta del cliente respecto al queso
     * @return answer -- Lo que escriba el cliente
     */
    private String getUserInput(){
        String answer = null;
        System.out.print("Quieres queso en tu hamburguesa (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException ioe){
            System.err.println("Prueba de nuevo");
        } if (answer == null) {
            return "no";
        }
        return answer;
    }
}