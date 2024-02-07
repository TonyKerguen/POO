public class ExecutableBouteille{
    public static void main(String[] args){
    Bouteille pomerol = new Bouteille("Bordeaux", "Pomerol", 2007);
    assert "Bordeaux".equals(pomerol.getRegion());
    assert "Pomerol".equals(pomerol.getAppellation());
    assert 2007 == pomerol.getMillesime();
    Bouteille pomerol2007 = new Bouteille("Bordeaux", "Pomerol", 2007);
    Bouteille pomerol2003 = new Bouteille("Bordeaux", "Pomerol", 2003);
    assert pomerol.equals(pomerol2007);
    assert !pomerol.equals(pomerol2003);

    Cave maCave = new Cave();
    maCave.ajouteBouteille("Bordeaux", "Pomerol", 2005);
    maCave.ajouteBouteille("Bordeaux", "Pomerol", 2007);
    maCave.ajouteBouteille("Bourgogne", "Nuits St George", 2001);
    maCave.ajouteBouteille("Savoie", "Pinot Noir", 2012);
    maCave.ajouteBouteille("Bordeaux", "Pomerol", 2007);
    maCave.ajouteBouteille("Loire", "Chinon", 2017);
    assert 6 == maCave.nbBouteilles();
    assert 3 == maCave.nbBouteillesDeRegion("Bordeaux");
    Bouteille bouteille = maCave.plusVieilleBouteille();
    assert "Nuits St George".equals(bouteille.getAppellation());
    assert maCave.contient("Bordeaux", "Pomerol", 2007);
    assert !maCave.contient("Bordeaux", "Pomerol", 2003);
    System.out.println("ez");
    }
}