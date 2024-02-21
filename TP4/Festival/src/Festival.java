import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Festival {

    private String nom;
    private String adresse;
    private ArrayList<Concert> concerts;

    public Festival(String nom) {
        this.nom = nom;
        this.concerts = new ArrayList<Concert>();
    }

    public void ajouterConcert(Concert c) {
        this.concerts.add(c);
    }

    public void reserver(Spectateur spectateur, Concert concert, int prix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reserver'");
    }

    public int nombreConcert() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombreConcert'");
    }

    public int nombreBilletConcert(Concert concert2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombreBilletConcert'");
    }

}
