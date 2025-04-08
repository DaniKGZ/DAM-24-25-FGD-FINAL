package ud4.exercicios;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        char input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introudce un caracter");
        input=sc.nextLine().charAt(0);

        if (Character.isDigit(input)==true) {
            System.out.println("Es un digito");
        }
        if (Character.isLetter(input)==true) {
            System.out.println("Es una letra");
        }
        if (Character.isLetterOrDigit(input)==true) {
            System.out.println("Es un digito o una letra");
        }
        if (Character.isLetterOrDigit(input)==false) {
            System.out.println("Es un caracter no alfanumerico.");
        }
        
        if (Character.isLowerCase(input)==true) {
            System.out.println("Es minuscula");
            if (Character.isLowerCase(input)==true) {
                System.out.println("\tLetra en mayuscula: "+ Character.toUpperCase(input));
            }
        }
        if (Character.isUpperCase(input)==true) {
            System.out.println("Es mayuscula");
            if (Character.isUpperCase(input)==true) {
                System.out.println("\tLetra en minuscula: "+ Character.toLowerCase(input));
            }
        }
        if (Character.isWhitespace(input)==true) {
            System.out.println("Es un espacio blanco");
        }
        sc.close();
    }
}
