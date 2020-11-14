/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java005condicionales;

/**
 *
 * @author DARKCRUNCH
 */
public class Java005Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        SENTENCIAS DE CONTROL DEL FLUJO DE UN PROGRAMA
        Cuando se escribe un programa, se introduce la secuencia de sentencias
        dentro de un archivo. Sin sentencias de control del flujo, el interprete
        ejecuta las sentencias conforme aparecen en el programa de principio a 
        fin. Las sentecias de control de flujo se emplean en los programas para
        ejecutar sentencias condicionalmente, repetir un conjunto de sentencias
        o, en general, cambiar el flujo secuencial de ejecucion. Las sentencias
        selectivas o condicionales se veran en este capitulo y las sentencias
        repetitivas en el siguiente.
        
        SENTENCIA IF - ELSE
        Es una bifurcacion o sentencia condicional de una o dos ramas. La
        sentencia de control evalua la condicion logica o booleana. Si esta
        condicion es cierta entonces se ejecuta la sentencia o sentencias(1) que
        se encuentra a continuacion. En caso contrario, se ejecuta la 
        sentencia(2) que sigue a else (si esta existe). La sentencia puede 
        constar opcionalmente de una o dos ramas con sus correspondientes 
        sentencias. Sintaxis:
        
        if (expresionLogica) {
            sentencia_1;
        } else {
            sentencia_2;
        }
        
        La expresionLogica debe ir entre paréntesis. Las llaves sólo son 
        obligatorias si las sentencias (1) ó (2) son compuestas (las llaves 
        sirven para agrupar varias sentencias simples). La parte else y la 
        sentencia posterior entre llaves no son obligatorias. En este caso 
        quedaría una sentencia selectiva con una rama.
        */
        // Codigo autoexplicativo
        int a = 5, b=6;
        if (a>b) {
            System.out.println("a es mayor que b");
        } else {
            System.out.println("b es mayor que a");
        }
        /*
        SENTENCIA SWITCH-CASE
        La instrucción switch es una instrucción de múltiples vías. Proporciona 
        una forma sencilla de enviar la ejecución a diferentes partes del código 
        en función del valor de la expresión. Básicamente, la expresión puede 
        ser tipos de datos primitivos byte, short, char e int. A partir de JDK7, 
        también funciona con tipos enumerados (Enum en java), la clase String y 
        las clases Wrapper.
        
        // declaración de switch
        switch(expresión)
        {
           // declaración case
           // los valores deben ser del mismo tipo de la expresión
           case valor1 :
              // Declaraciones
              break; // break es opcional

           case valor2 :
              // Declaraciones
              break; // break es opcional

           // Podemos tener cualquier número de declaraciones de casos o case
           // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno de los casos es verdadero.
           // No se necesita descanso en el case default
           default : 
                // Declaraciones
        */
        int dia = 2;
        String dayType;
        String dayString;
         
        switch (dia) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia invalido";
        }
         switch (dia) 
        {
          //multiples cases sin declaraciones break
         
            case 1:  
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Dia laborable";
                break;
            case 6:
            case 7:
                dayType = "Fin de semana"; 
                break;
                 
            default: dayType= "Tipo de dia invalido";
        }
         
        System.out.println(dayString+" es un "+ dayType);
    }

}
