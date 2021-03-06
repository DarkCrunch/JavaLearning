/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java008return;

/**
 *
 * @author DARKCRUNCH
 */
public class Java008Return {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        SENTENCIA RETURN Y METODOS
        La sentencia return se emplea para salir de la secuencia de ejecucion de
        las sentencias de un metodo y, opcionalmente, devolver un valor. Tras la
        salida del metodo se vuelve a la secuencia de ejecucion del programa al 
        lugar de llamada de dicho metodo.
        Sintaxis:
        return expresion;
        
        DECLARACION Y USO DE METODOS
        Un metodo es un trozo de codigo que puede ser llamado o invocado por el 
        programa principal o por otro metodo para realizar alguna tarea especifica
        El termino metodo en Java es equivalente al de subprograma, rutina, subrutina,
        procedimiento o funcion en otros lenguajes de programacion. El metodo es
        llamado por su nombre o identificador seguido por una secuencia de parametros
        o argumentos (datos utilizados por el propio metodo para sus calculos) entre
        parentesis. Cuando el metodo finaliza sus operaciones, devuelve habitualmente
        un valor simple al programa que lo llama, que utiliza dicho valor de la 
        forma que le convenga. El tipo de dato devuelto por la sentencia return 
        debe coincidir con el tipo de dato declarado en la cabecera del metodo.
        Sintaxis de declaracion de un metodo:
            [modificadores] TipoDeDato identificadorMetodo (parametros formales) {
            declaraciones de variables locales; 
            sentencia_1; 
            sentencia_2;
            ... 
            sentencia_n; 
            // dentro de estas sentencias se incluye al menos un return 
        }
        
