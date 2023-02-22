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
public final class TiraLuz extends ControlServicio implements Activable, Modificable {

    /*
     * Atributo aleatorio. 
     */
    
    protected static Random aleatorio;
    
    /*
     * Atributo encendida.
     */
    
    protected boolean encendida;
    
    /*
     * Atributo ubicacionTira. 
     */

    protected String ubicacionTira;
    
    
    /*
     * Atributo intensidadTira. 
     */

    protected int intensidadTira;
    
    /*
     * Atributo colorAzul.
     */

    protected int colorAzul;
    
    
    /*
     * Atributo colorVerde.
     */

    protected int colorVerde;
    
    /*
     * Atributo colorRojo. 
     */

    protected int colorRojo;
    
    /**
     * Constructor con siete parámetros de TiraLuz. Este constructor inicializa 
     * el nombre del controlDeServicio de la clase padre o superclase con el 
     * atributo pasado en septimo lugar. Por otra parte se inicializa el estado 
     * de la tira para establecer si está encendida o no pasado como primer parámetro. 
     * Como segundo parámetro se pasa la ubicación de la tira de luces. Además se 
     * inicializa la intensidad de luz de la tira según el valor pasado como tercer 
     * parámetro. Los parámetros cuarto, quinto y sexto sirven para inicializar el color 
     * de la tira de luz con los respectivos valores rojo, verde y azul. Y por último, 
     * se asigna al tipo de Control de Servicio de la superclase o la clase padre el valor 
     * de "TiraLuz", identificando de esta forma el tipo de Control de servicio que es.
     * 
     * @param encendida Parámetro que establecerá el estado de la tira de liz, encendido o apagado
     * @param ubicacionTira Parámetro que define la ubicación de la tira de luz
     * @param intensidadTira Parámetro para definir la intensidad de brillo de la tira de luz
     * @param colorAzul Cantidad de color azul en el sistema RGB para la tira de luz
     * @param colorVerde Cantidad de color verde en el sistema RGB para la tira de luz
     * @param colorRojo Cantidad de color rojo en el sistema RGB para la tira de luz
     * @param nombreControlServicio Nombre que se asgina a la tira de luz
     */

    public TiraLuz​(boolean encendida, String ubicacionTira, int intensidadTira, 
            int colorAzul, int colorVerde, int colorRojo, String nombreControlServicio){
        super(nombreControlServicio);
        super.tipoControlServicio = "Tiraluz";
        this.encendida=encendida;
        this.ubicacionTira=ubicacionTira;
        this.intensidadTira=intensidadTira;
        this.colorAzul=colorAzul;
        this.colorVerde=colorVerde;
        this.colorRojo=colorRojo;        
    }
    
    
    /**
     * Constructor con cuatro parámetros de TiraLuz. Este constructor inicializa el nombre 
     * del controlDeServicio de la clase padre o superclase con el atributo pasado en cuarto 
     * lugar. Por otra parte se inicializa el estado de la tira para establecer si está encendida 
     * o no pasado como primer parámetro. Como segundo parámetro se pasa la ubicación de la tira 
     * de luces. Además se inicializa la intensidad de luz de la tira según el valor pasado como 
     * tercer parámetro. Los valores para el color Rojo, Verde y Azul se generarán automáticamente 
     * con valores entre 0 y 255. Y por último, se asigna al tipo de Control de Servicio de la superclase 
     * o la clase padre el valor de "TiraLuz", identificando de esta forma el tipo de Control de servicio que es. 
     * 
     * @param encendida Parámetro que establecerá el estado de la tira de liz, encendido o apagado
     * @param ubicacionTira Parámetro que define la ubicación de la tira de luz
     * @param intensidadTira Parámetro para definir la intensidad de brillo de la tira de luz
     * @param nombreControlServicio Nombre que se asgina a la tira de luz
     */

    public TiraLuz​(boolean encendida,String ubicacionTira,
            int intensidadTira,String nombreControlServicio){
        this(encendida,ubicacionTira, intensidadTira, TiraLuz.generarColorAleatorio(), 
                TiraLuz.generarColorAleatorio(),TiraLuz.generarColorAleatorio(),nombreControlServicio);
    }
    

