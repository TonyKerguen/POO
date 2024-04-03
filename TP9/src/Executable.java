public class Executable {
    public static void main(String[] args) {
        
        Joueur joueur1 = new Joueur("joueur1");
        System.out.println(joueur1.toString());

        Case case1 = new Case(2);
        System.out.println(case1.toString());

        CaseAttente case2 = new CaseAttente(3);
        System.out.println(case2.toString());

        case2.setLeJoueur(joueur1);
        System.out.println(case2.toString());
    }
}
