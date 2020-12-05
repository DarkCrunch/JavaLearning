/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java010standarclass;

/**
 *
 * @author DARKCRUNCH
 */
public class Java010StandarClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Uno de los puntos fuertes de Java es la gran cantidad de clases 
        predefinidas que posee. Dichas clases pueden ser utilizadas por los 
        programadores sin necesidad de reinventar la rueda. En este capítulo se 
        presentan algunas de las clases predefinidas de Java que se suelen 
        utilizar más en la construcción de programas.
        
        CLASES CONTENEDORAS O WRAPPERS
        En java existen una serie de clases predefinidas equivalentes a los tipos
        primitivos denominadas wrappers, clases contenedoras o envoltorios. Como
        muestra la siguiente tabla el identificador de cada una de estas clases
        es el mismo que el del tipo primitivo correspondiente pero con la letra
        inicial en mayusculas(salvo int - Integer y char - Character). Cada una
        de estas clases declaran un conjunto de metodos de gran utilidad.
        
        Tipo primitivo       Clase Contenedora
        boolean              Boolean
        char                 Character
        byte                 Byte
        short                Short
        int                  Integer
        long                 Long
        float                Float
        double               Double
        
        El uso de estas clases puede ser especialmente interesante para realizar
        determinadas operaciones mediante los metodos que implementan. En la 
        siguiente seccion se analiza el uso de la clase Character.
        
        OBJETOS DE LA CLASE CHARACTER
        La clase predefinida Character permite trabajar con instancias a las que
        se les puede asociar un unico caracter Unicode. Esta clase incluye un 
        conjunto de metodos que facilitan la manipulacion de datos de tipo 
        primitivo char.
        
        Metodo                              Significado
        boolean isUpperCase(char)           Determina si el caracter es mayusculas o
        boolean isLowerCase(char)           minusculas respectivamente
        char toUpperCase(char)              Devuelve el caracter en mayusculas o
        char toLowerCase(char)              minusculas correspondiente
        boolean isLetter(char)              Determina si el caracter es una letra,
        boolean isDigit(char)               un digito, o una letra o un digito
        boolean isLetterOrDigit(char)       respectivamente
        boolean isWhitespace(char)          Determina si el caracter es un espacio
                                            en blanco
        boolean isSpaceChar(char)           Determina si el caracter es un caracter
                                            de espacio en blanco de acuerdo a Unicode
        boolean isJavaIdentifierStart(char) Determina si el caracter puede ser el primer
        boolean isJavaIdentifierPart(char)  caracter legal en un identificador o parte de el
        
        El siguiente codigo muestra como crear referencias e instancias de la clase
        Character:
        */
        
        Character a;
        a = new Character('A');
        
        Character b = new Character('B');
        
        /*
        Metodo                              Significado
        int compareTo(Character otroCter)   Compara dos objetos Character con un resultado
                                            numerico: el valor es 0 si el parametro y la
                                            instancia son iguales, es menor que 0 si la
                                            instancia es menor que el parametro y es mayor
                                            que 0 si la instancia es mayor que es parametro
        
        OBJETOS DE LA CLASE STRING
        String es una clase predifinida y especial de Java definida en la libreria o paquete
        java.lang y orientada a manejar cadenas constantes de caracteres. Una instancia de la
        clase String es inmutable, es decir, una vez que se ha creado y se le ha asignado un
        valor, este no puede modificarse(añadiendo, eliminando o cambiando caracteres). El
        siguiente codigo muestra diferentes ejemplos de creacion de referencias e instancias 
        de la clase String.
        */
        
        String cortesia = new String("Buenos dias");
        //o bien, al ser una clase muy habitual en la forma abreviada
        String saludo = "Hola";
        //o tambien
        String despedida;
        despedida = "Adios";
        
        /*
        Como se ha visto anteriormente, las constantes de la clase String o cadenas literales
        se indican entre comillas dobles. Estas comillas no se consideran parte de la cadena.
        
        OPERACIONES CON INSTANCIAS DE LA CLASE STRING
        Al ser un objeto, una instancia de la clase String no sigue las normas de manipulacion
        de los datos de tipo primitivo con excepcion del operador concatenacion. El operador +
        realiza una concatenacion cuando, al menos, un operando es un String. El otro operando
        puede ser de un tipo primitivo. El resultado es una nueva instancia de tipo String. Por
        ejemplo:
        */
        
        String cadena1 = "casa" + "blanca";     //Gerena "cadenablanca"
        String cadena2 = "capitulo" + 5;        //Genera "indice5"
        String cadena3 = 5 + "capitulo";        //Genera "5capitulo"
        String cadena4 = "x" + 2 + 3;           //Genera "x23"
        String cadena5 = 2 + 3 + "x";           //Genera "5x" cuidado con la prioridad de los operadores
        String cadena6 = 2 + (3 + "x");         //Genera "23x"
        
        /*
        Tambien puede emplearse el operador +=, de forma que la sentencia a+=b es equivalente a
        la sentencia a = a + b
        
        La comparacion de dos objetos String no se realiza con el operador igualdad (==), ya que
        se campararian las referencias, sino que se realiza con el metodo equals, de forma que
        cadena1.equals(cadena2) devuelve true si cadena1 y cadena2 hacen referencia a un mismo
        valor. Los metodos mas importantes de la clase String se resumen en la siguiente tabla
        
        Metodo                      Significado
        length()                    Devuelve la longitud de la cadena
        indexOf('char')             Devuelve la posicion de la primera aparicion del caracter
        lastIndexOf('char')         Devuelve la posicion de la ultima aparicion del caracter
        charAt(int)                 Devuelve el caracter que esta en la posicion indicada
        substring(n1,n2)            Devuelve la subcadena comprendida entre las posiciones n1 y 
                                    n2 ambas incluidas
        toUpperCase()               Devuelve la cadena en mayusculas
        toLowerCase()               Devuelve la cadena en minusculas
        equals(String)              Compara dos cadenas y devuelve true si son iguales
        equalsIgnoreCase(String)    Igual que equals pero sin considerar mayusculas y minusculas
        valueOf(int)                Convierte el valor entero n a cadena. Existen otros metodos
                                    con el mismo identificador, valueOf, para la conversion del 
                                    resto de los tipos primitivos a cadena.
        
        Para visualizar por pantalla el contenido de un objeto String pueden emplearse los metodos
        print y println de la clase estandar System.out
        */
        
        if (saludo.equals(despedida)) {
            System.out.println(saludo);
        } else {
            System.out.println(despedida);
        }
        
        /*
        La longitud de una cadena puede obtenerse con el metodo length perteneciente a la clase
        String que devuelve un valor entero que indica el numero de caracteres que componen la
        cadena
        */
        
        int longitud = despedida.length();      //longitud toma el valor de 5
        longitud = "Hasta luego".length();      //longitud toma el valor de 11
        
        /*
        Una cadena de longitud igual a 0, que no contiene ningun caracter, se denomina cadena
        vacia y se representa como"". Por otro lado, el metodo charAt devuelve
        */
    }
    
}
