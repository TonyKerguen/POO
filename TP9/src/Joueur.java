public class Joueur {

    private String nom;
    private Case caseActuel;

    public Joueur(String nom) {
        this.nom = nom;
        this.caseActuel = null;
    }

    public String getNom() {
        return this.nom;
    }

    public Case getCaseActuel() {
        return this.caseActuel;
    }

    public void setCaseActuel(Case c) {
        this.caseActuel = c;
    }

    @Override
    public String toString() {
        if(this.getCaseActuel() == null){
            return this.getNom() + " sur aucune case actuelement";
        }
        return this.getNom() + " sur la case " + this.getCaseActuel();
    }

}
