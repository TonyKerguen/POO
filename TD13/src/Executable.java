import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Executable {
    public static void main(String[] args) {

        // Simple<Integer> i = new Simple(12);
        // System.out.println(i);

        // Simple<String> s = new Simple("toto");
        // System.out.println(s);

        // Simple<Double> d = new Simple(5.5);
        // System.out.println(d);

        // Simple<Simple<Integer>> si = new Simple(new Simple(5));
        // System.out.println(si);

        // Simple<Simple<List<String>>> sls = new Simple(new Simple(new ArrayList<String>()));

        CoupleEntiers c1 = new CoupleEntiers(1,2);
        CoupleEntiers c2 = new CoupleEntiers(3,4);
        CoupleEntiers c3 = new CoupleEntiers(1,3);

        List<CoupleEntiers> lc = new ArrayList<>();
        lc.add(c1);
        lc.add(c2);
        lc.add(c3);
        System.out.println(lc);
        Collections.sort(lc);
        System.out.println(lc);

        // System.out.println(c1.compareTo(c2));
    }
}
