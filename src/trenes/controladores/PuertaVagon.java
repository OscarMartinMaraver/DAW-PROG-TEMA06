package trenes.controladores;

/**
 * Clase PuertaVagon.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Activable (implementa los métodos on() y off()). Representa una puerta del
 * vagón. Este control presenta como atributos un valor de estado para saber si
 * la puerta está cerrada o no. La ubicación de la puerta.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 */
public final class PuertaVagon extends ControlServicio implements Activable {

    /*
     * Atributo estadoPuertaCerrada. 
     */
    protected boolean estadoPuertaCerrada;

    /*
     * Atributo ubicacionPuerta. 
     */
    protected String ubicacionPuerta;

    /**
     * Constructor con tres parámetros de PuertaVagon. Este constructor
     * inicializa el nombre del controlDeServicio de la clase padre o superclase
     * con el atributo pasado en tercer lugar. Por otra parte se inicializa el
     * estado de la puerta para establecer si está cerrada o no pasado como
     * primer parámetro. Como segundo parámetro se pasa la ubicación de la
     * puerta. Por último, se asigna al tipo de Control de Servicio de la
     * superclase o la clase padre el valor de "Puerta", identificando de esta
     * forma el tipo de Control de servicio que es.
     *
     * @param estadoPuertaCerrada Estado de la puerta
     * @param ubicacionPuerta Ubicación de la puerta
     * @param nombreControlServicio Nombre que se asgina a la puerta
     */
    public PuertaVagon(boolean estadoPuertaCerrada, String ubicacionPuerta, String nombreControlServicio) {
        super(nombreControlServicio);
        super.tipoControlServicio = "Puerta";
        this.estadoPuertaCerrada = estadoPuertaCerrada;
        this.ubicacionPuerta = ubicacionPuerta;

    }

    /**
     * Constructor con dos parámetros de PuertaVagon.Este constructor inicializa
     * el nombre del controlDeServicio de la clase padre o superclase con el
     * atributo pasado en segundo lugar. Por otra parte se inicializa la
     * ubicación de la puerta. Dentro del constructor se establece el estado de
     * la puerta a "cerrado". Por último, se asigna al tipo de Control de
     * Servicio de la superclase o la clase padre el valor de "Puerta",
     * identificando de esta forma el tipo de Control de servicio que es.
     *
     * @param ubicacionPuerta Ubicación de la puerta
     * @param nombreControlServicio Nombre que se asgina a la puerta
     */
    public PuertaVagon(String ubicacionPuerta, String nombreControlServicio) {
        this(true, ubicacionPuerta, nombreControlServicio);
    }

    /**
     * Método observador (getter) estado de la puerta
     *
     * @return estadoPuertaCerrada Estado de la puerta.
     */
    public boolean isEstadoPuertaCerrada() {
        return estadoPuertaCerrada;
    }

    /**
     * Método modificador (setter) que asigna el estado booleando para la
     * puerta, para establecer si está cerrada o abierta.
     *
     * @param estadoPuertaCerrada valor booleano para el nuevo estado de la
     * puerta.
     */
    public void setEstadoPuertaCerrada​(boolean estadoPuertaCerrada) {
        this.estadoPuertaCerrada = estadoPuertaCerrada;
    }

    /**
     * Método observador (getter) ubicación de la puerta
     *
     * @return ubicacionPuerta Ubicación de la puerta.
     */
    public String getUbicacionPuerta() {
        return ubicacionPuerta;
    }

    /**
     * Método modificador (setter) nueva ubicación a la puerta
     *
     * @param ubicacionPuerta Cadena que representa la ubicación de la puerta.
     */
    public void serUbicacionPuerta(String ubicacionPuerta) {
        this.ubicacionPuerta = ubicacionPuerta;
    }

    /**
     * Implementaión del método de la interfaz Activable para abrir la puerta
     * del vagón del control de servicio, se establece el valor de
     * estadoPuertaCerrada a false.
     *
     * @throws IllegalStateException si la puerta ya está abierta
     */
    @Override
    public void on() throws IllegalStateException {
        if (this.estadoPuertaCerrada) {
            this.estadoPuertaCerrada = false;
        } else {
            throw new IllegalStateException("Error: La puerta ya está abierta.");
        }
    }

    /**
     * Implementaión del método de la interfaz Activable para cerrar la puerta
     * del vagón del control de servicio, se establece el valor de
     * estadoPuertaCerrada a true.
     */
    @Override
    public void off() throws IllegalStateException {
        if (!this.estadoPuertaCerrada) {
            this.estadoPuertaCerrada = true;
        } else {
            throw new IllegalStateException("Error: La puerta ya está cerrada.");
        }
    }

    /**
     * Método toString devuelve un String con los valores actuales de los
     * atributos tanto de esta clase como de la superclase. Cada atributo
     * aparecerá en una línea y su tabulación
     * @return Cadena con los valores de los atributos
     */
    @Override
    public String toString() {
        StringBuilder resultado;
        // Llamada al método “toString” de la superclase
        resultado = new StringBuilder(super.toString());
        // A continuación añadimos la información “especializada” de esta subclase
        resultado.append("	Puerta Vagon Tren\n");
        resultado.append("		Puerta: ").append(this.estadoPuertaCerrada).append("\n");
        resultado.append("		Ubicacion Puerta: ").append(this.ubicacionPuerta).append("\n");
        return resultado.toString();
    }
}
