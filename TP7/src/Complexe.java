public class Complexe {

    private double reel;
    private double imaginaire;

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public double getReel() {
        return this.reel;
    }

    public double getImaginaire() {
        return this.imaginaire;
    }

    public double getNorme() {
        return this.getReel()*this.getReel() + this.getImaginaire()*this.getImaginaire();
    }

    @Override
    public String toString() {
        return "" + this.reel + "," + this.imaginaire + "  ";
    }
}