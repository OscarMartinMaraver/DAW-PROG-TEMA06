package trenes.controladores;

/**
 * Interfaz Modificable.
 *
 * Esta interfaz representa a la funcionalidad de elementos que se puedan
 * cambiar o modificar su estado aumentando o disminuyendo algún parámetro, es
 * decir, subir o bajar el volumen, aumentar o disminuir la intensidad,
 * opacidad, etc. A los elementos que puedan presentar variaciones de valor en
 * algún parámetro.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 */
public interface Modificable {

    /**
     * Mínimo valor posible para el estado del control de servicio: 0
     */
    
    static final int MIN=0;
    
    
    /**
     * Máxima valor posible para el estado del control de servicio:100
     */

    static final int MAX=100;
    
    /**
     * Definición del método para aumentar un parámetro
     * @throws IllegalStateException si el elemento ya está en su valor máximo
     */

    void aumentar() throws IllegalStateException;
    
    /**
     * Definición del método para disminuir un parámetro
     * @throws IllegalStateException si el elemento ya está en su valor mínimo
     */
    
    void disminuir()throws IllegalStateException;;

}
