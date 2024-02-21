public class Sorcier {

    private String nom;
    private int courage;
    private int sagesse;

    /**
     * Crée un sorcier avec un nom, un courage et une sagesse
     * @param nom
     * @param courage
     * @param sagesse
     */
    public Sorcier(String nom, int courage, int sagesse) {
        this.nom = nom;
        this.courage = courage;
        this.sagesse = sagesse;
    }

    /**
     * Retourne le nom du sorcier
     * @return String
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne le courage du sorcier
     * @return int
     */
    public int getCourage() {
        return this.courage;
    }

    /**
     * Retourne la sagesse du sorcier
     * @return int
     */
    public int getSagesse() {
        return this.sagesse;
    }

    /**
     * Retourne vrai si le sorcier est courageux
     * @return boolean
     */
    public boolean estCourageux() {
        return this.getCourage() > 8;
    }

    /**
     * Retourne vrai si le sorcier passer en parametre est le meme que le sorcier courant
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
        if (obj instanceof Sorcier) {
            Sorcier sorcier = (Sorcier) obj;
            return this.getNom().equals(sorcier.getNom()) && this.getCourage() == sorcier.getCourage() && this.getSagesse() == sorcier.getSagesse();
        }
        return false;
    }
    
    /**
     * Retourne le nom du sorcier
     * @return String
     */
    @Override
    public String toString() {
        return this.getNom();
    }
}
