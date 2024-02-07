import java.util.ArrayList;
import java.util.Calendar;

public class Cave {

    private ArrayList<Bouteille> bouteilles;

    public Cave() {
        this.bouteilles = new ArrayList<Bouteille>();
    }

    public void ajouteBouteille(String region, String appellation, int millesime) {
        this.bouteilles.add(new Bouteille(region, appellation, millesime));
    }

    public int nbBouteilles() {
        return this.bouteilles.size();
    }

    public int nbBouteillesDeRegion(String region) {
        int nbBouteillesDeRegion = 0;
        for(Bouteille b : this.bouteilles) {
            if(b.getRegion() == region) {
                nbBouteillesDeRegion += 1;
            }
        }
        return nbBouteillesDeRegion;
    }

    public Bouteille plusVieilleBouteille() {
        int anneeMin = Calendar.getInstance().get(Calendar.YEAR);
        Bouteille plusVieilleBouteille = null;
        for(Bouteille b: this.bouteilles) {
            if(b.getMillesime() < anneeMin) {
                anneeMin = b.getMillesime();
                plusVieilleBouteille = b;
            }
        }
        return plusVieilleBouteille;
    }

    public boolean contient(String region, String appellation, int millesime) {
        Bouteille recherche = new Bouteille(region, appellation, millesime);
        for(Bouteille b : this.bouteilles) {
            if(b.equals(recherche)){
                return true;
            }
        }
        return false;
    }

}
