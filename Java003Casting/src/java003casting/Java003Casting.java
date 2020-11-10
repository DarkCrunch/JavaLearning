/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java003casting;

/**
 *
 * @author DARKCRUNCH
 */
public class Java003Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*                  CASTING O CONVERSION DE DATOS 
        Ayuda a crear un software escalable y flexible. 
        Haremos un cuadro comparativo de compatibilidad.
        CONVERTIR                   CONVERTIR A
         DESDE     bolean  byte  short  char  int  long  float  double  String 
        boolean      -      No    No     No   No    No    No      No      Si
        byte        No      -     Si     Si   Si    Si    Si      Si      Si
        short       No      Si    -      Si   Si    Si    Si      Si      Si
        char        No      Si    Si     -    Si    Si    Si      Si      Si
        int         No      Si    Si     Si   -     Si    Si      Si      Si
        long        No      Si    Si     Si   Si    -     Si      Si      Si
        float       No      Si    Si     Si   Si    Si    -       Si      Si
        double      No      Si    Si     Si   Si    Si    Si      -       Si
        String      Si      Si    Si     Si   Si    Si    Si      Si      -*/

        //BOOLEAN A STRING
        boolean duda1 = false;
        String cadena1 = String.valueOf(duda1);

        //STRING a BOOLEAN
        String cadena2 = "true";
        boolean duda2 = Boolean.valueOf(cadena2);

        //BYTE A SHORT
        byte num1 = 16;
        short num2 = (short) num1;

        //SHORT A BYTE
        short num3 = 18;
        byte num4 = (byte) num3;

        //BYTE A CHAR
        byte num5 = 6;
        char digito1 = (char) num5;

        //CHAR A BYTE
        char digito2 = '7';
        byte num6 = (byte) digito2;

        //BYTE A INT
        byte num7 = 7;
        int num8 = (int) num7;

        //INT A BYTE
        int num9 = 9;
        byte num10 = (byte) num9;

        //BYTE A LONG
        byte num11 = 11;
        long num12 = (long) num11;

        //LONG A BYTE
        long num13 = 13;
        byte num14 = (byte) num13;

        //BYTE A FLOAT
        byte num15 = 15;
        float num16 = (float) num15;

        //FLOAT A BYTE
        float num17 = 17.8f;
        byte num18 = (byte) num17;

        //BYTE A DOUBLE
        byte num19 = 19;
        double num20 = (double) num19;

        //DOUBLE A BYTE
        double num21 = 21.86;
        byte num22 = (byte) num21;

        //BYTE A STRING
        byte num23 = 23;
        String cadena3 = String.valueOf(num23);

        //STRING A BYTE
        String cadena4 = "24";
        byte num24 = Byte.valueOf(cadena4);

        //SHORT A CHAR
        short num25 = 2;
        char digito3 = (char) num25;

        //CHAR A SHORT
        char digito4 = '7';
        short num26 = (short) digito2;

        //SHORT A INT
        short num27 = 27;
        int num28 = (int) num27;

        //INT A SHORT
        int num29 = 29;
        short num30 = (short) num29;

        //SHORT A LONG
        short num31 = 31;
        long num32 = (long) num31;

        //LONG A SHORT
        long num33 = 33;
        short num34 = (short) num33;

        //SHORT A FLOAT
        short num35 = 35;
        float num36 = (float) num35;
        
        //FLOAT A SHORT
        float num37 = 12.6f;
        short num38 = (short) num37;
        
        //SHORT A DOUBLE
        short num39 = 39;
        double num40 = (double) num39;
        
        //DOUBLE A SHORT
        double num41 = 41.32;
        short num42 = (short) num41;
        
        //SHORT A STRING
        short num43 = 43;
        String cadena5 = String.valueOf(num43);
        
        //STRING A SHORT
        String cadena6 = "44";
        short num44 = Short.valueOf(cadena6);
        
        //CHAR A INT
        char digito5 ='3';
        int num45 = (int) digito5;
        
        //INT A CHAR
        int num46 = 4;
        char digito6 = (char) num46;
        
        //CHAR A LONG
        char digito7 = '7';
        long num47 = (long) digito7;
        
        //LONG A CHAR
        long num48 = 8;
        char digito8 = (char) num48;
        
        //CHAR A FLOAT
        char digito9 ='1';
        float num49 = (float) digito9;
        
        //FLOAT A CHAR
        float num50 = 1f;
        char digito10 = (char) num50;
        
        //CHAR A DOUBLE
        char digito11 = '2';
        double num51 = (double) digito11;
        
        //DOUBLE A CHAR
        double num52 = 5;
        char digito12 = (char) num52;
        
        //CHAR A STRING
        char digito13 = 'a';
        String cadena7 = String.valueOf(digito13);
        
        //STRING A CHAR
        String cadena8 = "b";
        char digito14 = cadena8.charAt(0);
        
        //INT A LONG
        int num53 = 53;
        long num54 = (long) num53;
        
        //LONG A INT
        long num55 = 55;
        int num56 = (int) num55;
        
        //INT A FLOAT
        int num57 = 57;
        float num58 = (float) num57;
        
        //FLOAT A INT
        float num59 = 59.3f;
        int num60 = (int) num59;
        
        //INT A DOUBLE
        int num61 = 61;
        double num62 = (double) num61;
        
        //DOUBLE A INT
        double num63 = 63.74;
        int num64 = (int) num63;
        
        //INT A STRING
        int num65 = 65;
        String cadena9 = String.valueOf(num65);
        
        //STRING A INT
        String cadena10 = "66";
        int num66 = Integer.valueOf(cadena10);
        
        //LONG A FLOAT
        long num67 = 67;
        float num68 = (float) num67;
        
        //FLOAT A LONG
        float num69 = 70.3f;
        long num70 = (long) num69;
        
        //LONG A DOUBLE
        long num71 = 71;
        double num72 = (double) num71;
        
        //DOUBLE A LONG
        double num73 = 73.22;
        long num74 = (long) num73;
        
        //LONG A STRING
        long num75 = 75;
        String cadena11 = String.valueOf(num75);
        
        //STRING A LONG
        String cadena12 = "76";
        long num76 = Long.valueOf(cadena12);
        
        //FLOAT A DOUBLE
        float num77 = 77.6f;
        double num78 = (double) num77;
        
        //DOUBLE A FLOAT
        double num79 = 79.08;
        float num80 = (float) num79;
        
        //FLOAT A STRING
        float num81 = 81.03f;
        String cadena13 = String.valueOf(num81);
        
        //STRING A FLOAT
        String cadena14 = "82.08";
        float num82 = Float.valueOf(cadena14);
        
        //DOUBLE A STRING
        double num83 = 83;
        String cadena15 = String.valueOf(num83);
        
        //STRING A DOUBLE
        String cadena16 = "84";
        double num84 = Double.valueOf(cadena16);
    }

}
