package ud5.exercicios.herencias.puntos;

public class Suceso extends Punto3D {
    int tiempo;
    String descripcion;
    Suceso(int x, int y, int z, int tiempo, String descripcion) {
        super(x, y, z);
        this.tiempo=tiempo;
        this.descripcion= descripcion;
    }
    Boolean equals(Suceso otroSuc) {
         return (x==otroSuc.x && y==otroSuc.y && z==otroSuc.z && tiempo==otroSuc.tiempo && descripcion.equals(otroSuc.descripcion)==true);  
     }
}
