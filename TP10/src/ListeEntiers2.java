import java.util.ArrayList;
import java.util.List;

public class ListeEntiers2 extends ArrayList<Integer>{
    
    private List<Integer> entiers;

    public ListeEntiers2() {
        super();
    }

    /** remplissage liste */
    public void remplir() {
        int nb = (int) (Math.random() * 10);
        for (int i = 0; i < nb; ++i) {
            this.add((int) (Math.random() * 50));
        }
    }

}
