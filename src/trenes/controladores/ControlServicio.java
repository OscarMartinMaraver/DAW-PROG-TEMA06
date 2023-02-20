package trenes.controladores;


/**
 * Clase abstracta ControlServicio. Servirá para agrupar todas las
 * características comunes a los diferentes controles que pueda presentar cada
 * vagón del tren.
 * No es instanciable.
 * 
 * @author OScar Martín Maraver
 * @version 1.0
 */

public abstract class ControlServicio {


	/*
	 * Atributo de clase numControlesConfigurados. 
	 */

    protected static int numControlesConfigurados;
    
	/*
	 * Atributo inmutable idControlServicio. 
	 */

    protected int idControlServicio;
    
    
	/*
	 * Atributo nombreControlServicio.
	 */
    protected String nombreControlServicio;
    
    
	/*
	 * Atributo tipoControlServicio. 
	 */
    protected enum Tipo{
    Puerta, Ventanilla, TiraLuz, Altavoz, Desconocido;
    }
    protected Tipo tipoControlServicio;
    

	/**
         * Constructor con un parámetro de ControlServicio.
         * @param nombreControlServicio
	 */

    public ControlServicio(String nombreControlServicio){
        this.nombreControlServicio=nombreControlServicio;
        numControlesConfigurados=0;
        this.idControlServicio=numControlesConfigurados++;
        this.tipoControlServicio=Tipo.Desconocido;
    }
    
	/**
	 * Constructor sin parámetros de ControlServicio. 
	 */
    public ControlServicio(){
        this("Desconocido");
    }
    
	/*
	 * Método estático observador (getter)  número de controles
	 * actualmente configurados
	 *
	 */
    protected int getNumeroControlesConfigurados(){
        return numControlesConfigurados;
    }
    
	/*
	 * Método estático modificador (setter) para el número de controles
	 * actualmente configurados. 
	 */
    protected void setNumeroControlesConfigurados(int numeroControlesConfigurados){
        numControlesConfigurados=numeroControlesConfigurados;
    }
    
	/*
	 * Método observador (getter) el identificador 
	 */

    protected int getIdControlServicio(){
        return idControlServicio;
    }

	/*
	 * Método modificador (setter) el identificador 
	 */
    protected void setIdControlServicio(int idServicio){
        this.idControlServicio=idServicio;
    }
    
        /*
	 * Método observador (getter) nombre de control de 
	 */
    protected String getNombreControlServicio(){
        return this.nombreControlServicio;
    }
    
	/*
	 * Método modificador (setter) nombre de control de 
	 */

    protected void setNombreControlServicio(String nombreControlServicio){
        this.nombreControlServicio=nombreControlServicio;
    }
    
	/*
	 * Método observador (getter)  tipo de control 
	 */
    protected Tipo getTipoControlServicio(){
        return this.tipoControlServicio;
    }

	/*
	 * Método modificador (setter) que asigna el tipo de control 
	 */
    protected void setTipoControlServicio (Tipo t){
        this.tipoControlServicio=t;
    }

	/*
	 * Método toString 
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
