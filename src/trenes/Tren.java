package trenes;

import trenes.controladores.ConjuntoAltavoces;
import trenes.controladores.ControlServicio;
import trenes.controladores.Modificable;
import trenes.controladores.PuertaVagon;
import trenes.controladores.TiraLuz;
import trenes.controladores.VentanillaVagon;

/**
 * Clase Lanzadera de la aplicación. Esta clase Tren contiene el método main
 * para realizar la ejecución del proyecto.
 *
 * @author Oscar Martín Maraver
 * @version 1.0
 *
 */
public class Tren {

    public static void main(String[] args) {

        /* 1. Crear un array de 10 objetos tipo Control Servicio en una variable llamada
         controlesVagon
         */
        ControlServicio[] controlesVagon;
        controlesVagon = new ControlServicio[10];

        /*2. Creamos dos objetos ConjuntoAltavoces, y los agregamos al array en las
         posiciones 0 y 1 del mismo
         */
        controlesVagon[0] = new ConjuntoAltavoces("Melodía Renfe", 0, "Vagon 1 Altavoces Techo");
        controlesVagon[1] = new ConjuntoAltavoces("Melodía Renfe", 0, "Vagon 1 Altavoces Laterales");

        /* 3. Creamos dos objetos PuertaVagonTren, y los agregamos al array en las
         posiciones 2 y 3 del mismo
         */
        controlesVagon[2] = new PuertaVagon(true, "Vagon 1 Trasera", "Puerta Trasera");
        controlesVagon[3] = new PuertaVagon(true, "Vagon 1 Delantera", "Puerta Delantera");

        /* 4. Creamos cuatro objetos VentanillaVagon, y los agregamos al array en las
         posiciones 4,5,6 y 7 del mismo        
         */
        controlesVagon[4] = new VentanillaVagon(0, "Vagon 1 Ventanilla Delantera Izquierda", "VDI");
        controlesVagon[5] = new VentanillaVagon(0, "Vagon 1 Ventanilla Trasera Izquierda", "VTI");
        controlesVagon[6] = new VentanillaVagon(0, "Vagon 1 Ventanilla Delantera Derecha", "VDD");
        controlesVagon[7] = new VentanillaVagon(0, "Vagon 1 Ventanilla Trasera Derecha", "VTD");

        /* 5. Creamos dos objetos TiraLuz, y los agregamos al array en las posiciones 8
         y 9 del mismo        
         */
        controlesVagon[8] = new TiraLuz(true, "Vagon 1 Tira Izquierda", 0, 166, 44, 161, "Tira Luz Izquierda");
        controlesVagon[9] = new TiraLuz(true, "Vagon 1 Tira Derecha", 0, 108, 225, 231, "Tira Luz Derecha");

        /* 6. Se instancia o crea un objeto de tipo VagonTren. Para ello utilizamos, el
	   constructor de VagonTren al que se le pasa como parámetro el array de
	   objetos de tipo ControlServicio
         */
        VagonTren vagon = new VagonTren("Renfe", "Numero 2138", controlesVagon);

        /*
	 * 7. Se imprime el objeto de tipo VagonTren. Para ello directamente imprimimos
	 * el objeto (ya que al tener creado el método toString() imprimirá toda la
	 * información)
         */
        System.out.println(vagon.toString());

        /*
	 * 8. Mediante un bucle recorremos el array de objetos de tipo ControlServicio
	 * que hay en el objeto de tipo VagonTren creado anteriormente en el punto 6, y
	 * en el caso de que el objeto sea una instancia con interfaz "Modificable", se
	 * llamará al método aumentar() para que cada tipo de control de servicio
	 * ejecute el código correspondiente a la implementación de dicha interfaz. En
	 * el caso de que no sea una instancia con interfaz modificable, comprobamos si
	 * es una instancia de la clase TiraLuz, en cuyo caso, se realizan dos acciones
	 * por un lado cambiar el color de la tira (cambiarColorTira() sin parámetros)
	 * por otro lado la llamada al método on, para encender todas las Tiras de Luz
         */
        for (int i = 0; i < controlesVagon.length; i++) {
            if (controlesVagon[i] instanceof Modificable) {
                try {
                    ((Modificable) controlesVagon[i]).aumentar();
                } catch (IllegalStateException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                if (controlesVagon[i] instanceof TiraLuz) {
                    try {
                        ((TiraLuz) controlesVagon[i]).cambiarColorTira();
                        ((TiraLuz) controlesVagon[i]).on();
                    } catch (IllegalStateException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }

        /*
	 * 9. Nuevamente se imprime el objeto de tipo VagonTren para ver los cambios
	 * realizados. Para ello directamente imprimimos el objeto (ya que al tener
	 * creado el método toString() imprimirá toda la información)
         */
        System.out.println(vagon.toString());

        /* 10. Se realiza la llamada al método preparado para cerrar todas las puertas, 
         * implementado en la clase VagonTren. Si se quiere hacer de otra forma 
         * también se puede mediante un bucle recorremos el array de objetos de tipo 
         * PuertaVagonTren en el que hay en el objeto de tipo VagonTren creado anteriormente
         * en el punto 6, abrimos todas las PuertaVagonTren, para ello debemos comprobar
         * si cada elemento del array es una instancia del tipo PuertaVagonTren, y
	 * posteriormente llamar al método on()
         */
        //FORMA UNO
        vagon.cerrarPuertas(); //EL BOLBQUE TRY-CATCH ESTÁ IMPLEMENTADO DENTRO DEL MÉTODO  cerrarPuestas()

        /*
        //FORMA DOS
        
        for (int i=0; i<controlesVagon.length; i++){
            if(controlesVagon[i] instanceof PuertaVagon){
                try{
                ((PuertaVagon) controlesVagon[i]).off(); 
                }catch (IllegalStateException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
         */
        /*
	 * 11. Nuevamente se imprime el objeto de tipo VagonTren para ver los cambios
	 * realizados. Para ello directamente imprimimos el objeto (ya que al tener
	 * creado el método toString() imprimirá toda la información)
         */
        System.out.println(vagon.toString());

        /* 12. Se realiza la llamada al método preparado para activar todos los 
         * controles de servicio implementado en la clase VagonTren. 
         */
        vagon.activarTodosServicios();//EL BOLBQUE TRY-CATCH ESTÁ IMPLEMENTADO DENTRO DEL MÉTODO activarTodosServicios()

        /*
	 * 13. Nuevamente se imprime el objeto de tipo VagonTren para ver los cambios
	 * realizados. Para ello directamente imprimimos el objeto (ya que al tener
	 * creado el método toString() imprimirá toda la información)
         */
        System.out.println(vagon.toString());

    }

}
