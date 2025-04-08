package ud4.exercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 1, 9, 4 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        desordenar(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void desordenar(int t[]) {
        int minR = 0;
        int maxR = t.length-1;
        Random rng = new Random();
        int value;
        int c[] = new int[t.length];
        System.out.println(Arrays.toString(c));
        for (int i = 0; i <= (t.length-1); i++) {
            do {
                value = rng.nextInt(maxR - minR + 1) + minR;
             //   if(c[i]==0) {
                    c[i] = t[value];
               // }

                
            } while (i == value || c[i]==0);
        }
        System.out.println(Arrays.toString(c));
    }

}
