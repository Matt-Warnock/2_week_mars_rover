package Rover;

import java.util.Arrays;

public class Rotator {
    private String currentDirection;
    String[] directionPositions = {"N", "E", "S", "W"};

    public String getCurrentDirection() {
        return currentDirection;
    }

    public Rotator(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void turnRight() {
        int indexOfCurrentDirection = currentDirection.indexOf(Arrays.toString(directionPositions));
        currentDirection =  directionPositions[indexOfCurrentDirection + 1];
    }

    public void turnMarsRover(String moveInstructions) {
        Rotator rotator = new Rotator(currentDirection);
        for (int i = 0; i < moveInstructions.length(); i++) {
            if (moveInstructions.charAt(i) == ('R')) {
                rotator.turnRight();
            }
        }
    }
}
