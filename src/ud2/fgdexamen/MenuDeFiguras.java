package ud2.fgdexamen;

import java.util.InputMismatchException;
import java.util.Scanner;
@SuppressWarnings("resource")
public class MenuDeFiguras {
    public static int tryCatchInt(int input) {
        Scanner sc = new Scanner(System.in);
        Boolean isInOk;
        do {
            isInOk = true;
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido! Recuerda que debes\nintroducir un integral comprendido entre 2 y 20.\n");
                isInOk=false;
                sc.nextLine();
            }
            if (input>=2 && input <=20) isInOk=true;
            else isInOk=false;
        } while (isInOk==false);
        return input;
    }

    public static Boolean menu() {
        
        Scanner sc = new Scanner(System.in);
        Boolean isInOk=true, finPrograma = false;
        int input=0, errorCount = 0, base=0, altura=0;
        do {
            System.out.println("0. SALIR\n1.TRIANGULO\n2.RECTANGULO");
            do {
                try {
                    isInOk=true;
                    input = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Opcion invalida.\n\n");
                    isInOk = false;
                    sc.nextLine();
                    errorCount++;
                }
            } while (isInOk==false && errorCount < 3);
            System.out.println(input);
            if (errorCount < 3) {
                switch (input) {
                    case 0:
                        System.out.println("Fin del programa");
                        finPrograma = true;
                        sc.nextLine();                    
                        break;
                    case 1:
                            System.out.println("Dame un numero entre 2 y 20 para determinar la altura del triangulo.");
                            altura = tryCatchInt(altura);
                            triangulo(altura);
                            sc.nextLine();                    
                            break;
                    case 2:
                        System.out.println("Dame un numero entre 2 y 20 para determinar la base del rectangulo.");
                            base = tryCatchInt(base);
                            System.out.println("Dame un numero entre 2 y 20 para determinar la altura del rectangulo.");
                            altura = tryCatchInt(altura);
                            rectangulo(base, altura);    
                            sc.nextLine();               
                            break;
                    default:
                        System.out.println("Opcion invalida.\n\n");
                        isInOk = false;
                        sc.nextLine();                    
                        errorCount++;
                        break;
                }
            }
        } while (isInOk == false && errorCount < 3);
        if (errorCount >= 3)
            finPrograma = true;

        return finPrograma;
    }

    public static void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void rectangulo(int base, int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Boolean finPrograma = false;

        do {
            finPrograma = menu();
        } while (finPrograma == false);
    }
}
