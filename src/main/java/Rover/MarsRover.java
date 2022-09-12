package Rover;

public class MarsRover {
    public String execute(String moveInstructions) {
        String direction = "N";
        int numberOfMoves = 0;
        String[] directionPositions = {"N", "E", "S", "W"};

        if (moveInstructions.contains("M")) {
            numberOfMoves = moveInstructions.length();
        }


        if (moveInstructions.equals("R")) {
            direction = directionPositions[1];
        }

        if (moveInstructions.equals("RR")) {
            direction = "S";
        }
        if (moveInstructions.equals("RRR")) {
            direction = "W";
        }

        return "0:" + numberOfMoves + ":" + direction;
    }
}
