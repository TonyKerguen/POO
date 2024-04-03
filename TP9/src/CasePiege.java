public class CasePiege extends Case{
    
    public CasePiege(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "CasePiege, numero = "+this.getNumero() + " contient le joueur " + this.getLeJoueur();
    }
}
