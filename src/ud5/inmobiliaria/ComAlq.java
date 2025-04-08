package ud5.inmobiliaria;
import java.util.Comparator;
public class ComAlq implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2) {
        if (((Inmueble)ob1).prAlq!=0) {
            if (((Inmueble)ob2).prAlq!=0) {
                return(((Inmueble) ob1).prAlq - ((Inmueble) ob2).prAlq);
            } else {
                return(((Inmueble) ob1).prAlq - ((Inmueble) ob2).prVen);
            }
        } else {
            if (((Inmueble)ob2).prAlq!=0) {
                return(((Inmueble) ob1).prVen - ((Inmueble) ob2).prAlq);
            } else {
                return(((Inmueble) ob1).prVen - ((Inmueble) ob2).prVen);
            }
        }
    }    
}

// && ((Inmueble)ob2).prAlq!=0