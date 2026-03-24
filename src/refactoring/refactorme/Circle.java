package refactoring.refactorme;

public class Circle extends Geometry {

    private double radius;

    protected Circle(int id, double radius, boolean filled, String color) throws IdException {
        super(id, filled, color);

        if (radius < 0) {
            throw new IllegalArgumentException("Radius must not be negative.");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * makes sure that radius is above 0 otherwise it throws illegalArgumentException
     * @param radius
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must not be negative.");
        }
        this.radius = radius;
    }

    
    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}