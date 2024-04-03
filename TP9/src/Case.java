public class Case {

    protected int numero;
    protected Joueur leJoueur;

    public Case(int numero) {
        this.numero = numero;
        this.leJoueur = null;
    }

    public int getNumero() {
        return this.numero;
    }

    public Joueur getLeJoueur() {
        return this.leJoueur;
    }

    public void setLeJoueur(Joueur leJoueur) {
        if(leJoueur.getCaseActuel() != null){
            leJoueur.getCaseActuel().leJoueur = null;
        }
        this.leJoueur = leJoueur;
        leJoueur.setCaseActuel(this);
    }

    @Override
    public String toString() {
        return "Case, numero = " + this.getNumero() + " contient le joueur " + this.getLeJoueur();
    }
}
