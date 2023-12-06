package createcircles;

/**
 *
 * @author iagof
 */
public class Circle {

    private double radius;

    private static final int MAX_RADIUS = 10;

    /**
     * @param radius 
     */
    public Circle(double radius) {
        if (radius <= MAX_RADIUS) {
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= MAX_RADIUS) {
            this.radius = radius;
        }
    }

    public void show() {
        System.out.println("Soy un Circulo de Radio " + this.radius);
    }

    public void enlarge() {
        if (radius <= MAX_RADIUS) {
            radius = radius * 2;
        }
    }    
    
    public static int getMaxRadius(){
        return MAX_RADIUS;
    }
}
