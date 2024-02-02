public class Magasin {

    private String nom ;
    private boolean ouvertLundi ;
    private boolean ouvertDimanche ;

    public Magasin ( String nom , boolean lundi , boolean dimanche ) {
        this.nom = nom;
        this.ouvertLundi = lundi;
        this.ouvertDimanche = dimanche;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean getOuvertLundi() {
        return this.ouvertLundi;
    }

    public boolean getOuvertDimanche() {
        return this.ouvertDimanche;
    }

    @Override
    public String toString () {
        return "Le magasin "+this.getNom()+": ouvert le lundi : "+this.getOuvertLundi()+" ; ouvert le dimanche : "+this.getOuvertDimanche();
    }
}