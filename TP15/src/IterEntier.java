import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterEntier implements Iterator<Integer>{
    private Integer val;
    private int position;

    public IterEntier(Integer v){
        this.val = v;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(this.position == 0){
            return true;
        }
        if(val.equals(0) == false){
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int digit = val % 10;
        val /= 10;
        position += 1;
        return digit;
    } 
}
