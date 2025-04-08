package ud5.inmobiliaria;

public class Casa extends Inmueble {
    int terr;

    Casa(String dir, int m2, int hab, int ban, int terr) {
            super(dir, m2, hab, ban);
            this.terr=terr;
        }
    
    String detalle() {
        String out = "Casa en "+dir+".\n"+m2+" m2, "+hab+" hab "+ban+" baños, con terreno de "+terr+" m2.";
        if (prAlq>0) out=out+"\nPrecio de alquiler: "+prAlq;
        if (prVen>0) out=out+"\nPrecio de venta: "+prVen;
        return out;
    }
    
}
