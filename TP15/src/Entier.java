import java.util.Iterator;

public class Entier implements Iterable<Integer>{
    private Integer val;

    public Entier(Integer v){
        this.val = v;
    }

    public Iterator<Integer> iterator(){
        return new IterEntier(this.val);
    }
}
