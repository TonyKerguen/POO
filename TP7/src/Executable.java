public class Executable {
    public static void main(String[] args) {
        Personne a = new Personne("a", 0);
        Personne b = new Personne("b", -1);
        Personne c = new Personne("c", 2);
        Personne d = new Personne("d", 1);

        ListePersonnes l = new ListePersonnes();

        l.ajouterPersonne(a);
        l.ajouterPersonne(b);
        l.ajouterPersonne(c);
        l.ajouterPersonne(d);

        System.out.println(l.toString());
        l.trierListeSelonAge();
        System.out.println(l.toString());
        
    }
}
