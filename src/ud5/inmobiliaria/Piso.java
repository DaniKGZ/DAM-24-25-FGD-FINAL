package ud5.inmobiliaria;

public class Piso extends Inmueble{
    int piso;
    Piso(String dir, int m2, int hab, int ban, int piso) {
        super(dir, m2, hab, ban);
        this.piso=piso;
    }

    String detalle() {
        String out = "Piso en "+dir+".\n"+m2+" m2, "+hab+" hab "+ban+" baños, "+piso+"ª planta.";
        if (prAlq>0) out=out+"\nPrecio de alquiler: "+prAlq;
        if (prVen>0) out=out+"\nPrecio de venta: "+prVen;
        return out;
    }
    
}
