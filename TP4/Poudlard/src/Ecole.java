import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ecole {

    private String nom;
    private ArrayList<Maison> maisons;

    /**
     * Crée une école avec un nom et sans maisons
     * @param nom
     */
    public Ecole(String nom) {
        this.nom = nom;
        this.maisons = new ArrayList<Maison>();
    }

    /**
     * Retourne le nom de l'école
     * @return String
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne la liste des maisons de l'école
     * @return ArrayList<Maison>
     */
    public ArrayList<Maison> getMaisons() {
        return this.maisons;
    }

    /**
     * Ajoute une maison à l'école
     * @param maison
     */
    public void ajouter(Maison maison) {
        if (!this.maisons.contains(maison)) {
            this.maisons.add(maison);
        }
        
    }

    /**
     * Retourne la maison avec le plus d'élèves
     * @return Maison
     */
    public Maison plusGrandeMaison() {
        Maison plusGrandeMaison = this.maisons.get(0);
        for (Maison maison : this.maisons) {
            if (maison.nombreEleve() > plusGrandeMaison.nombreEleve()) {
                plusGrandeMaison = maison;
            }
        }
        return plusGrandeMaison;
    }

    /**
     * Retourne la liste des élèves courageux de l'école
     * @return List<Sorcier>
     */
    public List<Sorcier> lesCourageux() {
        List<Sorcier> courageux = new ArrayList<Sorcier>();
        for (Maison maison : this.maisons) {
            for (Sorcier eleve : maison.getEleves()) {
                if (eleve.estCourageux()) {
                    courageux.add(eleve);
                }
            }
        }
        return courageux;
    }
    
}
