public class Simple<T> {
    
    private T val;

    public Simple(T val){
        this.val = val;
    }

    public T getVal(){
        return this.val;
    }

    public void setVal(T val) {
        this.val = val;
    }
    
}
