import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cercle extends Circle{

    private double x;
    private double y;
    private static double RAYON_MINI = 30.0;

    public Cercle(double x, double y) {
        super(y, x, RAYON_MINI, new Color(Math.random(), Math.random(), Math.random(), 1.0));
    }
}
