package ud6.e1204;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/*
E1204. Implementar una aplicación que pida por consola números enteros no negativos 
hasta que se introduce un -1. Los números se irán insertando en una colección, 
pudiéndose repetir. Al terminar, se mostrará la colección por pantalla.  
A continuación, se mostrarán todos los valores pares. Por último, se eliminarán todos los 
múltiplos de 3 y se mostrará por pantalla la colección resultante. 
Practica el uso de iteradores y bucles for-each para recorrer la colección. 
 */

public class E1204 {
    public static void main(String[] args) {
        int in;
        Scanner sc = new Scanner(System.in);
        List<Num> listaClientes = new ArrayList<>(); 
        Collection<Int> colNum = numList;

        do {
            System.out.println("Dame un numero no negativo (introduce un negativo para finalizar)");
            if (in>=0) {
                in = sc.nextInt();
            } else System.out.println("Fin del escaneo.");
        } while (in>=0);
    }
}
