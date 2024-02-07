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
        int agePlusJeune = this.lesConvives.get(0).getAge();
        String nomPlusJeune = this.lesConvives.get(0).getNom();
        for(Personne convive : this.lesConvives){
            if(convive.getAge() < agePlusJeune){
                agePlusJeune = convive.getAge();
                nomPlusJeune = convive.getNom();
            }
        }
        return nomPlusJeune;
    }

    public int nombreDAdultes() {
        int nombreDAdultes = 0;
        for(Personne convive : this.lesConvives){
            if(convive.getAge() >= 18){
                nombreDAdultes += 1;
            }
        }
        return nombreDAdultes;
    }
    public void echange(String string, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'echange'");
    }
}