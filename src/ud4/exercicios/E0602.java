package ud4.exercicios;

import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        String cad1, cad2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 2 frases");
        cad1=sc.nextLine();
        cad2=sc.nextLine();
        if (cad1.length()>cad2.length()) {
            System.out.println(cad1+" - Es la frase mas larga");
        } else System.out.println(cad2+" - Es la frase mas larga");
    }

}
