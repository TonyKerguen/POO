public class Vecteur3f {
    private double x;
    private double y;
    private double z;

    public Vecteur3f(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getNorme() {
        return Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
    }

    @Override
    public String toString() {
        return "Vecteur3f : < "+this.x+" "+this.y+" "+this.z+" > De norme : "+this.getNorme();
    }
}
