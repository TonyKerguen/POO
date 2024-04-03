public class CaseAttente extends Case{

    public CaseAttente(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return "CaseAttente, numero = "+this.getNumero() + " contient le joueur " + this.getLeJoueur();
    }
}
