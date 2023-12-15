
/*
"PROBLEMA STRINGY"

Escribe una función llamada stringy que tome un tamaño y devuelva una cadena de 1s y 0s alternados.

La cadena debe comenzar con un 1.

Una cadena con un tamaño de 6 debería devolver: '101010'.

Con un tamaño de 4 debería devolver: '1010'.  0 1 2 3 // 4

Con un tamaño de 12 debería devolver: '101010101010'.

El tamaño siempre será positivo y solo se usarán números enteros. */

/*

"PROBLEMA DERROTAR DRAGON"

Un héroe se dirige al castillo para completar su misión. 

Sin embargo, le han dicho que el castillo está rodeado por un par de poderosos dragones.

Cada dragón requiere 2 balas para ser derrotado, y nuestro héroe no tiene idea de cuántas balas debería llevar consigo.

Suponiendo que va a tomar un número específico de balas proporcionado

y avanzará para luchar contra un número específico de dragones también proporcionado, ¿sobrevivirá?

Devuelve true si es así, false en caso contrario :)*/

/*

"PROBLEMA LETRAS"

Dada una cadena que indica un rango de letras, 

devuelve una cadena que incluye todas las letras en ese rango,

incluida la última letra. 

¡Ten en cuenta que si el rango se da en letras mayúsculas, devuelve la cadena también en mayúsculas!

Ejemplos:

"a-z" ➞ "abcdefghijklmnopqrstuvwxyz"
"h-o" ➞ "hijklmno"
"Q-Z" ➞ "QRSTUVWXYZ"
"J-J" ➞ "J"*/

public class App {

    public static String letras(String cadenaEntrada) {

        String abecedario = "abcdefghijklmnopqrstuvwxyz";

        String cadenaSalida = "";
        char caracterInicial = cadenaEntrada.charAt(0);
        char caracterFinal = cadenaEntrada.charAt(2);
        Integer indice1 = abecedario.indexOf(caracterInicial);
        Integer indice2 = abecedario.indexOf(caracterFinal);
        abecedario.indexOf(caracterFinal);
        cadenaSalida=abecedario.substring(indice1, indice2+1);

        return cadenaSalida;

    } 

    public static boolean derrotarDragon(Integer balas, Integer dragones) {
        Integer balasNecesarias = dragones * 2;
        boolean sobrevive = false;
        if (balas >= balasNecesarias) {
            sobrevive = true;

        } else {
            sobrevive = false;
        }
        return sobrevive;
    }

    public static String stringy(Integer tamanio) {
        String cadenaDevuelta = "";
        for (int i = 0; i < tamanio; i++) {
            if (i % 2 == 0) {// es par
                cadenaDevuelta = cadenaDevuelta + "1";
            } else {
                cadenaDevuelta = cadenaDevuelta + "0";
            }
        }

        return cadenaDevuelta;

    }

    public static void main(String[] args) throws Exception {

        System.out.println(stringy(4));
        System.out.println(derrotarDragon(500,800));
        System.out.println(letras("a-z"));

    }

}
