package ud4.exercicios;

import java.util.Scanner;

public class E0518 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int col, comp=0;
        Boolean magica=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los 16 valores de la matriz de izquierda a derecha y de arriba a abajo.");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[j][i]=sc.nextInt();
            }
        }
        System.out.println("\nMatriz resultante:\n");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("|  ");
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[j][i]);
                System.out.print("  ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
        col=mat[0][0]+mat[0][1]+mat[0][2]+mat[0][3];
        for (int i = 0; i < mat.length; i++) {
            comp=mat[i][0]+mat[i][1]+mat[i][2]+mat[i][3];
            if (comp!=col) {
                magica=false;
                break;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            comp=mat[0][i]+mat[1][i]+mat[2][i]+mat[3][i];
            if (comp!=col) {
                magica=false;
                break;
            }
        }
        if (magica==false) {
            System.out.println("No es magica");
        } else System.out.println("Es magica");
        sc.close();
    }
}
