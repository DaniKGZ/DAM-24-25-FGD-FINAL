/* Autor: Daniel Fernandez Garcia // DAM1 */

package ud4.FGDexamen;

public class ComplejidadCiclomatica {
    public static void main(String[] args) {
    }   
    
    static int complejidadCiclomatica(int[][] grafo) {
        int out, A=0, N;
        N=grafo.length;
        for (int i = 0; i < grafo.length; i++) {
            A += grafo[i].length;
        }
        out=A-N+2;
        return out;
    }
}