        La primera linea de codigo corresponde a la cabecera del metodo. Los modificadores
        especifican como puede llamarse al metodo, el tipo de dato indica el tipo
        de valor que devuelve la llamada al metodo y los parametros(entre parentesis)
        introducen informacion para la ejecucion del metodo. Si no existen parametros
        explicitos se dejan los parentesis vacios. A continuacion, las sentencias
        entre llaves componen el cuerpo del metodo. Dentro del cuerpo del metodo
        se localiza, al menos, una sentencia return. Ejemplo:
        */
        System.out.println("El cubo de 7.5 es: " + cubo(7.5));
        /*
        Seguidamente se muestra un ejemplo de declaración y uso de un método que 
        devuelve el cubo de un valor numérico real con una sentencia return. A
        diferencia de otros lenguajes de programación, como Pascal, en Java, la 
        declaración del método puede realizarse en el código fuente después de 
        la llamada al propio método. En el caso anterior, public y static son 
        los modificadores especificados en la cabecera del método. El uso de 
        estos dos modificadores permite que el tipo de método sea similar al de 
        una función global de Pascal o C. El identificador double hace referencia 
        al tipo de dato que devuelve la llamada al método, cubo es el identificador 
        del método y x es el identificador del parámetro en la declaración de la 
        cabecera del método (parámetro formal). Ejemplo de ejecución del código 
        anterior y salida correspondiente por pantalla:
        
        $>java PruebaCubo
        El cubo de 7.5 es: 421.875
        
        En Java, los métodos suelen ir asociados con los objetos o instancias en 
        particular a los que operan (métodos de instancia). Los métodos que no 
        necesitan o trabajan con objetos (y sí con números, por ejemplo) se 
        denominan métodos estáticos o de clase y se declaran con el modificador 
        static. Los métodos estáticos o de clase son equivalentes a las rutinas 
        (funciones o procedimientos) de los lenguajes que no emplean la 
        programación orientada a objetos. Por ejemplo, el método sqrt de la 
        clase Math es un método estático. También lo es el método cubo del 
        ejemplo anterior. Por otro lado, todo programa o aplicación Java tiene 
        un método principal main que será siempre un método estático.
        
        ¿Por qué se emplea la palabra static para los métodos de clase?. El 
        significado o la acepción más común de la palabra estático (que permanece 
        quieto en un lugar) parece no tener nada que ver con lo que hacen los 
        métodos estáticos. Java emplea la palabra static porque C++ lo utiliza 
        en el mismo contexto: para designar métodos de clase. Aprovechando su 
        empleo en variables que tienen una única localización en memoria para 
        diferentes llamadas a métodos, C++ lo empezó a utilizar en la designación 
        de los métodos de clase para diferenciarlos de los métodos de instancia 
        y no confundir al compilador. El problema es que nadie pensó en que el 
        uso de la palabra static pudiera causar confusiones humanas.
        
        RETURN Y VOID
        En algunas ocasiones, no es necesario que el método estático tenga que 
        devolver un valor al finalizar su ejecución. En este caso, el tipo de 
        dato que debe indicar en la cabecera de declaración del método es el tipo 
        void y la sentencia return no viene seguida de ninguna expresión.
        Sintaxis return;
        */
        tabla(4);
        /*
        Si no hay sentencia return dentro de un método, su ejecución continúa 
        hasta que se alcanza el final del método y entonces se devuelve la 
        secuencia de ejecución al lugar dónde se invocó al método. Un método 
        cuyo tipo de retorno no es void necesita siempre devolver algo. Si el 
        código de un método contiene varias sentencias if debe asegurarse de que 
        cada una de las posibles opciones devuelve un valor. En caso contrario, 
        se generaría un error de compilación. Por ejemplo:
        */
        for (int i = 5; i >= -5; i--) {
            System.out.println(i + " es positivo " + esPositivo(i));
        }
        /*
        RECURSION
        Java te permite la recursion o recurrencia en la programacion de metodos.
        La recursion consiste en que un metodo se llame a si mismo. Un ejemplo muy
        tipico de empleo de la recursion puede verse en la construccion de un metodo
        que devuelva el factorial de un entero. Se basa en el hecho de que n! es igual
        a n(n-1)! si n es mayor que 1. Por ejemplo:
        */
        for (int i = 0; i <= 20; i++) {
            System.out.println("Factorial de " + i + " = " + factorialR(i));
        }
        /*
        En la construcción de métodos recursivos es importante evitar el problema 
        de la recursión infinita. Es decir, que en algún caso, la ejecución del 
        método definido de forma recursiva no implique una nueva llamada al propio 
        método.
        
        SOBRECARGA DE METODOS
        Java permite asignar el mismo identificador a distintos métodos, cuya 
        diferencia reside en el tipo o número de parámetros que utilicen. Esto 
        resulta especialmente conveniente cuando se desea llevar a cabo la misma 
        tarea en difererente número o tipos de variables. La sobrecarga 
        (overloading) de los métodos puede resultar muy útil al efectuar 
        llamadas a un método, ya que en lugar de tener que recordar 
        identificadores de métodos distintos, basta con recordar uno sólo. El 
        compilador se encarga de averiguar cuál de los métodos que comparten 
        identificador debe ejecutar. Por ejemplo
        */
        int a=34;
        int b=12;
        int c=56;
 
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        // El primer método
        System.out.println("El mayor de a y b es: " + mayor(a,b));
        // El segundo método
        System.out.println("El mayor de a, b y c es: " + mayor(a,b,c));
    }
    
    //Declaracion y metodos
    public static double cubo (double x) {
        // declaracion
        return x*x*x;
    }
    
    public static void tabla(int n){
        //ejemplo de llamada de tipo void
        System.out.println("Tabla de multiplicar del numero " + n);
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + i + " = " + producto(n, i));
        }
        return;
    }
    
    public static int producto (int a, int b) {
        return a*b;
    }
    
    public static boolean esPositivo(int x){
        if(x<0)
            return false;
        else
            return true;
    }
    
    public static long factorialR(int n){
        if(n==0)
            return 1;
        else
            return n * factorialR(n - 1);
    }
    
    //SOBRECARGA
    // Definicion de mayor de dos numeros enteros
    public static int mayor (int x, int y) {
        return x > y ? x : y;
    }
 
    // Definicion de mayor de tres numeros enteros
    public static int mayor (int x, int y, int z) {
        return mayor(mayor(x, y), z);
    }
    
}
