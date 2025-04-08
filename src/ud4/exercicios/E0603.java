package ud4.exercicios;

import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {
        String cadI, contra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña");
        contra=sc.nextLine();
        System.out.println("Intenta averiguar la contraseña.");
        do {
            cadI=sc.nextLine();
            if (cadI.compareTo(contra)!=0) {
                
                System.out.println("Contraseña incorrecta, vuelve a intentarlo");
                System.out.println(contra);
            }
        } while (cadI.compareTo(contra)!=0);

        System.out.println("Correcto! la contraseña era: "+contra);

    }
}
