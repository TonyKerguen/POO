import java.util.ArrayList;

public class Groupe {

    private String nom;
    private ArrayList<Personnage> membres;

    public Groupe(String nom) {
        this.nom = nom;
        this.membres = new ArrayList<Personnage>();
    }

    public void ajoute(Personnage personnage) {
        this.membres.add(personnage);
    }

    public void ajoute(String nom, int tailleBarbe, int tailleOreilles) {
        this.membres.add(new Personnage(nom, tailleBarbe, tailleOreilles));
    }

}
