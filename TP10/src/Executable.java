import java.util.Collections;
import java.util.NoSuchElementException;

public class Executable {
    public static void main(String[] args) {
        
        // ListeEntiers l = new ListeEntiers();
        // try {
        //     System.out.println(Collections.min(l.getEntiers()));
        // } catch (NoSuchElementException e) {
        //     System.out.println("il n'y a pas d'élements dans la liste");
        // }
        
        // l.remplir();
        // System.out.println(l);
        // try {
        //     System.out.println(Collections.min(l.getEntiers()));
        // } catch (NoSuchElementException e) {
        //     System.out.println("il n'y a pas d'élements dans la liste");
        // }

        // try {
        //     System.out.println(l.getEntiers().get(4));
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("l'index donné n'est pas accessible");
        // }

        ListeLogPass llp = new ListeLogPass();

        LoginPasswd anglais;
        try {
            anglais = new LoginPasswd("anglais", "paysIle");
            llp.addLoginPasswds(anglais);
        } catch (TailleTropImportanteException e) {
            System.out.println("la taille du mdp est trop grande");
        }

        LoginPasswd sonia;
        try {
            sonia = new LoginPasswd("sonia", "azerty");
            llp.addLoginPasswds(sonia);
        } catch (TailleTropImportanteException e) {
            System.out.println("la taille du mdp est trop grande");
        }
        
        LoginPasswd anticonstitutionnellement;
        try {
            anticonstitutionnellement = new LoginPasswd("anticonstitutionnellement", "bonjour");
            llp.addLoginPasswds(anticonstitutionnellement);
        } catch (TailleTropImportanteException e) {
            System.out.println(new TailleTropImportanteException("la taille du mdp est trop grande"));
        }
    }
}
