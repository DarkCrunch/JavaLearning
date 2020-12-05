/**
 * Ejemplo de declaracion de la clase PrecioPrivado
 * double da()              --> devuelve el valor almacenado en euros
 * void pone( double x )    --> almacena valor en euros
 * euros                    --> Atributo de acceso privado
 */
package java009objetosyclases;

/**
 *
 * @author DARKCRUNCH
 */
public class PrecioPrivado {
    // Atributo o variable miembro private double euros; 
    private double euros;
    
    // Metodos publicos
    public double da() {
        return this.euros;
    }
    public void pone(double x) {
        this.euros = x;
    }
}
