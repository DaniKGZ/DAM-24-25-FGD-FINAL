package ud5.exercicios.herencias.puntos;

public class Punto3D extends Punto {
    int z;
    Punto3D(int x, int y, int z) {
        super(x, y);
        this.z=z;
    }
    
    double distancia(Punto3D otroPunto) {
        double distVer, distHor, dist, distZ;

        distVer= otroPunto.x-y;
        distHor= otroPunto.y-y;
        distZ= otroPunto.z-z;

        dist = Math.sqrt(distHor*distHor+distVer*distVer+distZ*distZ);

        return dist;
    }

    Boolean equals(Punto3D otroPunto) {
        if (x==otroPunto.x && y==otroPunto.x && z==otroPunto.z) {
         return true;
        } else return false;
     }
}
