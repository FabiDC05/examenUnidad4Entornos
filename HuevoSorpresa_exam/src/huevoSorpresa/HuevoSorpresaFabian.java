package huevoSorpresa;

/**
 * Clase para crear un huevo sorpresa
 * @author Fabian
 */
public class HuevoSorpresaFabian {

    /**
     * Método que nos devuelve las unidades del huevo
     * @return las unidades del huevo
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Método para establecer las unidades del huevo
     * @param unidades unidades a establecer
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Método que nos devuelve el precio del huevo
     * @return el precio del huevo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para establecer el precio del huevo
     * @param precio el precio a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que nos devuelve la sorpresa del huevo
     * @return la sorpresa del huevo
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * Método para establecer la sorpresa del huevo
     * @param sorpresa sorpresa a establecer
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * Método que nos devuelve el precio máximo del huevo
     * @return el precio máximo del huevo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * Método para establecer el precio máximo del huevo
     * @param precio_max precio máximo a establecer
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
    
    /**
     * Número de huevos que quedan 
     */
    private int unidades;
    /**
     * Precio actual de un huevo sorpresa
     */
    private double precio;
    /**
     * Nombre de la sorpresa que incluye huevo sorpresa
     */
    private String sorpresa;
    /**
     * Precio máximo que puede tener un huevo sorpresa
     */
    private double precio_max;
    
/**
 * Constructor para crear un huevo sin parámetros
 */    
public HuevoSorpresaFabian(){}

/**
 * Constructor para crear un huevo con las características que deseemos.
 * - Unidades
 * - Precio
 * - Sorpresa
 * - Precio máximo
 * @param unidades unidades del huevo
 * @param precio precio del huevo
 * @param sorpresa sorpresa que contiene el huevo
 * @param precio_max precio maximo del huevo
 */
public HuevoSorpresaFabian(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}

/**
 * Método que nos devuelve las unidades que quedan de un huevo
 * @return unidades restantes de un huevo
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * Método que nos devuelve el precio de un huevo
 * @return precio del huevo
 */
public double obtenerPrecio(){return this.getPrecio();}

/**
 * Método que nos permite modificar las unidades
 * @param unidades unidades a establecer
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}

/**
 * Método para sacar un huevo sorpresa, indicando la cantidad de huevos a sacar,
 * el dinero que tenemos, y la sorpresa que queremos
 * @param unidades cantidad de huevos a sacar
 * @param dinero dinero que tenemos
 * @param sorpresa sorpresa que contiene el huevo
 * @throws Exception excepción que salta si no tenemos dinero suficiente, si no
 * tenemos una cantidad de dinero positiva, si las unidades no son positivas
 * o si no hay suficientes huevos en la tienda
 */
public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}

/**
 * Método para aumentar el precio de un huevo
 * @param aumento precio del aumento a insertar
 * @throws Exception excepción que salta si el numero no es positivo o supera
 * el precio máximo establecido
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}
}