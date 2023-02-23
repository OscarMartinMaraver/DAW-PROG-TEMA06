package trenes;

import trenes.controladores.Activable;
import trenes.controladores.ControlServicio;
import trenes.controladores.PuertaVagon;

/**
 * Clase VagonTren.
 *
 * Esta clase representa un vagon de tren donde se tiene un conjunto de
 * Controles de Servicio para controlar dicho vagón. Para ello esta clase cuenta
 * con un array de objetos de tipo ControlServicio.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 */
public class VagonTren {

    /**
     * Atributo companyiaTrenes.
     */
    protected String companyiaTrenes;

    /**
     * Atributo descripcion.
     */
    protected String descripcion;

    /**
     * Atributo servicios.
     */
    protected ControlServicio[] servicios;

    /**
     * Constructor con tres parámetros de VagonTren. Incluyendo el número de
     * controles. Este constructor inicializa el array de Controles de Servicio,
     * a tantos elementos como indica el parámetro que se pasa al constructor.
     *
     * @param companyiaTrenes Nombre de la compañía de trenes a la que pertenece
     * el vagón
     * @param descripcion Descripción del vagón
     * @param numControles Número de elementos ControlServicio que va a tener el
     * vagón
     */
    public VagonTren​(String companyiaTrenes, String descripcion, int numControles) {
        this.companyiaTrenes = companyiaTrenes;
        this.descripcion = descripcion;
        this.servicios = new ControlServicio[numControles];
    }

    /**
     * Constructor con tres parámetrosde ControlServicio para VagonTren.
     * Incluyendo el parámetro array de objetos de tipo ControlServicio. Este
     * constructor inicializa el array de Controles de Servicio, con el array
     * pasado como parámetro.
     *
     * @param companyiaTrenes Nombre de la compañía de trenes a la que pertenece
     * el vagón
     * @param descripcion Descripción del vagón
     * @param servicios Array de elementos ControlServicio que va a tener el
     * vagón
     */
    public VagonTren​(String companyiaTrenes, String descripcion, ControlServicio[] servicios) {
        this.companyiaTrenes = companyiaTrenes;
        this.descripcion = descripcion;
        this.servicios = servicios;
    }

    /**
     * Método observador (getter) que devuelve el nombre de la compañía de
     * trenes a la que pertenece el vagón
     *
     * @return companyiaTrenes Nombre de la compañía de trenes a la que
     * pertenece el vagón
     */
    public String getCompanyiaTrenes() {
        return this.companyiaTrenes;
    }

    /**
     * Método modificador (setter) que establece el nombre de la compañía de
     * trenes a la que pertenece el vagón
     *
     * @param companyiaTrenes Nombre de la compañía de trenes a la que pertenece
     * el vagón
     */
    public void setCompanyiaTrenes(String companyiaTrenes) {
        this.companyiaTrenes = companyiaTrenes;
    }

    /**
     * Método observador (getter) que devuelve la descripción del vagón
     *
     * @return descripcion Descripción del vagón
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Método modificador (setter) que establece la descripción del vagón
     *
     * @param descripcion Descripción del vagón
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método observador (getter) que devuelve el array de elementos
     * ControlServicio del vagón
     *
     * @return servicios array de elementos ControlServicio del vagón
     */
    public ControlServicio[] getServicios() {
        return this.servicios;
    }

    /**
     * Método modificador (setter) que establece el array de elementos
     * ControlServicio del vagón
     *
     * @param servicios Array de elementos ControlServicio del vagón.
     */
    public void setServicios​(ControlServicio[] servicios) {
        this.servicios = servicios;
    }

    /**
     * Método observador (getter) que devuelve el número de elementos de
     * Controles de Servicio del vagón
     *
     * @return número de servicios instalados en el vagón
     */
    public int getNumServicios() {
        return this.servicios.length;
    }

    /**
     * Método observador (getter) que devuelve numero de Controles de Servicio
     * de tipo Puerta del vagón
     *
     * @return numPuertas numero de Controles de Servicio de tipo Puerta del
     * vagón
     */
    public int getNumPuertasVagon() {
        int numPuertas = 0;
        for (int i = 0; i < this.servicios.length; i++) {
            if ("Puerta".equals(servicios[i].getTipoControlServicio())) {
                numPuertas++;
            }
        }
        return numPuertas;
    }

