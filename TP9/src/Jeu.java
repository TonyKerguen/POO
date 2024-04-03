import java.util.List;

public class Jeu {
    
    private List<Joueur> lesJoueurs;
    private Plateau lePlateau;

    public Jeu(List<Joueur> lesJoueurs, Plateau lePlateau) {
        this.lesJoueurs = lesJoueurs;
        this.lePlateau = lePlateau;
    }

    public List<Joueur> getLesJoueurs() {
        return this.lesJoueurs;
    }

    public Plateau getLePlateau() {
        return this.lePlateau;
    }

    public int lancerDeD(){
        return (int) Math.random()%6+1 + (int) Math.random()%6+1; 
    }
}
