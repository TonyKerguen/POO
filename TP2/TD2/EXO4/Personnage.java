public class Personnage {

    private String nom;
    private int tailleBarbe;
    private int tailleOreilles;

    public Personnage(String nom, int tailleBarbe, int tailleOreilles) {
        this.nom = nom;
        this.tailleBarbe = tailleBarbe;
        this.tailleOreilles = tailleOreilles;
    }

    public String getNom() {
        return this.nom;
    }

    public int getBarbe() {
        return this.tailleBarbe;
    }

    public int getOreilles() {
        return this.tailleOreilles;
    }

}
