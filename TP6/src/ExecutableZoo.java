public class ExecutableZoo {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo 1");

        Enclos enclos1 = new Enclos("Enclos 1");
        Enclos enclos2 = new Enclos("Enclos 2");

        Lion simba = new Lion("Simba", 55.0, false);
        Lion musafa = new Lion("Musafa", 120.0, true);
        Serpent kaa = new Serpent("Kaa", 30.0, false);

        zoo1.ajouterEnclos(enclos1);
        zoo1.ajouterEnclos(enclos2);

        zoo1.ajouterAnimalEnclos(simba, enclos1);
        enclos1.ajouterAnimal(musafa);

        enclos2.ajouterAnimal(kaa);

        System.out.println(zoo1.toString());
        simba.son();
        kaa.son();
    }
}