    /**
     * Método observador (getter) que devuelve numero de Controles de Servicio
     * de tipo Tira de Luz del vagón
     *
     * @return numTiraLuz numero de Controles de Servicio de tipo Tira de Luz
     * del vagón
     */
    public int getNumTiraLuz() {
        int numTiraLuz = 0;
        for (int i = 0; i < this.servicios.length; i++) {
            if ("Tiraluz".equals(servicios[i].getTipoControlServicio())) {
                numTiraLuz++;
            }
        }
        return numTiraLuz;
    }

    /**
     * Método observador (getter) que devuelve numero de Controles de Servicio
     * de tipo Ventanilla
     *
     * @return numVentanillas numero de Controles de Servicio de tipo Ventanilla
     * del vagón
     */
    public int getNumVentanillaVagon() {
        int numVentanillas = 0;
        for (int i = 0; i < this.servicios.length; i++) {
            if ("Ventanilla".equals(servicios[i].getTipoControlServicio())) {
                numVentanillas++;
            }
        }
        return numVentanillas;
    }

    /**
     * Método observador (getter) que devuelve numero de Controles de Servicio
     * de tipo Conjunto Altavoces
     *
     * @return numero de Controles de Servicio de tipo Conjunto Altavoces del
     * vagón
     */
    public int getNumConjuntoAltavoces() {
        int numAltavoces = 0;
        for (int i = 0; i < this.servicios.length; i++) {
            if ("Altavoz".equals(servicios[i].getTipoControlServicio())) {
                numAltavoces++;
            }
        }
        return numAltavoces;
    }

    /**
     * Método cerrarPuertas cierra todas las puertas del vagón. Es decir,
     * recorre el array de controles de servicio que presenta como atributo y en
     * caso de ser una instancia de PuertaVagon activa su método off(). Para
     * evitar errores se realiza un casting a PuertaVagon
     *
     */
    public void cerrarPuertas() {
        for (int i = 0; i < this.servicios.length; i++) {
            if (servicios[i] instanceof PuertaVagon) {// Para asegurarnos de que es una puerta del vagon
                // Si la variable elemento es una instancia de la clase PuertaVagon (además de serlo de ControlServicio, que es su superclase)

                try {
                    ((PuertaVagon) servicios[i]).off(); // Esto sí compila  
                    // Al "tratar" la variable como de tipo PuertaVagon, el compilador de Java permitirá realizar la operación
                } catch (IllegalStateException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
    }

    /**
     * Método activarTodosServicios activa todos los servicios del vagón. Es
     * decir, recorre el array de controles de servicio que presenta como
     * atributo y en caso de ser una instancia de la interfaz Activable activa
     * su método on(). Para evitar errores se realiza un casting a Activable
     */
    public void activarTodosServicios() {
        for (int i = 0; i < this.servicios.length; i++) {
            if (servicios[i] instanceof Activable) {
                // Estamos seguros de que la variable elemento implementa la interfaz Activable
                try {
                    ((Activable) servicios[i]).on();
                    // Al "tratar" la variable como de tipo "Activable", el compilador de Java permitirá realizar la operación
                } catch (IllegalStateException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    /**
     * Método toString devuelve un String listando todos y cada uno de los
     * controles de servicio del vagón. Es decir, recorre el array de controles
     * de servicio que presenta como atributo y muestra los datos de cada
     * elemento. Por último por último añade a la cadena a devolver el número de
     * controles configurados en la clase ControlServicio.
     *
     * @return Cadena con los controles de servicio del vagón
     */
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("El Vagón ").append(this.descripcion).append("\n");
        resultado.append("Pertenece a ").append(this.companyiaTrenes).append("\n");
        resultado.append("Presenta los siguientes controles de servicios: \n");
        resultado.append("\n");
        for (int i = 0; i < this.servicios.length; i++) {
            resultado.append(servicios[i].toString());
        }
        resultado.append("-----------------------------------------------------\n");
        resultado.append("Se tienen: ").append(ControlServicio.getNumControlesConfigurados()).append(" controles configurados\n");
        resultado.append("\n");
        return resultado.toString();
    }
}
