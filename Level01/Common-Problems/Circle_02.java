public class Circle_02 {

    private double radius;

    // default constructor
    public Circle_02() {
        this(1.0);
    }

    // Parameterized constructor
    public Circle_02(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Default radius
        Circle_02 circle1 = new Circle_02();
        System.out.println("Default Circle -> Radius: " + circle1.getRadius());
        // User-provided radius
        Circle_02 circle2 = new Circle_02(5.0);
        System.out.println("Custom Circle -> Radius: " + circle2.getRadius());
    }
}