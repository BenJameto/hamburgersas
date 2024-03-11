/*
 * Clase que representa al robot encargado de la cocina en Mcburgers.
 */
class Robot {

    // Atributo para almacenar la orden recibida del cliente para comenzar a cocinar
    public Platillo orden;

    // Estado actual del robot
    private EstadoRobot estadoActual;

    // Menú del día
    private IterableCollection<Platillo> menuBasico;

    // Menú general
    private IterableCollection<Platillo> menuGeneral;

    // Menú de lujo
    private IterableCollection<Platillo> menuDeLujo;

    /**
     * Constructor para inicializar el robot.
     * Se establecen los estados y los menús disponibles.
     */
    public Robot(IterableCollection<Platillo> menuGeneral, IterableCollection<Platillo> menuBasico,
            IterableCollection<Platillo> menuDeLujo) {
        // Estados del robot
        estadoActual = new EstadoSuspendido(this);
        orden = null;

        // Menús disponibles
        this.menuGeneral = menuGeneral;
        this.menuBasico = menuBasico;
        this.menuDeLujo = menuDeLujo;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está suspendido.
     */
    public EstadoRobot getEstadoSuspendido() {
        return this.estadoActual;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está caminando.
     */
    public EstadoRobot getEstadoCaminando() {
        return this.estadoActual;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está atendiendo.
     */
    public EstadoRobot getEstadoAtendiendo() {
        return this.estadoActual;
    }

    /**
     * Obtiene el estado actual del robot y verifica si está cocinando.
     */
    public EstadoRobot getEstadoCocinando() {
        return this.estadoActual;
    }

    /**
     * Cambia el estado del robot.
     */
    public void setState(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Activa el robot.
     */
    public void activar() {
        estadoActual.activar();
    }

    /**
     * El robot comienza a caminar.
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * El robot inicia la atención al cliente.
     */
    public void atender() {
        estadoActual.atender();
    }

    /**
     * El robot comienza a cocinar.
     */
    public void cocinar() {
        estadoActual.cocinar();
    }

    /**
     * El robot cocina un platillo.
     * 
     * @param platillo Platillo a cocinar.
     */
    public void cocinar(Platillo platillo) {
        // Aquí debes implementar la lógica para cocinar el platillo
        platillo.prepararPlatillo();
    }

    /**
     * El robot se suspende.
     */
    public void suspender() {
        estadoActual.suspender();
    }

    /**
     * Imprime el menú del restaurante, incluyendo los menús general, del día y de
     * lujo.
     */
    public void imprimirMenuCompleto() {
        // Imprimir menú general
        System.out.println("---- Menú General ----");
        imprimirMenu(menuGeneral);

        // Imprimir menú del día
        System.out.println("---- Menú del Día ----");
        imprimirMenu(menuBasico);

        // Imprimir menú de lujo
        System.out.println("---- Menú de Lujo ----");
        imprimirMenu(menuDeLujo);
    }

    /**
     * Imprime los productos de un menú específico utilizando el iterador
     * proporcionado.
     * 
     * @param iterableCollection La colección iterable que contiene los platillos del menú.
     */
    public void imprimirMenu(IterableCollection<Platillo> iterableCollection) {
        Iterator<Platillo> iterador = iterableCollection.createIterator();
        while (iterador.hasNext()) {
            // Obtener el siguiente platillo del menú
            Platillo platillo = iterador.next();
            // Extraer información del platillo
            String id = platillo.id;
            String nombre = platillo.nombre;
            String descripcion = platillo.descripcion;
            System.out.println(id + " " + nombre + "\n" + descripcion);
        }
    }

    /**
     * Busca los productos de un menú específico utilizando su identificador.
     * 
     * @param id El identificador del producto a buscar.
     * @throws InvalidIdException Si el identificador no es válido o no se encuentra
     *                            en el menú.
     */
    public void buscarPlatillo(String id) throws InvalidIdException {
        Iterator<Platillo> iteradorGeneral = menuGeneral.createIterator();
        Iterator<Platillo> iteradorDelDia = menuBasico.createIterator();
        Iterator<Platillo> iteradorDeLujo = menuDeLujo.createIterator();

        while (iteradorGeneral.hasNext()) {
            Platillo platillo = iteradorGeneral.next();
            if (id.equals(platillo.id)) {
                this.orden = platillo;
                return;
            }
        }

        while (iteradorDelDia.hasNext()) {
            Platillo platillo = iteradorDelDia.next();
            if (id.equals(platillo.id)) {
                this.orden = platillo;
                return;
            }
        }
    }
}