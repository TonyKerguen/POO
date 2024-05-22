public class CoupleGenerique<T> implements Contenant<T> {
        
    private T val1;
    private T val2;

    public CoupleGenerique(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public T getVal2() {
        return val2;
    }
    
    @Override
    public String toString() {
        return "CoupleGenerique [val1 = " + val1 + ", val2 = " + val2 + "]";
    }

    @Override
    public boolean contient(T x){
        return this.val1.equals(x) || this.val2.equals(x);
    }



    
}
