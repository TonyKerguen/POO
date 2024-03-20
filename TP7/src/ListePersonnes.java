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

    public int getAgeEcartMini() {
        if(this.listePersonnes.size()>=2) {
            ListePersonnes l = this;
            l.trierListeSelonAge();
            int min = l.listePersonnes.get(1).getAge() - l.listePersonnes.get(0).getAge();
            for(int i = 1; i < l.listePersonnes.size(); i++) {
                int ecart = l.listePersonnes.get(i).getAge() - l.listePersonnes.get(i - 1).getAge();
                if(min > ecart) {
                    min = ecart;
                }
            }
            return min;
        }
        else {
            System.out.println("Il faut au moins 2 personnes dans la liste");
            return 0;
        }
        
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
