import java.util.ArrayList;
import java.util.List;

public class Enclos {
    private String nom;
    private List<Animal> animauxEnferme;

    public Enclos(String nom) {
        this.nom = nom;
        this.animauxEnferme = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public List<Animal> getAnimaux() {
        return this.animauxEnferme;
    }

    public void ajouterAnimal(Animal animal) {
        this.animauxEnferme.add(animal);
    }

    @Override
    public String toString() {
        String animaux = "";
        for(Animal a : this.getAnimaux()){
            animaux += a.toString();
        }
        return "L'enclos : "+this.getNom()+" contient les animaux : "+animaux;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Enclos) {
            Enclos enclos = (Enclos) obj;
            return this.getNom().equals(enclos.getNom()) && this.getAnimaux() == enclos.getAnimaux();
        }
        return false;
    }
}
