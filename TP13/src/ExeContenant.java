import java.util.ArrayList;
import java.util.List;

public class ExeContenant {
    public static void main(String[] args) {
        // CoupleGenerique c1 = new CoupleGenerique<Integer>(1, 2);
        // System.out.println(c1);

        // CoupleGenerique c2 = new CoupleGenerique<Double>(3.2, 4.6);
        // System.out.println(c2);

        CoupleEntiers c1 = new CoupleEntiers(0,1);
        CoupleEntiers c2 = new CoupleEntiers(0,2);

        List<Contenant<Integer>> maliste = new ArrayList<>();

        maliste.add(c1);
        maliste.add(c2);

        if(GestionContenants.contiennentTous(maliste, 0)){
            System.out.println("Tous les éléments contiennent 0");
        }
        else{
            System.out.println("Tous les éléments ne contiennent pas 0");
        }
    }
}
