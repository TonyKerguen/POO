public class CoupleEntiers implements Comparable<CoupleEntiers>{
    
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
    public int compareTo(CoupleEntiers ce){
        if(this.getVal1().equals(ce.getVal1())){
            return this.getVal2() - ce.getVal2();
        }
        else{
            return this.getVal1() - ce.getVal1();
        }  
    }

    @Override
    public String toString() {
        return "[ " + val1 + ", " + val2 + " ]";
    }
    
}
