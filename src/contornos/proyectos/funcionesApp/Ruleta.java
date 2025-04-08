package contornos.proyectos.funcionesApp;

import java.util.Scanner;

public class Ruleta {
    
    double saldo;

    public Ruleta(double saldoIn) {
        saldo = saldoIn;
    }

    public static int menuR() {
        int input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Qué deseas hacer a continuación?");
            System.out.println("\n    1 - Tirar a rojo (impar) (x2)");
            System.out.println("    2 - Tirar a negro (par) (x2)");
            System.out.println("    3 - Tirar a primera mitad (x2)");
            System.out.println("    4 - Tirar a segunda mitad (x2)");
            System.out.println("    5 - Tirar a verde (0) (x5)");
            System.out.println("    0 - Terminar.");
            input = sc.nextInt();
            System.out.println(input);
        } while (input <= 0 && input >= 5);
        return input;
    }

    public static double apostado() {
        double importe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto quieres apostar en este giro?");
        importe=sc.nextDouble();
        return importe;
    }

    public static int giro() {
        int resultado;        
        resultado=randNumber(0,99);
        return resultado;
    }

    static double rojo(double importe) {
        int rand;
        rand=giro();
        System.out.println(rand);
        if (rand%2==1) {
            return importe;
        } else { return importe*(-1);}
    }
    
    static double negro(double importe) {
        int rand;
        rand=giro();
        System.out.println(rand);
        if (rand%2==0) {
            return importe;
        } else { return importe*(-1);}
    }
    
    static double pMit(double importe) {
        int rand;
        rand=giro();
        System.out.println(rand);
        if (rand<50) {
            return importe;
        } else { return importe*(-1);}
    }

    static double sMit(double importe) {
        int rand;
        rand=giro();
        System.out.println(rand);
        if (rand>=50) {
            return importe;
        } else { return importe*(-1);}

    }

    static double verde(double importe) {
        int rand;
        rand=giro();
        System.out.println(rand);
        if (rand==0) {
            return importe*4;
        } else { return importe*(-1);}
    }

    static int randNumber(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    public static void main(String[] args) {
        int resultado;
        double apostado=120, ganancia;
        Boolean fin=false;
        do {
            resultado=menuR();
            switch (resultado) {
                case 0:
                    fin=true;
                    System.out.println("Salchichada");
                    break;
                case 1:
                    ganancia=rojo(apostado);
                    System.out.println(ganancia);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:

                    break;
            }   } while (fin==false);
    }

}