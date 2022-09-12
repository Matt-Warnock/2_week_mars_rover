public class Rotator {

    private int indexOfDirection;
    String[] directionPositions = {"N", "E", "S", "W"};


    public Rotator(String currentDirection) {
        for (int i = 0; i < directionPositions.length; i++) {
            if (directionPositions[i] == currentDirection) {
                indexOfDirection = i;
            }
        }
    }

    public String turn(String r, int numberOfRotations) {
        return directionPositions[(indexOfDirection + numberOfRotations) % directionPositions.length];
    }
}
