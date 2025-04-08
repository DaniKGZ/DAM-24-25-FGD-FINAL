package FGDexamen;
import java.util.Comparator;

public class CompRes implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Cliente c1 = (Cliente) o1;
            Cliente c2 = (Cliente) o2;
            String[] parts1 = c1.res.split("x");
            String[] parts2 = c2.res.split("x");
            int res1, res2;
            
            //res1= Integer.parseInt(parts1[0]) * Integer.parseInt(parts1[1]);
            res1= Integer.parseInt(parts1[0]) * Integer.parseInt(parts1[1]);
            res2= Integer.parseInt(parts2[0]) * Integer.parseInt(parts2[1]);
            //return c2.res.compareTo(c1.res);
            return res2-res1;
        }
}
