package ud5;

import java.util.Arrays;
import java.util.Comparator;

public class E0910 {
    public static void main(String[] args) {
        
        Integer num[] = new Integer[20];
        for (int i = 0; i < num.length; i++) {
            num[i]=rng(1,100);
        }
        System.out.println(Arrays.toString(num));
        Arrays.sort(num,Comparator.reverseOrder());
        System.out.println(Arrays.toString(num));
    }    

    static int rng(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
