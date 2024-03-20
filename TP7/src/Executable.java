import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Executable {
    public static void main(String[] args) {
        // Personne a = new Personne("a", 0);
        // Personne b = new Personne("b", 0);
        // Personne c = new Personne("c", 2);
        // Personne d = new Personne("d", 1);

        // ListePersonnes l = new ListePersonnes();

        // l.ajouterPersonne(a);
        // l.ajouterPersonne(b);
        // l.ajouterPersonne(c);
        // l.ajouterPersonne(d);

        // System.out.println(l.toString());
        // l.trierListeSelonAge();
        // System.out.println(l.toString());

        // System.out.println(l.getAgeEcartMini());
        
        List<Complexe> listeComplexes = Arrays.asList(new Complexe(2, 5), new Complexe(1, 6), new Complexe(3, 0));
    
        Comparator<Complexe> comp = new ComparerComplexe();

        System.out.println(listeComplexes);
        Collections.sort(listeComplexes, comp);
        System.out.println(listeComplexes);
    }
}
