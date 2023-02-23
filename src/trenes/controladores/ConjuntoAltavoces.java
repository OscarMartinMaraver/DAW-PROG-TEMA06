package trenes.controladores;

/**
 * Clase ConjuntoAltavoces.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Modificable (implementa los métodos aumentar() y disminiur()). Representa un
 * determinado conjunto de altavoces de un vagon. Este control presenta como
 * atributos el nombre de la pista o melodía que se está reproduciendo, así como
 * el volumen de salida de sonido del conjunto de altavoces.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 *
 */
public final class ConjuntoAltavoces extends ControlServicio implements Modificable {

    /**
     * Atributo pistaReproduciendo.
     */
    protected String pistaReproduciendo;

    /**
     * Atributo volumenReproduccion.
     */
    protected int volumenReproduccion;

    /**
     * Constructor con tres parámetros de ConjuntoAltavoces. Este constructor
     * inicializa el nombre del controlDeServicio de la clase padre o superclase
     * con el atributo pasado en tercer lugar. Por otra parte se inicializa la
     * pista que se está reproduciendo con el String pasado como primer
     * parámetro Además se inicializa el volumen de reproducción según el valor
     * pasado como segundo parámetro. Y por último, asignamos al tipo de Control
     * de Servicio de la superclase o la clase padre el valor de "Altavoz",
     * identificando de esta forma el tipo de Control de servicio que es.
     *
     * @param pistaReproduciendo pista, melodía o locución de este tipo de
     * control de servicio.
     * @param volumenReproduccion Volumen de salida de sonido del conjunto de
     * altavoces.
     * @param nombreControlServicio nombre que se le va a asignar a este tipo de
     * control de Servicio.
     */
    public ConjuntoAltavoces​(String pistaReproduciendo, int volumenReproduccion, String nombreControlServicio) {
        super(nombreControlServicio);
        super.tipoControlServicio = "Altavoz";
        this.pistaReproduciendo = pistaReproduciendo;
        //EVITAR CREACIÓN OBJETO CON UN VALOR DE PARÁMETRO ERRONEO (mismo problema en clase TiraLuz y Ventanilla)
        //Para inicializar el parametro volumenReproduccion llamo al método que le asigna el valor si
        //este se encuentra entre el máximo y el mínimo establecido en la interfaz Modificable
        //setVolumenReproduccion(volumenReproduccion);
        this.volumenReproduccion = volumenReproduccion;
    }

    /**
     * Constructor con dos parámetros de ConjuntoAltavoces. Este constructor
     * inicializa el nombre del controlDeServicio de la clase padre o superclase
     * con el atributo pasado en segundo lugar. Por otra parte se inicializa la
     * pista que se está reproduciendo con el String pasado como primer
     * parámetro Además se inicializa el volumen de reproducción a cero. Y por
     * último, asignamos al tipo de Control de Servicio de la superclase o la
     * clase padre el valor de "Altavoz", identificando de esta forma el tipo de
     * Control de servicio que es.
     *
     * @param pistaReproduciendo pista, melodía o locución de este tipo de
     * control de servicio.
     * @param nombreControlServicio nombre que se le va a asignar a este tipo de
     * control de Servicio.
     */
    public ConjuntoAltavoces​(String pistaReproduciendo, String nombreControlServicio) {
        this(pistaReproduciendo, 0, nombreControlServicio);
    }

    /**
     * Método observador (getter) pista o melodia que se está reproduciendo
     *
     * @return pistaReproduciendo Pista en reproducción actualmente
     */
    public String getPistaReproduciendo() {
        return this.pistaReproduciendo;
    }

    /**
     * Método modificador (setter) que asigna el nombre de la nueva pista que se
     * va a reproducir en el control de servicio.
     *
     * @param pistaReproduciendo nombre de la nueva pista que se va a reproducir
     * en el control de servicio.
     */
    public void setPistaReproduciendo(String pistaReproduciendo) {
        this.pistaReproduciendo = pistaReproduciendo;
    }

    /**
     * Método observador (getter) volumen actual
     *
     * @return volumenReproduccion Volumen actual de reproducción
     */
    public int getVolumenReproduccion() {
        return this.volumenReproduccion;
    }

    /**
     * Método modificador (setter) que asigna nuevo volumen de reproducción para
     * este control de servicio. Este nuevo valor no se asigna si no está entre
     * 0 y 100 ambos inclusive
     *
     * @param volumenReproduccion - Nuevo volumen de reproducción.
     */
    public void setVolumenReproduccion(int volumenReproduccion) {
        if (volumenReproduccion <= Modificable.MAX && volumenReproduccion >= Modificable.MIN) {
            this.volumenReproduccion = volumenReproduccion;
        }
    }

    /**
     * Implementación del método de la interfaz Modificable para aumentar el
     * volumen en 1. En caso de estar en el valor máximo 100, no se aumenta
     *
     * @throws IllegalStateException si el altavoz ya está en su valor máximo de
     * volumen
     */
    @Override
    public void aumentar() throws IllegalStateException {
        if (this.volumenReproduccion < Modificable.MAX) {
            this.volumenReproduccion++;
        } else {
            throw new IllegalStateException("El volumen de reproducción ya está en su valor máximo (100%)");
        }
    }

    /**
     * Implementaión del método de la interfaz Modificable para disminiur el
     * volumen en 1. En caso de estar en el valor mínimo 0, no se disminuye
     *
     * @throws IllegalStateException si el altavoz ya está en su valor mínimo de
     * volumen
     */
    @Override
    public void disminuir() throws IllegalStateException {
        if (this.volumenReproduccion > Modificable.MIN) {
            this.volumenReproduccion--;
        } else {
            throw new IllegalStateException("El volumen de reproducción ya está en su valor mínimo (0%)");
        }
    }

    /**
     * Método toString devuelve un String con los valores actuales de los
     * atributos tanto de esta clase como de la superclase. Cada atributo
     * aparecerá en una línea y su tabulación
     *
     * @return Cadena con los valores de los atributos
     */
    @Override
    public String toString() {
        StringBuilder resultado;
        // Llamada al método “toString” de la superclase
        resultado = new StringBuilder(super.toString());
        // A continuación añadimos la información “especializada” de esta subclase
        resultado.append("    Conjunto Altavoces\n");
        resultado.append("	Sonido Reproduciendo: ").append(this.pistaReproduciendo).append("\n");
        resultado.append("	Volumen: ").append(this.volumenReproduccion).append("\n");
        return resultado.toString();
    }

}
