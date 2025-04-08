package ud4.exercicios.practicas;

import java.util.Random;

public class ConceptosProgramacion {
    public static void main(String[] args) {

        String[] arr = {"Algoritmo", "Lenguaje de programación", "Entorno de desarrollo", "Compilación", "Ejecución", "Código fuente", "Bytecode", "Código objeto"} ;
        System.out.println(fraseAleatoria(arr));;
    }

    static String fraseAleatoria(String t[]) {
        String frase;
        int pos, maxR, minR=0;
        maxR= t.length-1;
        Random rng = new Random();

        pos = rng.nextInt(maxR - minR + 1) + minR;

        frase=t[pos];
        return frase;
    }
}
