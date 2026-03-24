package refactoring.refactorme;

public abstract class Geometry implements Comparable<Geometry> {
    private int id;
    private boolean filled;
    private String color;

    protected Geometry(int id, boolean filled, String color) throws IdException {
        validateId(id);
        this.id = id;
        this.filled = filled;
        this.color = color;
    }

    private void validateId(int id) throws IdException {
        if (id < 0) {
            throw new IdException("Id must not be negative!");
        }
    }

    public abstract double calculateArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(Geometry other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    public int getId() {
        return id;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }
}