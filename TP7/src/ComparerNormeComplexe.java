import java.util.Comparator;

public class ComparerNormeComplexe implements Comparator<Complexe>{
    @Override
    public int compare(Complexe c1, Complexe c2) {
        
        return (int)(c1.getNorme() - c2.getNorme());
        
    }
}
