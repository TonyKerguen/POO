import java.util.ArrayList;
import java.util.List;

public class ListeLogPass {
    
    private List<LoginPasswd> listLoginPasswds;

    public ListeLogPass() {
        this.listLoginPasswds = new ArrayList<>();
    }

    public List<LoginPasswd> getListLoginPasswds() {
        return listLoginPasswds;
    }

    public void addLoginPasswds(LoginPasswd lp) {
        this.listLoginPasswds.add(lp);
    }
    
}
