import java.util.Comparator;

public class ComparerComplexe implements Comparator<Complexe>{

    @Override
    public int compare(Complexe c1, Complexe c2) {
        
        return (int)(c2.getReel() - c1.getReel());
        
    }
    
}
