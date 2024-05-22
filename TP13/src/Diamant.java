public class Diamant implements Cadeau{
    private int poids;
    
    public Diamant(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return this.poids;
    }

    @Override
    public String toString() {
        return "Diamant de "+this.getPoids()+"g";
    }
}
