import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class IterAgenda implements Iterator<List<RendezVous>>{

    private List<RendezVous> contenu;
    private int position;

    public IterAgenda(List<RendezVous> contenu) {
        this.contenu = contenu;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < contenu.size();
    }

    @Override
    public RendezVous next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        RendezVous r = contenu.get(position);
        position += 1;
        return r;
    } 
}
