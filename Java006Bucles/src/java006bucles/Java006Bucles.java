/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java006bucles;

/**
 *
 * @author DARKCRUNCH
 */
public class Java006Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        SENTENCIAS REPETITIVAS O BUCLES
        Los bucles, iteraciones o sentencias repetitivas modifican el flujo 
        secuencial de un programa permitiendo la ejecución reiterada de una 
        sentencia o sentencias. En Java hay tres tipos diferentes de bucles: 
        for, while y do-while
        
        SENTENCIA FOR
        Es un bucle o sentencia repetitiva que
        •ejecuta la sentencia de inicio
        •verifica la expresion booleana de termino
        
        Sintaxis:
        •si es cierta, ejecuta la sentencia entre llaves y la sentencia de
         iteracion para volver a verificar la expresion booleana de termino.
        •si es falsa, sale del bucle
        
        for (inicio; termino; iteracion){
            sentencia;
        }
        
        Las llaves sólo son necesarias si se quieren repetir varias sentencias, 
        aunque se recomienda su porque facilita la lectura del código fuente y 
        ayuda a evitar errores al modificarlo. Habitualmente, en la expresión 
        lógica de término se verifica que la variable de control alcance un uso 
        determinado valor.
        */
        System.out.println("Tabla de multiplicar del 5");
        for (int i =0 ; i <= 12; i++) {
            System.out.println(5 + " * " + i + " = " + 5 * i);
        }
        /*
        SENTENCIA WHILE
        Es un buble o sentencia repetitiva con una condicion al principio. Se 
        ejecuta una sentencia mientras sea cierta una condicion. La sentencia
        puede que no se ejecute ni una sola vez.
        
        Sintaxis
        [inicializacion;] 
        while (expresionLogica) {
            sentencias;
            [iteracion;]
        }
        
        Recordemos que el vector args contiene todos los parámetros o 
        argumentos indicados en la línea de comandos. El primer elemento de este 
        vector es args[0]. El tamaño del vector puede determinarse añadiendo 
        .length a su identificador. Como el índice del primer elemento del 
        vector es 0, si el tamaño del vector es n, entonces el último elemento 
        del vector tiene índice n-1. En el ejemplo anterior de ejecución del 
        programa eco, args[0] toma como valor la cadena "Esto", args[1] vale 
        "es", args[2] vale "una" y args[3] vale "prueba".
        */
        int x = 1;
        // Salir cuando x llega a ser mayor que 4
        while (x <= 4)
        {
            System.out.println("Valor de x: " + x);
            //incrementa el valor de x para la siguiente iteración
            x++;
        }
        /*
        SENTENCIA DO-WHILE
        Es un buble o sentencia repetitiva con una condicion al final. Se
        ejecuta una sentencia mientras sea cierta una condicion. En este caso,
        la sentencia se ejecuta al menos una vez.
        
        Sintaxis
        do {
            sentencias;
            [iteracion;] 
        } while (expresionLogica);
        */
        int y = 21;
        do
        {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
            System.out.println("Valor de x :" + y);
            y++;
        }
        while (y < 20);
        /*
        SENTENCIA FOR-EACH
        Java también incluye otra versión del bucle for introducido en Java 5. 
        La mejora del bucle for proporciona una forma más sencilla de iterar a 
        través de los elementos de una colección o matriz. Es inflexible y debe 
        usarse solo cuando existe la necesidad de recorrer los elementos de 
        forma secuencial sin conocer el índice del elemento procesado 
        actualmente.
        
        Sintaxis
        for (Elemento T:Colección de obj/array)
        {
            declaraciones;
        }
        */
         String array1[] = {"Ron", "Harry", "Hermoine"};
 
        //mejorado para for
        for (String z:array1)
        {
            System.out.println(z);
        }
    }
    
}
