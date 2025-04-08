package ud4.exercicios.practicas;

import java.util.Arrays;
import java.util.Scanner;

public class BuscandoLetras {
    public static void main(String[] args) {
        String epa ="Oye hola";
        char opo='r';
        buscarLetra(epa, opo);
    }

    static int[] buscarLetra(String cadena, char letra) {
        char[] tablaChar = cadena.toCharArray(); 
        int tabla[] = {1,4,5};
        System.out.println(Arrays.toString(tablaChar));
        int[] pos={3,5};
        return pos;
    }
}
