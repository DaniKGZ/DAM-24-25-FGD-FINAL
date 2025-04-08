package ud5.inmobiliaria;

public abstract class Inmueble implements Comparable{
    //Inmueble piso1 = new Piso("Calle Curtidoira", 100, 3, 2, 5); 
    int m2, hab, ban, prAlq, prVen;
    String dir;
    Inmueble(String dir, int m2, int hab, int ban) {
        this.dir=dir;
        this.m2=m2;
        this.hab=hab;
        this.ban=ban;
    }

    abstract String detalle();

    @Override
    public String toString() {
        return "Inmueble en "+dir+" ("+m2+" m2, "+hab+" hab)";
    }

    void setPrecioAlquiler(int precio) {
        prAlq=precio;
    }

    void setPrecioVenta(int precio) {
        prVen=precio;
    }

    @Override
    public int compareTo(Object o) {
        int res = dir.compareTo(((Inmueble)o).dir);
        return res; 
    }
}
