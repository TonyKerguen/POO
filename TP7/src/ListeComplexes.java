import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListeComplexes {
    private List<Complexe> listeComplexes;

    public ListeComplexes(List<Complexe> listeComplexes) {
        this.listeComplexes = listeComplexes;
    }

    public boolean estLePlusPetit(Comparator c, Complexe complexe) {
        return complexe.getNorme() < Collections.min(this.listeComplexes, c).getNorme();
    }

    public boolean estComprisEntre(Comparator c, Complexe complexemin, Complexe complexemax) {
        return Collections.min(this.listeComplexes, c).getNorme() > complexemin.getNorme() && Collections.max(this.listeComplexes, c).getNorme() < complexemax.getNorme();
    }
}
