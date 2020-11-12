/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java004operadores;

/**
 *
 * @author DARKCRUNCH
 */
public class Java004Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
                                OPERADORES EN JAVA
        Un operador realiza operaciones sobre uno (operador unario), dos 
        (operador binario) o tres (operador ternario) datos u operandos de tipo 
        primitvo devolviendo un valor determinado también de un tipo primitivo. 
        El tipo de valor devuelto tras la evaluación depende del operador y del 
        tipo de los operandos. Por ejemplo, los operadores aritméticos trabajan 
        con operandos numéricos, llevan a cabo operaciones aritméticas básicas y 
        devuelven el valor numérico correspondiente. Los operadores se pueden 
        clasificar en distintos grupos.
        
        OPERADOR ASIGNACION
        El operador asignación =, es un operador binario que asigna el valor del 
        término de la derecha al operando de la izquierda. El operando de la 
        izquierda suele ser el identificador de una variable. El término de la 
        derecha es, en general, una expresión de un tipo de dato compatible; 
        en particular puede ser una constante u otra variable. Como caso 
        particular, y a diferencia de los demás operadores, este operador no se 
        evalúa devolviendo un determinado valor.En muchos casos, el operador de 
        asignación se puede combinar con otros operadores para construir una 
        versión más corta de la declaración llamada Declaración Compuesta 
        (Compound Statement):
            + = , para sumar el operando izquierdo con el operando derecho y 
            luego asignarlo a la variable de la izquierda.
            – = , para restar el operando izquierdo con el operando derecho y 
            luego asignarlo a la variable de la izquierda.
            * = , para multiplicar el operando izquierdo con el operando derecho 
            y luego asignándolo a la variable de la izquierda.
            / = , para dividir el operando izquierdo con el operando derecho y 
            luego asignarlo a la variable de la izquierda.
            ^ = , para aumentar la potencia del operando izquierdo al operando 
            derecho y asignarlo a la variable de la izquierda.
            % = , para asignar el módulo del operando izquierdo con el operando 
            derecho y luego asignarlo a la variable de la izquierda.
         */
        
        //ASIGNACION
        int a = 5;
        
        //ASIGNACION COMPUESTA(+=) (b=b+6) o b+=6 ambos son correctos
        int b = 6;
        b += 6;
        
        //ASIGNACION COMPUESTA(-=) (c=c-5) o c-=5 ambos son correctos
        int c = 5;
        c -= 5;
        
        //ASIGNACION COMPUESTA(*=) (d=d*4) o d*=4 ambos son correctos
        int d = 4;
        d *= 4;
        
        //ASIGNACION COMPUESTA(/=) (e=e/2) o e/=2 ambos son correctos
        int e = 2;
        e /= 2;
        
        //ASIGNACION COMPUESTA(^=) (f=f^2) o f^=2 ambos son correctos
        int f = 2;
        f ^= 2;
        
        //ASIGNACION COMPUESTA(%=) (g=g%2) o g%=2 ambos son correctos
        int g = 2;
        g %= 2;
        
        /*
        OPERADORES ARITMETICOS
        Java tiene varios operadores aritméticos para los datos numéricos 
        enteros y reales. En la siguiente tabla se resumen los diferentes 
        operadores de esta categoría.
        
        OPERADOR         DESCRIPCION                    EJEMPLO      RESULTADO
           -     operador unario de cambio de signo       -4            -4
           +                suma                       2.5 + 7.1        9.6
           -                resta                   235.6 - 103.5      132.1
           *               producto                   1.2 * 1.1         1.32
           /               division                 0.050 / 0.2         0.25
           %               residuo                      20 % 7           6
        
        El resultado exacto depende de los tipos de operando involucrados. Es 
        conveniente tener en cuenta las siguientes peculiaridades:
            *El resultado es de tipo long si, al menos, uno de los operandos es 
             de tipo long y ninguno es real (float o double).
            *El resultado es de tipo int si ninguno de los operandos es de tipo 
             long y tampoco es real (float o double).
            *El resultado es de tipo double si, al menos, uno de los operandos 
             es de tipo double.
            *El resultado es de tipo float si, al menos, uno de los operandos es 
             de tipo float y  ninguno es double.
            *El formato empleado para la representación de datos enteros es el 
             complemento a dos. En la aritmética entera no se producen nunca 
             desbordamientos (overflow) aunque el resultado sobrepase el 
             intervalo de representación (int o long).
            *La división entera se trunca hacia 0. La división o el resto de 
             dividir por cero es una operación válida que genera una excepción 
             ArithmeticException que puede dar lugar a un error de ejecución y 
             la consiguiente interrupción de la ejecución del programa.
            *La aritmética real (en coma flotante) puede desbordar al infinito 
             (demasiado grande, overflow) o hacia cero (demasiado pequeño, 
             underflow).
            *El resultado de una expresión inválida, por ejemplo, dividir 
             infinito por infinito, no genera una excepción ni un error de 
             ejecución: es un valor NaN (Not a Number).
        
        OPERADORES ARITMETICOS INCREMENTABLES
        Los operadores aritméticos incrementales son operadores unarios (un 
        único operando). El operando puede ser numérico o de tipo char y el 
        resultado es del mismo tipo que el operando. Estos operadores pueden 
        emplearse de dos formas dependiendo de su posición con respecto al 
        operando.
        
        OPERADOR    DESCRIPCION                             EJEMPLO   RESULTADO
           ++    incremento                                   4++       5
                 i++ primero se utiliza la variable y luego   a=5;
                 se incrementa su valor                      b=a++;    a=6 y b=5
                 ++i primero se incrementa el valor de la     a=5;
                 variable y luego se utiliza                 b=++a;    a=6 y b=6
           --    decremento                                   4--         3
        
        Estos operadores suelen sustituir a veces al operador asignacion y
        tambien suelen aparecer en bucles for.
        
        OPERADORES DE RELACION
        Realizan comparaciones entre datos compatibles de tipos primitivos 
        (numéricos, carácter y booleanos) teniendo siempre un resultado booleano
        Los operandos booleanos sólo pueden emplear los operadores de igualdad y
        desigualdad.
        
        OPERADOR    DESCRIPCION
        */ 
    }

}
