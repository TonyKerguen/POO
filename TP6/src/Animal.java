public abstract class Animal {
    private String nom;
    private double poids;

    protected Animal(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPoids() {
        return this.poids;
    }

    @Override
    public String toString() {
        return this.getNom()+" pese "+this.getPoids()+" kg ";
    }

}
