/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java002variables;

/**
 *
 * @author DARKCRUNCH
 */
public class Java002Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Existen dos clasificaciones de DataType para declarar variables las 
        cuales son:
        *Primitivos
        *No Primitivos
        
        Los PRIMITIVOS o elemental son DataType originales que proporciona el 
        lenguaje Java desde sus inicios
        
        Los NO PRIMITIVOS o compuestos son aquellos que se derivan de uno o mas
        datos primitivos. A las distintas maneras de formar o combinar estos
        datos se les conocen con el nombre de "Data Structure"*/
        
        //DECLARACION PRIMITIVA
        /*Caracteres: El tipo de dato caracter es un digito individual el cual
        se puede representar como numericos (0 al 9), letras (a-z) y simbolos 
        (!"$&/\)
            Tipo de Dato            Rango                Tamaño en memoria
                char                  10                21 bits por caracter
        */
        char caracter = 'a';
        /*Caracteres unicode: Es una extension del DataType String, permite
        ampliar los simbolos de escritura, provee exactamente hasta 65535
        carateres diferentes. Ademas, permite trabajar con todos los caracteres
        de distintos idiomas
            Tipo de Dato            Rango                Tamaño en memoria
                short              0 a 65535            16 bits por caracter
        */
        short x = 23;
        /*Numericos: Puede ser real o entero, dependiendo del tipo de dato que 
        se vaya a utilizar. Enteros: son los valores que no tienen punto decimal,
        pueden ser positivos o negativos y el cero
        Tipo de Dato                Rango                         Tamaño en memoria
            byte                  -128 a +127                     8 bits por caracter 
            short                    0 a 65535                   16 bits por caracter
            int           (-2147483648)~(+2147483647)            32 bits por caracter
            long (-9223372036854775808)~(+9223372036854775807)   64 bits por caracter
        Reales: estos caracteres almacenan numeros muy grandes que poseen parte
        entera y parte decimal
        Tipo de Dato                    Rango                     Tamaño en memoria
            float    (-3.4e38 to -1.4e-45)~(1.4e-45 to 3.4e38)   32 bits por caracter
            double (-1.8e308 to -4.9e-324)~(4.9e-324 to 1.8e308) 64 bits por caracter*/
        byte y = 12;
        int i = 1;
        long numero = 1206879;
        float constante = 1.80f;
        double porcentaje = 0.18;
        /*Booleanos: Este tipo de dato se emplea para valores logicosm los podemos
        definir como datos comparativos, cuya comparacion devuelve resultados
        logicos tales como Verdadero o Falso
            Tipo de Dato            Rango                   Tamaño en memoria
             boolean            true or false              8 bits por caracter*/
        boolean comer = true;
        //DECLARACION NO PRIMITIVA
        /*Entre los Array, Class y Object el mas conocido es String*/
        String palabra = "composicion de letras que componen silabas cuya conjugacion es una palabra";
    }
    
}
