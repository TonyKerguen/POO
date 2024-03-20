import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ListePersonnes {
    private List<Personne> listePersonnes;

    public ListePersonnes(List<Personne> liste) {
        this.listePersonnes = liste;
    }

    public ListePersonnes() {
        this.listePersonnes = new ArrayList<>();
    }

    public void ajouterPersonne(Personne p) {
        this.listePersonnes.add(p);
    }

    public void trierListeSelonAge() {
        Collections.sort(this.listePersonnes);
    }

    @Override
    public String toString() {
        String list = "";
        for(Personne p:this.listePersonnes) {
            list+=p.toString();
        }
        return list;
    }
}
