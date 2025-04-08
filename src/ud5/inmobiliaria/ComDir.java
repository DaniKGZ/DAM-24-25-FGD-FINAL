package ud5.inmobiliaria;
import java.util.Comparator;
public class ComDir implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Inmueble) o1).dir.compareTo(((Inmueble)o2).dir); 
    }
}