    /**
     * Método observador (getter) estado de la tira de luz
     * 
     * @return encendida Estado de la tira de luz.
     */
    public boolean isEncendida(){
        return this.encendida;
    }

    /**
     * Método modificador (setter) que asigna el estado booleando para la tira de luz, 
     * para establecer si está encendida o apagada
     * 
     * @param encendida valor booleano para el nuevo estado de la tira de luz.
     */
    public void setEncendida​(boolean encendida){
        this.encendida=encendida;
    }

    /**
     * Método observador (getter)  ubicación de la tira
     * 
     * @return ubicacionTira Ubicación de la tira de luz.
     */
    public String getUbicacionTira(){
        return this.ubicacionTira;
    }

    /**
     * Método modificador (setter)  nueva ubicación a la tira 
     * 
     * @param ubicacionTira Cadena que representa la ubicación de la tira de luz.
     */
    public void setUbicacionTira(String ubicacionTira){
        this.ubicacionTira=ubicacionTira;
    }

    /**
     * Método observador (getter) que devuelve la intensidad de brillo
     * 
     * @return intensidadTira Intensidad de brillo de la tira de luz.
     */
    public int getIntesidadTira(){
        return this.intensidadTira;
    }

    /**
     * Método modificador (setter) que establece la nueva intensidad de brillo 
     * la tira de luz. Este valor se asignará si su valor está comprendido entre 
     * 0 y 100 ambos inclusive.
     * 
     * @param intesidadTira Intensidad de brillo de la tira de luz.
     */
    public void setIntesidadTira(int intesidadTira){
        if(intesidadTira>=Modificable.MIN&&intesidadTira<=Modificable.MAX){
        this.intensidadTira=intesidadTira;
        }
    }

    /**
     * Método observador (getter) que devuelve el valor de la cantidad de color 
     * azul de la tira de luz
     * 
     * @return colorAzul Cantidad de color azul de la tira de luz.
     */
    public int getColorAzul(){
        return this.colorAzul;
    }

    /**
     * Método modificador (setter) que establece la cantidad de color azul de la tira de luz. 
     * Este valor se asignará si su valor está comprendido entre 0 y 255 ambos inclusive.
     * 
     * @param colorAzul  Cantidad de color azul de la tira de luz.
     */
    public void setColorAzul(int colorAzul){
        if(colorAzul>=0&&colorAzul<=255){
            this.colorAzul=colorAzul;
        }
    }
    

    /**
     * Método observador (getter) que devuelve el valor de la cantidad de color 
     * verde de la tira de luz
     * 
     * @return colorVerde Cantidad de color verde de la tira de luz.
     */
    public int getColorVerde(){
        return this.colorVerde;
    }

    /**
     * Método modificador (setter) que establece la cantidad de color verde de la tira de luz. 
     * Este valor se asignará si su valor está comprendido entre 0 y 255 ambos inclusive.
     * 
     * @param colorVerde  Cantidad de color verde de la tira de luz.
     */
    public void setColorVerde(int colorVerde){
        if(colorVerde>=0&&colorVerde<=255){
            this.colorVerde=colorVerde;
        }
    }

    /**
     * Método observador (getter) que devuelve el valor de la cantidad de color 
     * rojo de la tira de luz
     * 
     * @return colorRojo Cantidad de color rojo de la tira de luz.
     */
    public int getColorRojo(){
        return this.colorRojo;
    }


    /**
     * Método modificador (setter) que establece la cantidad de color rojo de la tira de luz. 
     * Este valor se asignará si su valor está comprendido entre 0 y 255 ambos inclusive.
     * 
     * @param colorRojo  Cantidad de color rojo de la tira de luz.
     */
    public void setColorRojo(int colorRojo){
        if(colorRojo>=0&&colorRojo<=255){
            this.colorRojo=colorRojo;
        }
    }
    
    
    /**
     * Método estático generarColorAleatorio que genera un valor entero aleatorio entre 1 y 255, 
     * que nos ayudará a asignar valores a los colores de las tiras de luz
     * 
     * @return colorAleatorio Numero entero que corresponde a un código de color
     */
    private static int generarColorAleatorio(){
        aleatorio=new Random();
        return aleatorio.nextInt(255)+1;
    }

