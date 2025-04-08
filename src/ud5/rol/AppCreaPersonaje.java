package ud5.rol;

import java.util.Scanner;
import ud5.rol.Personaje;

public class AppCreaPersonaje {
    public static void main(String[] args) throws Exception {
        int nivel, exp, hp, str, agi, cons;
        String nombre, raza;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu personaje.");
        nombre=sc.nextLine();
        System.out.println("Introduce la raza");
        raza=sc.nextLine();
        System.out.println("Introduce el nivel");
        nivel=sc.nextInt();
        System.out.println("Introduce la exp");
        exp=sc.nextInt();
        System.out.println("Introduce la vida maxima");
        hp=sc.nextInt();
        System.out.println("Introduce la fuerza");
        str=sc.nextInt();
        System.out.println("Introduce la agilidad");
        agi=sc.nextInt();
        System.out.println("Introduce la constitucion");
        cons=sc.nextInt();

        Personaje personaje = new Personaje(nombre, raza, nivel, exp, str, agi, cons, hp);
        personaje.mostrar();
    }
}
