public class Argent implements Cadeau{
    private int nbPieces;

    public Argent(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public int getPoids() {
        return this.nbPieces*5;
    }

    @Override
    public String toString() {
        return this.nbPieces+" pièce(s) de 5 g (chacune)";
    }
}
