package trenes.controladores;


/**
 * Clase abstracta ControlServicio. Servirá para agrupar todas las
 * características comunes a los diferentes controles que pueda presentar cada
 * vagón del tren.
 * No es instanciable.
 * 
 * @author Oscar Martín Maraver
 * @version 1.0
 */

public abstract class ControlServicio {

	/*
	 * Atributo de clase numControlesConfigurados. 
         * 
	 */

    protected static long numControlesConfigurados=0;
    
	/*
	 * Atributo inmutable idControlServicio. 
	 */

    protected long idControlServicio;
    
    
	/*
	 * Atributo nombreControlServicio.
	 */
    protected String nombreControlServicio;
    
    
	/*
	 * Atributo tipoControlServicio. 
	 */
    
    protected String tipoControlServicio;
    

	/**
         * Constructor con un parámetro de ControlServicio. Este constructor simplemente 
         * recibe un nombre de control de servicio para asignarlo al control que se va a 
         * crear. Automáticamente asignar el identificador de Control de Servicio (idControlServicio) 
         * a partir del número de controles existentes ya configurados. Y asigna como tipo de Control 
         * de servicio (tipoControlServicio) el valor "Desconocido"
         * @param nombreControlServicio Cadena con el nombre a asignar a este control
	 */

    public ControlServicio(String nombreControlServicio){
        this.nombreControlServicio=nombreControlServicio;
        this.idControlServicio=numControlesConfigurados;
        numControlesConfigurados++;
        this.tipoControlServicio="Desconocido";
    }
    
	/**
	 * Constructor sin parámetros de ControlServicio. Este constructor simplemente inicializa valores 
         * por defecto al control que se va a crear. Automáticamente asignar el identificador de Control 
         * de Servicio (idControlServicio) a partir del número de controles existentes ya configurados. 
         * Y asigna como tipo de Control de servicio (tipoControlServicio) el valor "Desconocido". De la 
         * misma forma asigna "Desconocido" al nombre de control de Servicio (nombreControlServicio) 
	 */
    public ControlServicio(){
        this("Desconocido");
    }
    
	/**
	 * Método estático observador (getter)  número de controles
	 * actualmente configurados
	 * @return numControlesConfigurados
	 */
    public static long getNumControlesConfigurados(){
        return numControlesConfigurados;
    }
    
	/**
	 * Método estático modificador (setter) para el número de controles
	 * actualmente configurados.Para que se pueda asignar dicho valor
         * se debe comprobar que sea mayor o igual que cero.
         * @param numeroControlesConfigurados numero entero largo a asignar
 	 */
    public static void setNumControlesConfigurados(long numeroControlesConfigurados){
        numControlesConfigurados=numeroControlesConfigurados;
    }
    
	/**
	 * Método observador (getter) el identificador 
         * @return idControlServicio identificado de control
	 */

    public long getIdControlServicio(){
        return idControlServicio;
    }
    
	/**
	 * Método modificador (setter) el identificador 
         * @param idServicio identificador de control a asignar
	 */
    public void setIdControlServicio(int idServicio){
        this.idControlServicio=idServicio;
    }
    
        /**
	 * Método observador (getter)que devuelve el nombre de control de servicio
         * @return nombreControlServicio nombre de control de servicio asignado
	 */
    public String getNombreControlServicio(){
        return this.nombreControlServicio;
    }
	/**
	 * Método modificador (setter) que asigna el nombre de control de servicio 
         * al que pertenece este objeto. 
         * @param nombreControlServicio nombre de control de servicio que se debe asignar.
	 */

    public void setNombreControlServicio(String nombreControlServicio){
        this.nombreControlServicio=nombreControlServicio;
    }
    
	/**
	 * Método observador (getter) que devuelve el tipo de control de servicio del objeto 
         * @return tipoControlServicio tipo de control de servicio del objeto.
	 */
    public String getTipoControlServicio(){
        return this.tipoControlServicio;
    }

	/**
	 * Método modificador (setter) que asigna el tipo de control de servicio al que pertenece 
         * este objeto. Para que se pueda asignar dicho valor se debe comprobar que pertenezca a 
         * uno de los cuatro tipos permitidos: "Puerta", Ventanilla, "Altavoz" o "TiraLuz". En caso 
         * de no corresponderse el parámetro para asignar con ninguno de estos cuatro tipos se asignará "Desconocido"
         * @param tipoControlServicio tipo de control de servicio que se debe asignar
	 */
    
    public void setTipoControlServicio (String tipoControlServicio){
         
        if ("Puerta".equals(tipoControlServicio)
                ||"Ventanilla".equals(tipoControlServicio)
                ||"Tiraluz".equals(tipoControlServicio)
                ||"Altavoz".equals(tipoControlServicio)){
        this.tipoControlServicio=tipoControlServicio;
        }else{
            this.tipoControlServicio="Desconocido";
        }
    }

	/**
	 * Método toString devuelve un String con los valores actuales de los atributos 
         * Cada atributo aparecerá en una línea y su tabulación
         * @return Cadena con los valores de los atributos
	 */
    @Override
    public String toString(){
    StringBuilder resultado=new StringBuilder();
    resultado.append("-------------------------------------------------------------------\n");
    resultado.append("ControlServicio: \n");
    resultado.append("    Identificador: ").append(this.idControlServicio).append("\n");
    resultado.append("    Nombre Servicio: ").append(this.nombreControlServicio).append("\n");
    resultado.append("    Tipo de Servicio: ").append(this.tipoControlServicio).append("\n");
    return resultado.toString();
}

}
