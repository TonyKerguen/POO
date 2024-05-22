import java.util.ArrayList ;
import java.util.List ;

public class ExecutableMagasins {
    public static void main(String[] args) {
        // Magasin fleurus = new Magasin("Fleurus", true, false);

        // Ville trainou = new Ville("Trainou");
        // trainou.ajouteMagasin("BeauMagasin", true, true);
        // trainou.ajouteMagasin("Venir", false, false);
        // trainou.ajouteMagasin("Magnifique", false, true);
        // trainou.ajouteMagasin("Beauchamp", true, false);

        // System.out.println(fleurus.getNom());
        // System.out.println(fleurus.getOuvertLundi());
        // System.out.println(fleurus.getOuvertDimanche());
        // System.out.println(fleurus);

        // System.out.println(trainou.ouvertsLeLundi());
        // System.out.println(trainou);

        Produit salade1 = new Produit("Salade", 1.5);
        Produit brocolis = new Produit("Brocolis", 2.75);
        System.out.println(salade1);

        Achat achats = new Achat();

        achats.ajouter(salade1,2);
        // achats.ajouter(brocolis,3);
        // achats.ajouter(salade1,3);

        System.out.println(achats);
        System.out.println(achats.prixTotal());
    }
}
