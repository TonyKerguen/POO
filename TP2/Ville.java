import java.util.ArrayList ;
import java.util.List ;

public class Ville {

    private String nom ;
    private List<Magasin> magasins ;

    public Ville(String nom) {
        this.nom = nom;
        this.magasins = new ArrayList<>();
    }

    public void ajouteMagasin(String nom , boolean lundi , boolean dimanche) {
        this.magasins.add(new Magasin(nom, lundi, dimanche));
    }

    public List<Magasin> ouvertsLeLundi() {
        List<Magasin> res = new ArrayList<>();
        for(Magasin magasin : this.magasins){
            if(magasin.getOuvertLundi()){
                res.add(magasin);
            }
        }
        return res;
    }
    @Override
    public String toString() {
        return "Dans la ville "+this.nom+" il y a les magasins : "+this.magasins;
    }
}