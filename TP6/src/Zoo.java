import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private List<Enclos> enclos;

    public Zoo(String nom) {
        this.nom = nom;
        this.enclos = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public List<Enclos> getEnclos() {
        return this.enclos;
    }

    public void ajouterEnclos(Enclos enclos) {
        if(!this.enclos.contains(enclos)) {
            this.enclos.add(enclos);
        }
        else{
            System.out.println("@@@@@@@@ Ce zoo contient deja cet enclos @@@@@@@@");
        }
    }

    public void ajouterAnimalEnclos(Animal animal, Enclos enclos) {
        if(this.enclos.contains(enclos)){
            enclos.ajouterAnimal(animal);
        }
        else{
            System.out.println("@@@@@@@@ ce zoo ne contient pas cet enclos @@@@@@@@");
        }
    }

    @Override
    public String toString() {
        String enclos = "";
        for(Enclos e : this.getEnclos()){
            enclos += e.toString();
        }
        return this.getNom()+" contient le/les enclos : "+enclos;
    }
}
