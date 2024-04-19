import java.util.ArrayList;
import java.util.List;

public class ListeLogPass {
    
    private List<LoginPasswd> listLoginPasswds;

    public ListeLogPass() {
        this.listLoginPasswds = new ArrayList<>();
    }

    public ListeLogPass(List<LoginPasswd> lp){
        this.listLoginPasswds = new ArrayList<>(lp);
    }

    public List<LoginPasswd> getListLoginPasswds() {
        return this.listLoginPasswds;
    }

    public void addLoginPasswds(LoginPasswd lp) {
        this.listLoginPasswds.add(lp);
    }

    public void addLoginPasswds(String login, String password) throws TailleTropImportanteException {
        this.listLoginPasswds.add(new LoginPasswd(login, password));
    }
    
}
