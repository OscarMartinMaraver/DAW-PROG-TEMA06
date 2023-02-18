package trenes.controladores;

import java.util.Random;

/**
 * Clase TiraLuz.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Modificable (implementa los métodos aumentar() y disminiur()) y la interfaz
 * Activable (implementa los métodos on() y off()). Representa una tira o
 * columna de luces del vagón. Este control presenta como atributos un valor de
 * estado para saber si la tira está encendida o no. La ubicación de la tira de
 * luces. Un valor entero entre 0 y 100 para controlar la intensidad de la luz.
 * Así como, tres valores enteros entre 0 y 255 (ambos inclusive) para
 * determinar el color que se quiere establecer de la tira de luz, siguiendo el
 * sistema RGB (Rojo, Verde, Azul).
 *
 * Además para gestionar posibles funcionalidades aleatorias de la tira,
 * presenta un atributo de clase de tipo Random para generar esa aleatoriedad.
 *
 * @author David - IES Trassierra
 * @version 1.0
 */
public class TiraLuz {

    /*
     * Atributo aleatorio. 
     */

    
    
    /*
     * Atributo encendida.
     * 
     */

    
    
    /*
     * Atributo ubicacionTira. 
     */

    
    
    
    /*
     * Atributo intensidadTira. 
     */

    
    
    /*
     * Atributo colorAzul.
     */

    
    
    
    /*
     * Atributo colorVerde.
     */

    
    
    /*
     * Atributo colorRojo. 
     */

    
    
    /*
     * Constructor con siete parámetros de TiraLuz. 
     */


    
    
    /*
     * Constructor con cuatro parámetros de TiraLuz. 
     */

    
    

    /*
     * Método observador (getter) estado de la tira de luz
     *
     */


    /*
     * Método modificador (setter)  estado para la tira
     *
     * @param encendida valor booleano para el nuevo estado de la tira de luz.
     */


    /*
     * Método observador (getter)  ubicación de la tira
     */


    /*
     * Método modificador (setter)  nueva ubicación a la tira 
     */


    /*
     * Método observador (getter) que devuelve la intensidad de brillo 
     */


    /*
     * Método modificador (setter)  nueva intensidad de brillo     
     */


    /*
     * Método observador (getter)cantidad de color azul 
     */


    /*
     * Método modificador (setter) cantidad de color azul 
     */

    

    /*
     * Método observador (getter) la cantidad de color verde 
     */


    /*
     * Método modificador (setter) cantidad de color verde 
     */


    /*
     * Método observador (getter) cantidad de color rojo
     */


    /*
     * Método modificador (setter) color rojo 
     */

    
    
    /*
     * Método estático generarColorAleatorio 
     */


    /*
     * Método cambiarColorTira sin parámetros 
     */


    /*
     * Método cambiarColorTira que asigna valores pasados como parámetro para
     * cambiar los valores de los atributos rojo, verde y azul 
     */


    /*
     * Implementaión del método de la interfaz Modificable para aumentar la
     * intensidad en 10 unidades.
     */


    /*
     * Implementaión del método de la interfaz Modificable para disminiur la
     * intensidad en 10 unidades. 
     */


    /*
     * Implementaión del método de la interfaz Activable para encender control
     * de servicio, 
     */


    /*
     * Implementaión del método de la interfaz Activable para apagar control de
     * servicio
     */


    /*
     * Método toString 
     */


}
