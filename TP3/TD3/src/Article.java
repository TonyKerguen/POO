
public class Article {

    private int ref;
    private String nom;
    private Double prix;
    private boolean vendu;

    public Article(int ref, String nom, Double prix) {
        this.ref = ref;
        this.nom = nom;
        this.prix = prix;
        this.vendu = false;
    }

    public Double getPrix() {
        return this.prix;
    }

    public String getNom() {
        return this.nom;
    }

    public int getRef() {
        return this.ref;
    }

    public void vendre() {
        this.vendu = true;
    }

    @Override
    public boolean equals(Object objet) {
    if (objet == null) {return false;}
    if (objet == this) {return true;}
    if (! (objet instanceof Article)) {return false;}
    Article a = (Article) objet;
    return a.nom == this.nom && a.ref == this.ref && a.prix == this.prix;
    }

    @Override
    public String toString() {
        return "Ref : "+this.ref+" Nom : "+this.nom+" Prix : "+this.prix+" Vendu : "+this.vendu;
    }
}
