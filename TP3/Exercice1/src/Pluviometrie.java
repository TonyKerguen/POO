
public class Pluviometrie {

    private int annee;
    private int semaine;
    private Integer[] precipitation;

    public Pluviometrie(int annee, int semaine) {
        this.annee = annee;
        this.semaine = semaine;
        this.precipitation = new Integer[7];
        for(int i = 0; i < 7; i++){
            this.precipitation[i] = null;
        }
    }

    public void setPrecipitation(int jour, Integer pluit) {
        this.precipitation[jour] = pluit;
    }

    public Integer getPluie(Integer jour) {
        return this.precipitation[jour];
    }

    public Integer quantiteTotale() {
        Integer quantiteTotale = 0;
        for(Integer i = 0; i < 7; i++){
            if(this.getPluie(i) != null){
               quantiteTotale += this.getPluie(i); 
            }
        }
        return quantiteTotale;
    }

    public Integer quantiteMax() {
        Integer quantiteMax = 0;
        for(Integer i = 0; i < 7; i++){
            if(this.getPluie(i) != null){
                if(this.getPluie(i) > quantiteMax){
                    quantiteMax = this.getPluie(i);
                }
            }
        }
        return quantiteMax;
    }

    public boolean estPluvieuse() {
        boolean ilAPlusHier = false;
        for(int i = 0; i < 7; i++){
            if(this.getPluie(i) != null){
                if(this.getPluie(i) > 0){
                    if(ilAPlusHier){
                        return true;
                    }
                    else{
                        ilAPlusHier = true;
                    }
                }
                else{
                    ilAPlusHier = false;
                }
            }
            else{
                ilAPlusHier = false;
            }
        }
        return false;
    }

}
