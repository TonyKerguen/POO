public class CaseTp extends Case{

    public CaseTp(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "CaseTp, numero = "+this.getNumero() + " contient le joueur " + this.getLeJoueur();
    }
}