    /**
     * Método cambiarColorTira sin parámetros que genera valores aleatorios para cambiar los valores 
     * de los atributos rojo, verde y azul de la tira de luz
     */
    public void cambiarColorTira(){
       cambiarColorTira(generarColorAleatorio(),generarColorAleatorio(),generarColorAleatorio()); 
    }

    /**
     * Método cambiarColorTira que asigna valores pasados como parámetro para
     * cambiar los valores de los atributos rojo, verde y azul 
     * 
     * @param rojo Cantidad de color rojo
     * @param verde Cantidad de color verde
     * @param azul Cantidad de color azul
     */
    public void cambiarColorTira​(int rojo, int verde, int azul){
        setColorRojo(rojo);
        setColorVerde(verde);
        setColorAzul(azul);
    }

    /**
     * Implementaión del método de la interfaz Modificable para aumentar la
     * intensidad en 10 unidades. En caso de estar en el valor máximo 100, no se aumenta
     * 
     * @throws IllegalStateException si la tira de luz ya está en su valor máximo
     */
    @Override
    public void aumentar() throws IllegalStateException{
        if(this.intensidadTira<=Modificable.MAX-10){ //si el valor de intesidad actual fuera >90, al sumarle 10 superaria el máximo establecido
            this.intensidadTira=this.intensidadTira+10;
        }else{
            throw new IllegalStateException ("La tira de luz ya está en su valor máximo");
        }
    }

    /**
     * Implementaión del método de la interfaz Modificable para disminiur la
     * intensidad en 10 unidades. En caso de estar en el valor mínimo 0, no se disminuye
     * 
     * @throws IllegalStateException si la tira de luz ya está en su valor mínimo
     */
    @Override
    public void disminuir() throws IllegalStateException{
        if(this.intensidadTira>=Modificable.MIN+10){ //si el valor de intesidad actual fuera <10, al restarle 10 superaria el mínimo establecido
            this.intensidadTira=this.intensidadTira-10;
        }else{
            throw new IllegalStateException ("La tira de luz ya está en su valor mínimo");
        }
    }

    /**
     * Implementaión del método de la interfaz Activable para encender control de servicio, 
     * se establece el valor de encendida a true.
     * 
     * @throws IllegalStateException si la tira de luz ya está encendida
     */
    @Override
    public void on() throws IllegalStateException{
        if(!this.encendida){
            this.encendida=true;
        }else{
            throw new IllegalStateException ("Tira luz ya encendida");
        }   
    }

    /**
     * Implementaión del método de la interfaz Activable para apagar control de servicio, 
     * se establece el valor de encendida a false.
     * 
     * @throws IllegalStateException si la tira de luz ya está apagada
     */
    @Override
    public void off()throws IllegalStateException{
        if(this.encendida){
            this.encendida=false;
        }else{
            throw new IllegalStateException ("Tira luz ya apagada");
        }    
    }

    /**
     * Método toString devuelve un String con los valores actuales de los atributos tanto 
     * de esta clase como de la superclase. Cada atributo aparecerá en una línea y su tabulación
     * 
     * @return Cadena con los valores de los atributos
     */
    @Override
    public String toString(){
         StringBuilder resultado;
        // Llamada al método “toString” de la superclase
        resultado = new StringBuilder(super.toString());
        // A continuación añadimos la información “especializada” de esta subclase
        resultado.append("    Luz\n");
        resultado.append("    	 Tira Luz: ").append((this.encendida)? "Encendida":"Apagada").append("\n");
        resultado.append("       Ubicacion Tira Luz: ").append(this.ubicacionTira).append("\n");
        resultado.append("       Intensidad Luz: ").append(this.intensidadTira).append("\n");
        resultado.append("       Color RGB: ").append(this.colorRojo+", "+this.colorVerde+", "+this.colorAzul).append("\n");
        return resultado.toString();
    }

}
