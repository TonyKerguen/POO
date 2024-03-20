public class Lion extends Animal{
    
    private boolean criniere;

    public Lion(String nom, double poids, boolean criniere) {
        super(nom, poids);
        this.criniere = criniere;
    }

    public void son() {
        System.out.println("Roaaaaaaaaar!!!!!!");
    }

    @Override
    public String toString() {
        String possedeCriniere = "";
        if(this.criniere){
            possedeCriniere = "possede une crinière";
        }
        else{
            possedeCriniere = "sans crinière";
        }
        return "Lion "+super.toString()+possedeCriniere;
    }
}
