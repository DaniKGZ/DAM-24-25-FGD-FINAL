package ud3.exercicios;

//import ud3.exercicios.Sintonizador;
import ud3.exercicios.Sintonizador;

public class E0708 {
    public static void main(String[] args) {
        Sintonizador sinte = new Sintonizador();

        sinte.show();
        sinte.up();
        sinte.show();
        for (int i = 0; i < 5; i++) {
            sinte.down();
            sinte.show();
        }
    }


}
