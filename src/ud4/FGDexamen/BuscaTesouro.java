/* Autor:Daniel Fernandez Garcia // DAM1 */

package ud4.FGDexamen;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaTesouro {
    public static void main(String[] args) {
        int alto, ancho, maxIntentos, intentos=0;
        Boolean win = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el ancho y el alto (en ese orden) del mapa en el que quieres jugar.");
        ancho=sc.nextInt();
        sc.nextLine();
        alto=sc.nextInt();
        int[][] mapa = new int[ancho][alto];
        maxIntentos=(int) Math.ceil(((double) ancho*(double) alto)/10);
        char mapaJugable[][] = crearMapaJugable(mapa);
        colocarTesoro(mapa);
        System.out.println("Aqui tienes el mapa. Los · Simbolizan las posiciones que aun no has revisado.");
        System.out.println("Las X significaran puntos que has revisado y no son la ubicacion del tesoro");
        System.out.println("Cuando encuentres el tesoro, este se marcara con una O");
        System.out.println("Las coordenadas se dan de la siguiente manera: X=0, Y=0 Es el valor de la esquina superior izquierda. Cada aumento en X es un paso a la derecha y cada aumento en Y es un paso hacia abajo.");
        System.out.println(Arrays.toString(buscar(mapa, 1)));
        imprimirMapa(mapaJugable);
        do {
            System.out.println("Intentos restantes: " + (maxIntentos-intentos));
            win=adivinar(mapa, mapaJugable);
            intentos++;
        } while (win==false && intentos < maxIntentos);
        if (win==true) {
            System.out.println("Enhorabuena! Has ganado.");
        } else System.out.println("Te has quedado sin intentos!");
        sc.close();
    }

    static void colocarTesoro(int mapa[][]) {
        mapa[rng(0,mapa.length-1)][rng(0,mapa[0].length-1)] = 1;
    }

    static void imprimirMapa(char t[][]) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("| "+Arrays.toString(t[i])+" |");
        }
    }

    static void imprimirMapa(int t[][]) {
        for (int i = 0; i < t.length; i++) {
            System.out.println("| "+Arrays.toString(t[i])+" |");
        }
    }

    static char[][] crearMapaJugable(int mapa[][]) {
        char[][]t=new char[mapa.length][mapa[0].length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[i][j] = '·';
            }
        }
        return t;
    }

    static Boolean adivinar(int mapa[][], char mapaJ[][]) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Dame la coordenada X");
        x=sc.nextInt();
        sc.nextLine();
        System.out.println("Dame la coordenada Y");
        y=sc.nextInt();

        if(mapa[y][x]==1) {
            mapaJ[y][x] ='O';
            imprimirMapa(mapaJ);
            return true;
        }   else {
            mapaJ[y][x] = 'X';
            System.out.println("El tesoro esta al "+direccion(mapa, x, y));
            imprimirMapa(mapaJ);
            return false;
        }
    }

    static int rng(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    static String direccion(int mapa[][], int x, int y) {
        String[] direcciones = {"norte", "sur", "este", "oeste", "noroeste", "noreste", "sudoeste", "sudeste"};
        int tesoroC[] = buscar(mapa, 1);
        int coords[] = {x, y};
        if (coords[0]==tesoroC[0] && coords[1]<tesoroC[1]) {
             return direcciones[1]; //sur
        } else if (coords[0]==tesoroC[0] && coords[1]>tesoroC[1]) {
            return direcciones[0]; //norte
        } else if (coords[0]<tesoroC[0] && coords[1]==tesoroC[1]) {
            return direcciones[2]; //este
        } else if (coords[0]>tesoroC[0] && coords[1]==tesoroC[1]) {
            return direcciones[3]; //oeste
        } else if (coords[0]<tesoroC[0] && coords[1]<tesoroC[1]) {
            return direcciones[7];
        } else if (coords[0]>tesoroC[0] && coords[1]>tesoroC[1]) {
            return direcciones[4];
        } else if (coords[0]<tesoroC[0] && coords[1]>tesoroC[1]) {
            return direcciones[5];
        } else if (coords[0]>tesoroC[0] && coords[1]<tesoroC[1]) {
            return direcciones[6];
        } else return null;
    }

    static int[] buscar(int t[][], int clave) { 
        int[] coordenadas= new int[2];
        for(int i = 0; i < t.length; i++) 
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] == clave) {
                    coordenadas[0] = j;
                                coordenadas[1] = i;
                    
                } 
            } 
        return coordenadas; 
    } 
}


