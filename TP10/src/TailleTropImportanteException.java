public class TailleTropImportanteException extends Exception{

    public TailleTropImportanteException() {
        super("Taille du mdp trop grande !");
    }

    public TailleTropImportanteException(String mess) {
        super(mess);
    }
}
