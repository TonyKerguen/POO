public class CoupleEntiers implements Contenant<Integer> {
    
    private Integer val1;
    private Integer val2;

    public CoupleEntiers(Integer val1, Integer val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Integer getVal1() {
        return val1;
    }

    public Integer getVal2() {
        return val2;
    }
    
    @Override
    public String toString() {
        return "CoupleEntiers [val1 = " + val1 + ", val2 = " + val2 + "]";
    }

    @Override
    public boolean contient(Integer x){
        return this.val1.equals(x) || this.val2.equals(x);
    }



    
}
