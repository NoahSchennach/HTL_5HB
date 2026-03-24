package refactoring.refactorme;

public class Square extends Rectangle {

	// Square has almost similar code to rectangle so it just extends it to get rid of duplicate code
    protected Square(int id, double sideLength, boolean filled, String color) throws IdException {
        super(id, sideLength, sideLength, filled, color); // sideLength, sideLenght bewirkt, dass es als square angesehen wird
    }
}