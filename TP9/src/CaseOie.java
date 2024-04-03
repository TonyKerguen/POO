public class CaseOie extends Case{
    
    public CaseOie(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "CaseOie, numero = "+this.getNumero() + " contient le joueur " + this.getLeJoueur();
    }
}
