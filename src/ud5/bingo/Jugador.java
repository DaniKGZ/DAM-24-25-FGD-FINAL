package bingo;

public class Jugador {
    final int FILAS=3, COLUMNAS=5;
    String nombre;
    int numCartones;
    Jugador(String nombre, int numCartones) {
        this.nombre=nombre;
        this.numCartones=numCartones;
    }

    class Carton {
        int[][] carton;
        Carton() {
            carton[][] c = new carton[FILAS][COLUMNAS];
        }
    }

    static int rng(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    
}
