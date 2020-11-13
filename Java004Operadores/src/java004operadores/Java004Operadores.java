/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java004operadores;

import java.util.Scanner;

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
                 i-- primero se utiliza la variable y luego   a=5;
                 se decrementa su valor                      b=a--;    a=4 y b=5
                 --i primero se decrementa el valor de la     a=5;
                 variable y luego se utiliza                 b=--a;    a=4 y b=4
        
        Estos operadores suelen sustituir a veces al operador asignacion y
        tambien suelen aparecer en bucles for.*/
        int aa = 20, bb = 10, cc = 0, dd = 20, ee = 40;
        boolean condicion = true;

        // operador de pre-incremento
        // a = a+1 y entonces c = a;
        cc = ++aa;
        System.out.println("Valor de c (++aa) = " + cc);

        // operador de post-incremento
        // c=b entonces b=b+1 (b pasa a ser 11)
        cc = bb++;
        System.out.println("Valor de c (bb++) = " + cc);

        // operador de pre-decremento
        // d=d-1 entonces c=d
        cc = --dd;
        System.out.println("Valor de cc (--dd) = " + cc);

        // operador de post-decremento
        // cc=ee entonces ee=ee-1 (e pasa a ser 39)
        cc = ee--;
        System.out.println("Valor de cc (ee--) = " + cc);

        // Operador lógico not
        System.out.println("Valor de !condition = " + !condicion);
        /*
        OPERADORES DE RELACION
        Realizan comparaciones entre datos compatibles de tipos primitivos 
        (numéricos, carácter y booleanos) teniendo siempre un resultado booleano
        Los operandos booleanos sólo pueden emplear los operadores de igualdad y
        desigualdad.
        
        OPERADOR    DESCRIPCION                      EJEMPLO     RESULTADO
          ==         igual que                      7 == 38        false
          !=        distinto que                    'a'!='k'        true
          <         menor que                       'G'<'B'        false
          >         mayor que                       'B'>'A'         true
          <=        menor o igual que               7.5<=7.38      false
          >=        mayor o igual que               38>=7           true
        */ 
        int h = 20, i = 10;
        String x = "Thank", y = "You";
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean condicional = true;
 
        //varios operadores condicionales
        System.out.println("h == i :" + (h == i));
        System.out.println("h < i :" + (h < i));
        System.out.println("h <= i :" + (h <= i));
        System.out.println("h > i :" + (h > i));
        System.out.println("h >= i :" + (h >= i));
        System.out.println("h != i :" + (h != i));
 
        // Los Arrays no se pueden comparar con
        // operadores relacionales porque los objetos
        // almacenan referencias, mas no el valor
        System.out.println("x == y : " + (ar == br));
 
        System.out.println("condicion==true :" + (condicional == true));
        /*
        OPERADORES LOGICOS O BOOLEANOS
        Realizan operaciones sobre datos booleanos y tienen como resultado un 
        valor booleano. En la siguiente tabla se resumen los diferentes 
        operadores de esta categoría.
        
        OPERADOR            DESCRIPCION                 EJEMPLO       RESULTADO
           !     negacion NOT(unario)                   !false          true
                                                       !(5==5)         false
           |     suma logica OR(binario)              true | false      true
                                                      (5==5)|(5<4)      true
           ^     suma logica exclusiva XOR(binario)   true ^ false      true
                                                      (5==5)|(5<4)      true
           &     producto logico AND(binario)         true & false     false
                                                      (5==5)|(5<4)     false
           ||    producto logico con cortocircuito:   true || false     true
                 si el primer operando es true        (5==5)||(5<4)     true
                 entonces el segundo se salta y el
                 resultado es true
           &&    producto logico con cortocircuito:   false && true    false
                 si el primer operando es false        (5==5)|(5<4)    false
                 entonces el segundo se salta y el
                 resultado es false
        
        Para mejorar el rendimiento de ejecución del código es recomendable 
        emplear en las expresiones booleanas el operador && en lugar del 
        operador &. En este caso es conveniente situar la condición más 
        propensa a ser falsa en el término de la izquierda. Esta técnica puede 
        reducir el tiempo de ejecución del programa. De forma equivalente es 
        preferible emplear el operador || al operador |. En este caso es 
        conveniente colocar la condición más propensa a ser verdadera en el 
        término de la izquierda
        */
        String ca1 = "java";
        String ca2 = "desdecero";
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese usuario:");
        String user = sc.next();
        System.out.print("Ingrese contraseña:");
        String pass = sc.next();
 
        // Verifique si el nombre de usuario y la contraseña coinciden o no.
        if ((user.equals(ca1) && pass.equals(ca2)) || 
                (user.equals(ca1) && pass.equals(ca2))) {
            System.out.println("Bienvenido usuario.");
        } else {
            System.out.println("ID o Contraseña equivocada");
        }
        /*
        OPERADOR CONDICIONAL O TERNARIO
        Ternario es una versión abreviada de la declaración if-else. Tiene tres 
        operandos y de ahí el nombre ternario. El formato general es:
        La declaración anterior significa que si la condición se evalúa como 
        verdadera, entonces ejecuta las instrucciones después del '?' de lo 
        contrario, ejecuta las instrucciones después de ':'.
        Sintaxis:
        
        expresionLogica ? expresion_1 : expresion_2
        
        OPERADOR    DESCRIPCION                 EJEMPLO               RESULTADO
           ?:    operador condicional           a=4;
                                       b = a == 4 ? a+5; : 6-a;          b=9
                                       b = a > 4 ? a*7; : a+8;           b=12  
        
        La sentencia de asignación:

            valor = (expresionLogica ? expresion_1 : expresion_2);
        
        como se verá más adelante es equivalente a:

            if (expresionLogica)
                valor = expresion_1;
            else
                valor = expresion_2
        */
        int j = 20, k = 10, l = 30, result;
 
        //el resultado obtiene el máximo de tres
        //numeros
        result = ((j > k) ? (j > l) ? j : 
                   l : (k > l) ? k : l);
        System.out.println("Máximo de tres números = "+result);
        /*
        OPERADORES DE BIT
        Tienen operandos de tipo entero (o char) y un resultado de tipo entero. 
        Realizan operaciones con dígitos (ceros y unos) de la representación 
        binaria de los operandos. Exceptuando al operador negación, los demás 
        operadores son binarios. En la siguiente tabla se resumen los diferentes 
        operadores de esta categoría.
        
        OPERADOR DESCRIPCION                                EJEMPLO    RESULTADO
            ~    negacion o complemento binario              ~12          -13
            |    suma logica binaria OR(binario)            12|10          14
            ^    suma logica exclusiva XOR(binario)         12^10          6
            &    producto logico binario AND(binario)       12&10          8
           <<    desplaza a la izquierda los bits del 1°     7<<2          28
                 operando tantas veces como indica el 2°    -7<<2         -28
                 operando(por la derecha siempre entra
                 un cero)
           >>    desplaza a la derecha los bits del 1°      7>>2           1
                 operando tantas veces como indica el 2°   -7>>2          -2
                 operando(por la izquierda entra siempre
                 el mismo bit mas significativo anterior)
          >>>    desplaza a la derecha de los bits del 1°   7>>>2          1
                 operando tantas veces como indica el 2°   -7>>>2     1073741822
                 operando sin signo(por la izquierda
                 entra siempre un cero)          
        */
        System.out.println("Negacion(~) = "+(~12));
        System.out.println("OR(|) = "+(12|10));
        System.out.println("XOR(^) = "+(12^10));
        System.out.println("AND(&) = "+(12&10));
        System.out.println("desplazar(<<) = "+(7<<2));
        System.out.println("desplazar(<<) = "+(-7<<2));
        System.out.println("desplazar(>>) = "+(7>>2));
        System.out.println("desplazar(>>) = "+(-7>>2));
        System.out.println("desplazar(>>>) = "+(7>>>2));
        System.out.println("desplazar(>>>) = "+(-7>>>2));
        
        int ax = 0x0005;
        int bx = 0x0007;
 
        // bitwise AND
        // 0101 & 0111=0101
        System.out.println("ax&bx = " + (ax & bx));
 
        // bitwise or
        // 0101 | 0111=0111
        System.out.println("ax|bx = " + (ax | bx));
 
        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("ax^bx = " + (ax ^ bx));
 
        // bitwise complemento
        // ~0101=1010
        System.out.println("~ax = " + ~ax);
 
        // también se puede combinar con el
        // operador de asignación
        // ax = ax&bx
        ax &= bx;
        System.out.println("ax= " + ax);
        
        int ay = 0x0005;
        int by = -10;
 
        // operador de desplazamiento a la izquierda
        // 0000 0101<<2 =0001 0100(20)
        // similar ay 5*(2^2)
        System.out.println("ay<<2 = " + (ay << 2));
 
        // operador de desplazamiento a la derecha
        // 0000 0101 >> 2 =0000 0001(1)
        // similar a 5/(2^2)
        System.out.println("ay>>2 = " + (ay >> 2));
         
        // operador de cambio a la derecha sin firmar
        System.out.println("by>>>2 = "+ (by >>> 2));
        /*
        OPERADOR DE INSTANCIA(instanceof)
        El operador de instancia se usa para verificar el tipo. Se puede usar 
        para probar si un objeto es una instancia de una clase, una subclase o 
        una interfaz.
 
        Person obj1 = new Person();
        Person obj2 = new Boy();
 
        // Como obj1 es de tipo Person, no es una
        // instancia de Boy o interfaz
        System.out.println("obj1 instanceof Person: " + 
                           (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + 
                           (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: " + 
                           (obj1 instanceof MyInterface));
 
        // Dado que obj2 es de tipo Boy, cuya clase padre es
        // Person e implementa la interfaz Myinterface
        // es una instancia de todas estas clases
        System.out.println("obj2 instanceof Person: " + 
                           (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: " + 
                           (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: " + 
                           (obj2 instanceof MyInterface));
        class Person 
        {

        }

        class Boy extends Person implements MyInterface 
        {

        }

        interface MyInterface 
        {

        }
        
        PRIORIDAD ENTRE OPERADORES
        Si dos operadores se encuentran en la misma expresión, el orden en el 
        que se evalúan puede determinar el valor de la expresión. En la 
        siguiente tabla se muestra el orden o prioridad en el que se ejecutan 
        los operadores que se encuentren en la misma sentencia. Los operadores 
        de la misma prioridad se evalúan de izquierda a derecha dentro de la 
        expresión
        
        PRIOR   OPERADOR     TIPO         OPERACION
          1       ++      aritmetico      incremento previo o posterior unario
                  --      aritmetico      decremento previo o posterior unario
                  +,-     aritmetico      suma unaria, resta unaria
                  ~       integral        cambio de bits(unario)
                  !       booleano        negacion(unario)
          2     (tipo)    cualquiera
          3     *,/,%     aritmetico      multiplicacion, division, residuo
          4       +,-     aritmetico      suma resta
                  +       cadena          concatenacion de cadenas
          5       <<      integral        desplazamiento de bits a izquierda
                  >>      integral        desplazamiento de bits a derecha con
                                          inclusion de signo
                 >>>      integral        desplazamiento de bits a derecha con
                                          inclusion de cero
          6     <,<=      aritmetico      menor que, menor o igual que
                >,>=      aritmetico      mayor que, mayor o igual que
              instanceof  objeto,tipo     comparacion de tipos
          7       ==      primitivo       igual(valores identicos)
                  !=      primitivo       desigual(valores diferentes)
                  ==      objeto          igual(referencia al mismo objeto)
                  !=      objeto          desigual(referencia a distintos 
                                          objetos)
          8       &       integral        cambio de bits AND
                  &       booleano        producto booleano
          9       ^       integral        cambio de bits XOR
                  ^       booleano        suma exclusiva booleana
          10      |       integral        cambio de bits OR
                  |       booleano        suma booleana
          11      &&      booleano        AND condicional
          12      ||      booleano        OR condicional
          13      ?:      booleano,       operador condicional(ternario)
                          cualquiera
          14      =       variable,       asignacion
               *,/=,%=    cualquiera      asignacion con operacion
               +=,-=
               <<=,>>=
               >>>=
               &=,^=,|=
        
        
        SEPARADORES
        Existen algunos caracteres que tienen un significado especial en el 
        lenguaje Java. En la siguiente tabla se resumen los diferentes 
        separadores que pueden encontrarse en el código fuente de un programa.
        
        SEPARADOR DESCRIPCION
            ()    permiten modificar la prioridad de una expresion, contener
                  expresiones para el control de flujo y realizar conversiones
                  de tipo. Por otro lado pueden contener la lista de parametros
                  o argumentos, tanto en la definicion de un metodo como en la
                  llamada al mismo.
            {}    permiten definir bloques de codigo y ambitos y contener los
                  valores iniciales de las variables array
            []    permiten declarar variables de tipo array(vectores o matrices)
                  y referenciar sus elementos.
            ;     permite separar sentencias.
            ,     permite separar identificadores consecutivos en la declaracion
                  de variables y en las listas de parametros. tambien se emplea
                  para encadenar sentencias dentro de un bucle for.
            .     permite separar el nombre de un atributo o metodo de su 
                  instancia de referencia. tambien separa el identificador de un
                  paquete de los subpaquetes y clases.
        
        SECUENCIAS DE ESCAPE EN JAVA
        Los valores numéricos y de texto en los programas de Java se conocen 
        como “literales”; no representan nada, pero son, literalmente, lo que 
        ves. Los literales normalmente se desprenden de las palabras clave del 
        lenguaje Java, pero cuando se requieren comillas dobles o comillas 
        simples dentro de un valor de String, es necesario indicar que el 
        carácter de cita debe tratarse LITERALMENTE para evitar terminar 
        prematuramente el String. Esto se logra fácilmente mediante el prefijo 
        inmediato de cada carácter de comillas anidado con el operador de 
        escape \
        Ejemplo
        */
        String cita = " \"Java debe ser un territorio neutral, la Suiza de la tecnología informática.\"dijo James Gosling";
        /*
        Además, el operador de escape \ ofrece una variedad de secuencias de 
        escape muy útiles como son los siguientes
        
        ESCAPE     DESCRIPCION
         \n        nueva linea
         \t        tabulador
         \b        backspace
         \r        retorno del carro
         \f        form feed
         \\        barra invertida(\)
         \'        comilla simple
         \"        comilla doble
        */
    }

}
