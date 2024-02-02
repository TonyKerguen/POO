import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<Personne> lesConvives;

    public Table() {
        this.lesConvives = new ArrayList<>();
    }
    public void ajouteConvive ( String nom , int age ) {
        Personne convive = new Personne(nom, age);
        this.lesConvives.add(convive);
    }
    public double mystere () {
        double somme = 0;
        for(Personne convive : this.lesConvives) {
            somme += convive . getAge ();
        }
        return somme/this.lesConvives.size();
    }
    public boolean sontACote(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sontACote'");
    }
    public String lePlusJeune() {
        int age = this.get(0).getAge();
    }

    public int nombreDAdultes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombreDAdultes'");
    }
    public void echange(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'echange'");
    }
}