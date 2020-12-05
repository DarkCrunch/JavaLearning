/*
 * Ejemplo de una declaracion de la clase Precio
 * double da()--> devuelve el valor almacenado en euros
 * void pone (double x)--> almacena el valor en euros
 */
package java009objetosyclases;

/**
 *
 * @author DARKCRUNCH
 */
public class Precio {
    /*
    Ejemplo sencillo de clase y de instancia
    El siguiente código muestra la declaración de la clase Precio. La clase Precio 
    consta de un único atributo (euro) y dos métodos: uno que asigna un valor al 
    atributo (pone) sin devolver ningún valor y otro que devuelve el valor del 
    atributo (da).
    
    Gráficamente, una clase puede representarse como un rectángulo.
    
    Identificador de la clase          Precio
    Atributos                          euros
    Metodos                            da()
                                       pone()
    generando el archivo de bytecodes Precio.class. Este archivo no es directamente 
    ejecutable por el intérprete, ya que el código fuente no incluye ningún método principal (main). 
    Para poder probar el código anterior, puede construirse otro archivo con el 
    código fuente que se muestra a continuación:(ver PruebaPrecio)
    */
    //Atributo o variable miembro
    public double euros;
    
    //Metodos
    public double da(){
        return this.euros;
    }
    
    //Procedimiento
    public void pone(double x){
        this.euros = x;
    }
}
