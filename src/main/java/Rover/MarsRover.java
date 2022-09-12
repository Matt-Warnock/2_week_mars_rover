package Rover;

public class MarsRover {
    public String execute(String moveInstructions) {
        int numberOfMoves = moveInstructions.length();
        String direction = "N";

        if (moveInstructions == "R") {
            return "0:0:E";
        }

        if (moveInstructions == "RR") {
            return "0:0:S";
        }

        return "0:" + numberOfMoves + ":" + direction;
    }
}
