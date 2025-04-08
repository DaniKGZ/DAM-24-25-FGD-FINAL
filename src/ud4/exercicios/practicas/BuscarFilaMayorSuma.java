package ud4.exercicios.practicas;

import java.util.Arrays;

public class BuscarFilaMayorSuma {
    public static void main(String[] args) {
        int arr[][]= new int[3][2];
        int eo[]= {2,4,5,3};
        System.out.println(arr[0].length);
        System.out.println(Arrays.toString(eo));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }

   static int[] filaMayor(int[][] t) {
        int fila[];
        int suma, mayor=0;
        int longCol= t[0].length;
        int longFila = t.length;
        if (longCol>1) {
            for (int i = 0; i < t[1].length; i++) {
                suma=0;
                for (int j = 0; j < t.length; j++) {
                    suma+=t[j][i] ;
                }
            }

        } else {
            for (int i = 0; i < longFila; i++) {
                fila[i]=t[i][0];
            }
        }
        return fila;
    }
}
