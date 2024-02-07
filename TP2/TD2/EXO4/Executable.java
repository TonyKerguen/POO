public class Executable {
    public static void main ( String [] args ) {
    // Gimli a une barbe de 65 cm et ses oreilles mesurent 15 cm
    Personnage gimli = new Personnage ("Gimli", 65, 15);
    assert gimli.getNom().equals("Gimli");
    assert gimli.getBarbe() == 65;
    assert gimli.getOreilles() == 15;

    
    Groupe fraternite = new Groupe("La Fraternité");
    fraternite.ajoute(gimli) ;
    fraternite.ajoute(new Personnage ( " Legolas", 0, 35) );
    fraternite.ajoute("Frodo", 1, 25);
    fraternite.ajoute("GrandPas", 20, 8);
    System.out.println( fraternite.toString() );
    // La Fraternit é :
    // [( gimli , b =65 , o =15) , ( Legolas , b =0 , o =35) , ( Frodo , b =1 , o =25) , (
    // GrandPas , b =20 , o =8) ]
    }
    }