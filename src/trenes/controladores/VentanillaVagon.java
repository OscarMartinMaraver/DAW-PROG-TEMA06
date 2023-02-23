package trenes.controladores;

/**
 * Clase VentanillaVagon.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Modificable (implementa los métodos aumentar() y disminiur()). Representa una
 * ventanilla del vagón. Este control presenta como atributos un valor que
 * marcará el porcentaje de opacidad de la ventanilla siendo el 0 transparente y
 * el 100 completamente opaco. La ubicación de la ventanilla.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 */
public final class VentanillaVagon extends ControlServicio implements Modificable {

    /**
     * Atributo opacidadVentanilla.
     */
    protected int opacidadVentanilla;

    /**
     * Atributo ubicacionVentanilla.
     */
    protected String ubicacionVentanilla;

    /**
     * Constructor con tres parámetros de VentanillaVagon. Este constructor
     * inicializa el nombre del controlDeServicio de la clase padre o superclase
     * con el atributo pasado en tercer lugar. Por otra parte se inicializa la
     * opacidad de la ventanilla con el parámetro pasado como primer parámetro
     * Además se inicializa la ubicación según el valor String pasado como
     * segundo parámetro. Asignamos al tipo de Control de Servicio de la
     * superclase o la clase padre el valor de "Ventanilla", identificando de
     * esta forma el tipo de Control de servicio que es.
     *
     * @param opacidadVentanilla Porcentaje de opacidad
     * @param ubicacionVentanilla Ubicación de la ventanilla
     * @param nombreControlServicio Nombre que se le va a asignar a este tipo de
     * control de Servicio.
     */
    public VentanillaVagon​(int opacidadVentanilla, String ubicacionVentanilla, String nombreControlServicio) {
        super(nombreControlServicio);
        super.tipoControlServicio = "Ventanilla";
        this.opacidadVentanilla = opacidadVentanilla;
        this.ubicacionVentanilla = ubicacionVentanilla;
    }

    /**
     * Constructor con dos parámetros de VentanillaVagon. Este constructor
     * inicializa el nombre del controlDeServicio de la clase padre o superclase
     * con el atributo pasado en segundo lugar. Además se inicializa la
     * ubicación según el valor String pasado como primer parámetro. Asignamos
     * al tipo de Control de Servicio de la superclase o la clase padre el valor
     * de "Ventanilla", identificando de esta forma el tipo de Control de
     * servicio que es. Establecemos la opacidad en 0 (aporvechando así el
     * constructor de 3 paraámetros.
     *
     * @param ubicacionVentanilla Ubicación de la ventanilla
     * @param nombreControlServicio nombre que se le va a asignar a este tipo de
     * control de Servicio.
     */
    public VentanillaVagon​(String ubicacionVentanilla, String nombreControlServicio) {
        this(0, ubicacionVentanilla, nombreControlServicio);
    }

    /**
     * Método observador (getter) que devuelve el porcentaje de opacidad de la
     * ventana
     *
     * @return opacidadVentanilla Porcentaje de opacidad de la ventana
     */
    public int getOpacidadVentanilla() {
        return this.opacidadVentanilla;
    }

    /**
     * Método modificador (setter) que establece el nuevo el porcentaje de
     * opacidad de la ventana. Este valor se asignará si su valor está
     * comprendido entre MIN y MAX de la interfaz Activable ambos inclusive.
     *
     * @param opacidadVentanilla Porcentaje de opacidad de la ventana
     */
    public void setOpaciadVentanilla(int opacidadVentanilla) {
        if (this.opacidadVentanilla >= Modificable.MIN && this.opacidadVentanilla <= Modificable.MAX) {
            this.opacidadVentanilla = opacidadVentanilla;
        }
    }

    /**
     * Método observador (getter) ubicación de la ventana
     *
     * @return ubicacionVentanilla Ubicación de la ventana.
     */
    public String getUbicacionVentanilla() {
        return this.ubicacionVentanilla;
    }

    /**
     * Método modificador (setter) que establece la nueva ubicación a la
     * ventana.
     *
     * @param ubicacionVentanilla Cadena que representa la ubicación de la
     * ventana.
     */
    public void setUbicacionVentanilla(String ubicacionVentanilla) {
        this.ubicacionVentanilla = ubicacionVentanilla;
    }

    /**
     * Implementaión del método de la interfaz Modificable para aumentar la
     * opacidad de la ventanilla en 5 unidades. No puede superar el valor máximo
     * 100
     *
     * @throws IllegalStateException si ventanilla ya está en su valor máximo de
     * opacidad
     */
    @Override
    public void aumentar() throws IllegalStateException {
        if (this.opacidadVentanilla <= Modificable.MAX - 5) { //si el valor de intesidad actual fuera >95, al sumarle 5 superaria el máximo establecido
            this.opacidadVentanilla = this.opacidadVentanilla + 5;
        } else {
            throw new IllegalStateException("La opacidad de la ventanilla ya está en su valor máximo (100%)");
        }
    }

    /*
     * Implementaión del método de la interfaz Modificable para disminiur la
     * opacidad de la ventanilla en 5 unidades. 
     */
    @Override
    public void disminuir() throws IllegalStateException {
        if (this.opacidadVentanilla >= Modificable.MIN + 5) { //si el valor de intesidad actual fuera <5, al restarle 5 superaria el mínimo establecido
            this.opacidadVentanilla = this.opacidadVentanilla - 5;
        } else {
            throw new IllegalStateException("La opacidad de la ventanilla ya está en su valor mínimo (0%)");
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
        resultado.append("    Ventanilla Vagon Tren\n");
        resultado.append("    	Opacidad: ").append(this.opacidadVentanilla).append("\n");
        resultado.append("    	Ubicacion Ventanilla: ").append(this.ubicacionVentanilla).append("\n");
        return resultado.toString();
    }

}
