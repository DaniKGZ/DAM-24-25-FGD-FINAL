package ud3.exercicios;

public class Sintonizador {
    public double frec;

    public Sintonizador() {
        frec = 80;
    }

    public void up() {
        if (frec<108) {
            frec=+0.5;
        } else frec=80;
    }
    public void down() {
        if (frec>80) {
            frec=+0.5;
        } else frec=108;
    }
    public void show() {
        System.out.printf("%.1d MHz\n", frec);
    }
}
