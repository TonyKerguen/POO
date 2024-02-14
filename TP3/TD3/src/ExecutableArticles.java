public class ExecutableArticles {
    public static void main(String [] args) {
        Article chaussures = new Article(152, "Chaussures", 37.5);
        Article veste = new Article(145, "Veste", 87.2);
        Article tShirt = new Article(147, "T-shirt", 25.3);
        Article bonnet = new Article(165, "Bonnet", 11.0);
        Article pantalon = new Article(178, "Pantalon", 42.0);
        Article chemise = new Article(256, "Chemise", 51.1);
        Magasin yaTout = new Magasin("YaTout");
        yaTout.ajouter(veste);
        yaTout.ajouter(bonnet);
        yaTout.ajouter(chaussures);
        yaTout.ajouter(tShirt);
        yaTout.ajouter(pantalon);
        yaTout.ajouter(chemise);
        System.out.println(yaTout);
        System.out.println("Total = " + yaTout.prixTotal()); // (1)
        System.out.println();
        yaTout.vendre(tShirt);
        yaTout.vendre(pantalon);
        System.out.println(yaTout.vendus());
        System.out.println("Le moins cher : " + yaTout.leMoinsCher()); // (2)
        System.out.println();
        System.out.println("ref (145) quel article ? " + yaTout.trouver(145)); // (3)
    }
    }