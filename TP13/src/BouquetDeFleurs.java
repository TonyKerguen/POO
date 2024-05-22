public class BouquetDeFleurs implements Cadeau{
    private int nbDalhia;
    private int nbRose;

    public BouquetDeFleurs(int nbDalhia, int nbRose) {
        this.nbDalhia = nbDalhia;
        this.nbRose = nbRose;
    }

    @Override
    public int getPoids() {
        return this.nbDalhia*5 + this.nbRose*3;
    }

    @Override
    public String toString() {
        return "Bouquet de "+nbDalhia+" Dalhia(s) et de "+nbRose+"Rose(s)";
    }
}
