package trenes.controladores;

/**
 * Interfaz Activable.
 *
 * Esta interfaz representa a la funcionalidad de elementos que se puedan
 * activar o desactivar, es decir, apagar o encender, abrir o cerrar, etc. A los
 * elementos que puedan presentar dos estados.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 */
public interface Activable {

    /**
     * Definición del método para activación del elemento on
     *
     * @throws IllegalStateException si el elemto ya estaba activado
     */
    void on() throws IllegalStateException;

    /**
     * Definición del método para desactivación del elemento off
     *
     * @throws IllegalStateException si el elemento ya estaba desactivado
     */
    void off() throws IllegalStateException;
}
