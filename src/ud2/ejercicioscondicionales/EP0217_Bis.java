/*
Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. 
La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.

Pista: Puedes utilizar el método random() de la clase Math o la clase Random.

*/
package ud2.ejercicioscondicionales;

import java.util.Scanner;
//import java.time.LocalTime;

public class EP0217_Bis {
    public static void main(String[] args) {
        
        final byte MAX = 99;
        final byte MIN = 1;

        Scanner sc = new Scanner(System.in);

        // Alternativa a usar milisegundos usando la libreria LocalTime

        //LocalTime horaInicial = LocalTime.now();

        // Math.random() * (MAX - MIN + 1) ) + MIN
        int a = (int)(Math.random() * MAX ) + MIN;
        int b = (int)(Math.random() * MAX ) + MIN;

        System.out.printf("Cual es el resultado de %d + %d?\n",a,b);
        int resultado = sc.nextInt();
        sc.close();
        

        
        
        //LocalTime horaFinal = LocalTime.now();
        //int dif = horaFinal.toSecondOfDay()-horaInicial.toSecondOfDay();




        System.out.println(resultado == a + b ? "Correcto" : "Incorrecto");



    }
}
