package refactoring.refactorme;

public class Square extends Rectangle {

    protected Square(int id, double sideLength, boolean filled, String color) throws IdException {
        super(id, sideLength, sideLength, filled, color);
    }
}