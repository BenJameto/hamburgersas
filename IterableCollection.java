/**
 * IterableCollection
 */
public interface IterableCollection<T> extends Iterable<T> {

    /**
     * Crea un iterador para recorrer la colección.
     * 
     * @return un iterador para la colección.
     */
    Iterator<T> createIterator();

    /**
     * Verifica si hay un siguiente elemento en la colección.
     * 
     * @return true si hay un siguiente elemento, false de lo contrario.
     */
    boolean hasNext();

    /**
     * Devuelve el siguiente elemento en la colección.
     * 
     * @return el siguiente elemento en la colección.
     */
    T next();
}