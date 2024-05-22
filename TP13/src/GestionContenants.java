import java.util.List;

public class GestionContenants {
    public static<T> boolean contiennentTous(List<Contenant<T>> conts, T elem){
        boolean res = true;
        for(Contenant<T> c : conts){
            if(!(c.contient(elem))){
                res = false;
            }
        }
        return res;
    }
}
