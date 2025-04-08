package contornos.proyectos;

import java.util.Random;

public class E0505 {
    public static void main(String[] args) {
        int longitud=10, fin=20, inicio=1;
        randEvAr(longitud, inicio, fin);
    }
    /*
     * static int[] rellenaPares(int longitud, int fin) {
        
        if (longitud>0) {
            int[] tabla = new int[longitud];
            for (int par : tabla) {   
            do {
                par=num;
            } while (par%2!=0);    
            }


        return tabla;
        } else return 0;
    }
     */
    static int[] randEvAr(int longitud, int maxR, int minR) {
        Random num = new Random();
        int array[] = new int[longitud];

        for (int i = 0; i <= array.length; i++) {
            int value = num.nextInt(maxR - minR +1) + minR;
            if(value%2!=0) {
                if (value+1 > maxR) {
                    value= value-1;
                } else value = value+1;
            }
            array[i] = value;
        }
        System.out.println(array.toString());
        return array;
    }
}
