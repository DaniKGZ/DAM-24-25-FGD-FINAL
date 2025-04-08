<<<<<<< HEAD
package ud4.ArraysEstadisticas;
=======
package ud4.arraysEstadisticas;
>>>>>>> 2d3a85f305f3a680e5bd33ea15f154a49aa852ca

public class MatricesTriangulares {

    public static Boolean esTriangular(int[][] t){
        int length = t.length;

        for (int i = 0; i < t.length; i++){
            if (t[i].length != t.length){
                return false;
            }
        }
        
        return true;
    }
}
