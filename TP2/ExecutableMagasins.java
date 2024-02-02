import java.util.ArrayList ;
import java.util.List ;

public class ExecutableMagasins {
    public static void main(String[] args) {
        Magasin fleurus = new Magasin("Fleurus", true, false);

        Ville trainou = new Ville("Trainou");
        trainou.ajouteMagasin("BeauMagasin", true, true);
        trainou.ajouteMagasin("Venir", false, false);
        trainou.ajouteMagasin("Magnifique", false, true);
        trainou.ajouteMagasin("Beauchamp", true, false);

        System.out.println(fleurus.getNom());
        System.out.println(fleurus.getOuvertLundi());
        System.out.println(fleurus.getOuvertDimanche());
        System.out.println(fleurus);

        System.out.println(trainou.ouvertsLeLundi());
        System.out.println(trainou);
    }
}
