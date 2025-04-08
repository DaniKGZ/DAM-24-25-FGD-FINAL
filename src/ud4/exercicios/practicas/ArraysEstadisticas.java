package ud4.exercicios.practicas;

import java.util.Arrays;

public class ArraysEstadisticas {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = {2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7};
        int[] numeros2 = {2, 4, 6, 7, 4, 9, 2, 5, 6, 7};

        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        //System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));

        System.out.println("---------------------------------------------\n\n");
    }

    static int suma(int[] numeros) {
        int total=0;
        for (int i = 0; i < numeros.length; i++) {
            total+=numeros[i];           
        }
        return total;
    }

    static int maximo(int[] numeros) {
            int min = numeros[0];
            for (int j = 0; j < numeros.length; j++) {
                if (min<numeros[j]) {
                    min=numeros[j];
                }
            }
        return min;
    }

    static int minimo(int[] numeros) {
        int max = numeros[0];
        for (int j = 0; j < numeros.length; j++) {
            if (max>numeros[j]) {
                max=numeros[j];
            }
        }
    return max;
    }

    static double media(int[] numeros) {
        double avrg;
        double total=0;
        for (int i = 0; i < numeros.length; i++) {
            total+=numeros[i];           
        }
        avrg = total/numeros.length;
        return avrg;
    }
    static double mediana(int[] numeros) {
        double mdna;
        int vM1=numeros.length/2;
        int vM2=(numeros.length/2)-1;
        Arrays.sort(numeros);
        if (numeros.length%2==0) {
            double sumaAvrg=numeros[vM1]+numeros[vM2];
            mdna=(sumaAvrg)/2;
        } else {
            mdna=numeros[vM1];
        }
        return mdna;
    }
    static int moda(int[] numeros)  {
        double trend;
        
        return trend;
    }

}
