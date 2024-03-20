public class Personne implements Comparable<Personne>{
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Personne arg0) {
        return this.getAge() - arg0.getAge();
    }

    @Override
    public String toString() {
        return this.nom + " à " + this.getAge() + " ans ";
    }
}