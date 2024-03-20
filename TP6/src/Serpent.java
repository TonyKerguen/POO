public class Serpent extends Animal{
    
    private boolean estVenimeux;

    public Serpent(String nom, double poids, boolean estVenimeux) {
        super(nom, poids);
        this.estVenimeux = estVenimeux;
    }

    public void son() {
        System.out.println("KssssssssssssssSsssss");
    }

    @Override
    public String toString() {
        String venimeux = "";
        if(this.estVenimeux){
            venimeux = "est venimeux";
        }
        else{
            venimeux = "non venimeux";
        }
        return "Serpent "+super.toString()+venimeux;
    }
}
