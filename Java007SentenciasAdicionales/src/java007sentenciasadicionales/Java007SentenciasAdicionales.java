/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java007sentenciasadicionales;

/**
 *
 * @author DARKCRUNCH
 */
public class Java007SentenciasAdicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        SENTENCIA BREAK
        La sentencia break puede encontrarse en sentencias switch o en bucles. 
        Al ejecutarse, deja el ámbito de la sentencia en la que se encuentra y 
        pasa a la siguiente sentencia. Puede emplearse con etiquetas, 
        especificando sobre qué sentencia se aplica si hay varias anidadas.
        
        etiqueta: sentencia;
        break [etiqueta];
        */
        int i = 9;
        switch (i)
        {
        case 0:
            System.out.println("i es cero.");
            break;
        case 1:
            System.out.println("i es uno.");
            break;
        case 2:
            System.out.println("i es dos.");
            break;
        default:
            System.out.println("i es mayor que 2.");
        }
        /*
        SENTENCIA CONTINUE
        La sentencia continue se emplea solo en bucles. Al ejecutarse la
        iteración en la que se encuentra, el bucle finaliza y se inicia la
        siguiente. Tambien puede emplearse con etiquetas, especificando sobre
        que sentencia se aplica si hay varias anidadas.
        
        etiqueta: sentencia;
        continue [etiqueta];
        */
        int j = 0;
        String resultado = "";
        do{
           j += 1;

           if(j == 3){
               System.out.println("SALTANDO ITERACION ACTUAL");
               continue;
           }
           resultado = "Iteracion: " + j;
           System.out.println("Resultado: " + resultado);

        }while(j < 5);
        /*
        TRATAMIENTO DE EXCEPCIONES
        Una excepción es una situación anómala a la que llega la ejecución de un 
        programa. Estas situaciones anómalas pueden ser el intento de abrir un 
        fichero que no existe, la división por cero o el acceso a un objeto no 
        inicializado.
        
        Java proporciona un mecanismo para detectar y solucionar las excepciones 
        que se puede llegar a producir durante la ejecución de un programa. En 
        Java estamos obligados a tratar las excepciones cuando se producen, bien 
        gestionándolas directamente o bien desentendiéndonos de ellas, pero 
        hasta esto último debemos hacerlo explicitamente.
        
        En Java existen dos grandes tipos de excepciones: los Errores y las
        Excepciones propiamente dichas:
        
        •Los errores son situaciones irrecuperables, por ejemplo fallos de la
         maquina virtual. Ante ellos no hay mas alternativa que cerrar la
         aplicacion, y no estamos obligados a gestionarlas.
        •Las excepciomes son situaciones anomales ante las cuales bien debemos
         reaccionar o bien nos desentendemos explitamente. Cuando una excepcion
         se produce se acompaña de toda la informacion relevante para que 
         podamos gestionarla.
        
        Un caso particular son las excepciones que derivan de RuntimeException, 
        como por ejemplo NullPointerException.
        
        Para gestionar una excepcion debe emplearse una sentencia try. La 
        sintaxis de la sentencia se muestra a continuacion:
        
        try{
        sentencia_1;
        sentencia_2;
        ...
        }catch(ClaseExcepcion objetoException){
        sentencia_a;
        sentencia_b;
        ...
        } catch(IOException e){
        //Aqui tratamos otro tipo de excepcion
        } finally {
        //Aqui realizamos las tareas comunes
        }
        
        La sentencia comienza por la palabra reservada try seguida de una o más 
        sentencias agrupadas entre paréntesis. Dichas sentencias son las que, 
        en principio, pueden dar lugar a una excepción durante su ejecución. 
        La clase Exception, que incluye todos los tipos de excepciones de 
        interés, recoge cualquier excepción generada por el bloque try. Por 
        ejemplo, determinados métodos como readLine generan una excepción si se 
        produce un problema con la entrada o salida de datos. En este caso, se 
        necesita recoger las excepciones de tipo IOException. La ejecución de 
        otros metódos, como parseInt, genera un error si la cadena dada como 
        parámetro no puede convertirse en un entero. En este caso, la excepción 
        es de tipo NumberFormatException.
        
        A continuacion aparece una o mas clausulas catch que son las manejadoras
        de las excepciones. En cada una de ellas, se necesita especificar lo que
        hacer cuando ocurre una excepcion en particular. Esta parte del codigo
        solo se ejecuta si se ha producido una excepcion.
        
        En Java existen muchos tipos de excepciones estandar. Algunas de las
        excepciones mas comunes se muestran en la siguiente tabla.
        
                EXCEPCION                   SIGNIFICADO
        IOException                 Problema de entrada o salida de datos
        ArithmeticException         Desbordamiento o division entera por cero
        NumberFormatException       Conversion ilegal de un string a un tipo 
                                    numerico
        IndexOutOfBoundsException   Acceso a un elemento inexistente de vector
                                    o de un String
        NegativeArraySizeException  Intento de creacion de un vector de longitud
                                    negativa
        NullPointerException        Intento de uso de una referencia nula
        SecurituException           Violacion de la seguridad en tiempo de la
                                    ejecucion
        
        Como hemos comentado antes, no es necesario que tratemos las excepciones
        pero si no lo vamos a hacer, debemos indicarlo explicitamente. El modo 
        de hacerlo es indicado que el metodo dentro del cual se puede lanzar una
        excepcion a su vez la relanza, como en el siguiente ejemplo:
        
        void metodoLanzador(int a) throws IOException, ClassNotFoundException 
        {...}
        */
         try{
            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println("Instrucción 1.");             System.out.println("Instrucción 2.");
            System.out.println("Instrucción 3, etc.");
        }
        catch (Exception e) { System.out.println("Instrucciones a ejecutar cuando se produce un error");  }
        finally{ System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no."); }
        /*
        CREACION DE EXCEPCIONES PROPIAS
        Para crear una excepcion propia basta extender la clase Exception o la
        excepcion mas adecuada, y en el constructor de la clase llamar a la
        clase padre con el mensaje que se desee mostrar cuando se produzca la
        excepcion.
        
        Para lanzar una excepcion explicitamente, utilizamos la palabra reservada
        throw e indicamos en la declaracion del metodo que puede lanzar la excepcion
        deseada. En el siguiente codigo se muestra un ejemplo.
        
        public class MiExcepcion extends Excepcion {
            public MiExcepcion() {
                super("Texto de la excepcion");
            }
        }

        public class LanzaExcepcion {
            public void metodo() throws MiExcepcion {
                //...
                if(a < b) throw new MiExcepcion();
                //...
            }
        }

        public class OtraClase {
            public void metodo() {
                LanzaExcepcion le = new LanzaExcepcion();
                try {
                    le.metodo();
                } catch (MiExcepcion e) {
                    System.err.println(e.getMessage());
                }
            }
        }
         
        OPERACIONES DE ENTRADA Y SALIDA DE DATOS
        Como se ha mostrado en el ejemplo anterior las operaciones de entrada y 
        salida de datos en un programa se llevan a cabo utilizando el paquete
        java.io. La sentencia import java.io.*; da acceso a la libreria de java
        necesaria para cualquier operacion de este tipo. Los canales o dispositivos
        predefinidos para realizar entradas o salidas de datos son los siguientes:
        
        •System.in: entrada estandar
        •System.out: salida estandar
        •System.err: salida de errores
        
        Los metodos print y println se emplean para la salida de datos en formato
        de concatenacion de Strings. El metodo readLine facilita una forma sencilla
        para realizar la entrada de datos mediante un objeto String. Este objeto
        toma el valor de la cadena de caracteres que acaben en un final de linea
        o en un final de archivo. Para poder emplear el metodo readLine es necesario
        construir un objeto BufferedReader sobre un objeto InputStreamReader, que
        a su vez se crea a partir de System.in.
        */
    }
    
}
