package pokemon;

public class Pokemon {
    private String nom;
    private int force;
    public Pokemon(String nomPokemon, int forcePokemon) {
        this.nom = nomPokemon;
        this.force = forcePokemon;
    }
    public Pokemon(String nomPokemon) {
        this(nomPokemon, 10);
    }
    public String getNom() {
        return this.nom;
    }
    public int getForce() {
        return this.force;
    }
    public void evolue(String nouveauNom, int nouvelleForce) {
        this.nom = nouveauNom;
        this.force = nouvelleForce;
    }
    public void evoluer(String nouveauNom) {
        this.evolue(nouveauNom, this.force + 10);
    }
    @Override
    public String toString() {
        return this.nom +"(force "+ this.force + ")";
    }
}