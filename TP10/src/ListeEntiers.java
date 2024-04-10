import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class ListeEntiers {
    private List<Integer> entiers;

    public ListeEntiers() {
        this.entiers = new ArrayList<>();
    }

    /** remplissage liste */
    public void remplir() {
        int nb = (int) (Math.random() * 10);
        for (int i = 0; i < nb; ++i) {
            this.entiers.add((int) (Math.random() * 50));
        }
    }

    /** getter */
    public List<Integer> getEntiers() {
        return this.entiers;
    }

    @Override
    public String toString() {
        return this.entiers.toString();
    }

}