import java.util.HashMap;
import java.util.Map;

public class Achat {
    
    private Map<Produit,Integer> ticket;

    public Achat(){
        this.ticket = new HashMap<>();
    }

    public void ajouter(Produit p, Integer q){
        if(this.ticket.keySet().contains(p)){
            Integer a = this.ticket.get(p);
            this.ticket.replace(p,a,q+a);
        }else{
            this.ticket.put(p,q);
        }
        
    }

    public double prixProduit(Produit p) throws PasDeProduitExecption {
        try {
            return this.ticket.get(p)*p.getPrix();
        } catch (PasDeProduitExecption e) {
            e.printStackTrace();
        }
    }

    public double prixTotal(){
        double somme = 0;
        for(Produit p:this.ticket.keySet()){
            somme += p.getPrix()*this.ticket.get(p);
        }
        return somme;
    }

    // public enum(TypeOrdre){
    //     NATUREL, INDUIT;
    // }

    public String toString(){
        return this.ticket.toString();
    }
}
