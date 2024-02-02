public class Personnage {
    private String nom;
    private int tailleDeBarbe;
    private int tailleDesOreilles;

    public Personnage(String nom, int tailleDeBarbe, int tailleDesOreilles) {
        this.nom = nom;
        this.tailleDeBarbe = tailleDeBarbe;
        this.tailleDesOreilles = tailleDesOreilles;
    }

    public String getNom() {
        return this.nom;
    }

    public int getBarbe() {
        return this.tailleDeBarbe;
    }

    public int getTailleDesOreilles() {
        return this.tailleDesOreilles;
    }
}
