package ud6.e1210;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class E1210 implements List{
    public static void main(String[] args) {
        List<Integer> listaRand = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaRand.add(rng(1,10));
        }
    }
                
    static int rng(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }


}


