import java.util.List;

public class Plateau {

    public List<Case> lesCases;

    public Plateau(List<Case> lesCases) {
        this.lesCases = lesCases;
    }

    public List<Case> getLesCases() {
        return this.lesCases;
    }

    public Case getCase(int numero) {
        return this.lesCases.get(numero);
    }
}
