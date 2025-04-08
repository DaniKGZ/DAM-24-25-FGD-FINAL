package FGDexamen;
import java.util.Comparator;

public class CompSO implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Cliente c1 = (Cliente) o1;
            Cliente c2 = (Cliente) o2;
            return c1.sisOp.toString().compareTo(c2.sisOp.toString());
        }
}
