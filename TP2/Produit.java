public class Produit {

    private String nom;
    private double prix;

    public Produit(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom(){
        return this.nom;
    }

    public double getPrix(){
        return this.prix;
    }

    @Override
    public String toString(){
        return this.getNom() + " pour " + this.getPrix() + " euro(s).";
    }
}