package ud5.inmobiliaria;
import java.util.Comparator;
public class CompInm implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2) {
        return(((Inmueble) ob1).prAlq - ((Inmueble) ob2).prAlq);
    }    
}
