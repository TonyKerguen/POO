import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Magasin {

    private String nom;
    private ArrayList<Article> articles;
    
    public Magasin(String nom) {
        this.nom = nom;
        this.articles = new ArrayList<Article>();
    }

    public void ajouter(Article a) {
        this.articles.add(a);
    }

    public String prixTotal() {
        Double total = 0.0;
        for(Article a : this.articles){
            total += a.getPrix();
        }
        return String.valueOf(total);
    }

    public void vendre(Article a) {
        for(Article b : this.articles) {
            if(a.equals(b)){
                a.vendre();
            }
        }
    }

    public ArrayList<Article> vendus() {
        ArrayList<Article> articlesVendu = new ArrayList<Article>();
        for(Article a : this.articles) {
            articlesVendu.add(a);
        }
        return articlesVendu;
        
    }

    public String leMoinsCher() {
        Double leMoinsCher = this.articles.get(0).getPrix();
        String nomLeMoinsCher = this.articles.get(0).toString();
        for(Article a : this.articles) {
            if(a.getPrix() < leMoinsCher){
                leMoinsCher = a.getPrix();
                nomLeMoinsCher = a.toString();
            }
        }
        return nomLeMoinsCher;
    }

    public String trouver(int ref) {
        for(Article a : this.articles) {
            if(a.getRef() == ref){
                return a.toString();
            }
        }
        return "L'article n'a pas été trouvé";
    }

    @Override
    public String toString() {
        return "Nom magasin : "+this.nom;
    }

}
