import java.util.ArrayList;

public class Maison {

    private String nom;
    private ArrayList<Sorcier> eleves;

    /**
     * Creé une maison avec un nom et sans élèves
     * @param nom
     */
    public Maison(String nom) {
        this.nom = nom;
        this.eleves = new ArrayList<Sorcier>();
    }

    /**
     * Ajoute un élève à la maison
     * @param nom
     * @param courage
     * @param sagesse
     */
    public void ajouter(String nom, int courage, int sagesse) {
        Sorcier s = new Sorcier(nom, courage, sagesse);
        if (!this.eleves.contains(s)) {
            this.eleves.add(s);
        }
    }

    /**
     * Retourne le nom de la maison
     * @return String
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne le nombre d'élèves dans la maison
     * @return int
     */
    public int nombreEleve() {
        return this.eleves.size();
    }

    /**
     * Retourne la liste des élèves de la maison
     * @return ArrayList<Sorcier>
     */
    public ArrayList<Sorcier> getEleves() {
        return this.eleves;
    }

    /**
     * Retourne vrai si la maison contient un élève courageux
     * @return boolean
     */
    public boolean contientCourageux() {
        for (Sorcier eleve : this.eleves) {
            if (eleve.estCourageux()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retourne le sorcier le moins courageux de la maison
     * @return Sorcier
     */
    public Sorcier leMoinsCourageux() {
        Sorcier moinsCourageux = this.eleves.get(0);
        for (Sorcier eleve : this.eleves) {
            if (eleve.getCourage() < moinsCourageux.getCourage()) {
                moinsCourageux = eleve;
            }
        }
        return moinsCourageux;
    }

    /**
     * Retourne le sorcier le plus sage de la maison
     * @return Sorcier
     */
    public Sorcier lePlusSage() {
        Sorcier plusSage = this.eleves.get(0);
        for (Sorcier eleve : this.eleves) {
            if (eleve.getSagesse() > plusSage.getSagesse()) {
                plusSage = eleve;
            }
        }
        return plusSage;
    }

    /**
     * Retourne vrai si la maison passer en parametre est la meme que la maison courante
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Maison) {
            Maison maison = (Maison) obj;
            return this.getNom().equals(maison.getNom());
        }
        return false;
    }
    
}
