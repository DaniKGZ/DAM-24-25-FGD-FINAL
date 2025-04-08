package ud5.exercicios.herencias.puntos;

public class Punto {
    int x, y;
    
    Punto(int x, int y) {
        this.x=x;
        this.y=y;
    }

    double distancia(Punto otroPunto) {
        double distVer, distHor, dist;

        distVer= otroPunto.x-y;
        distHor= otroPunto.y-y;
        dist = Math.sqrt(distHor*distHor+distVer*distVer);

        return dist;
    }
    
    Boolean equals(Punto otroPunto) {
       if (x==otroPunto.x && y==otroPunto.x) {
        return true;
       } else return false;
    }
}
