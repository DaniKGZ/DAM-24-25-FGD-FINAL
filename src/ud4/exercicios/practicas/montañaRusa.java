package ud4.exercicios.practicas;

public class montañaRusa {
    public static void main(String[] args) {
        int[] picos={1, 4, 2, 5, 7 , 8, 12, 14};
        System.out.println(contarPicos(picos));
    }

    static int contarPicos(int[] t) {
        int picos=0;
        for (int i = 1; i < (t.length-1); i++) {
            if (t[i-1] < t[i] && t[i] > t[i+1]) picos++;
        }
        return picos;
    }
}
