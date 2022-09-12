package Rover;

public class MarsRover {
    public String execute(String moveInstructions) {
        int numberOfMoves = moveInstructions.length();

        return "0:" + numberOfMoves + ":N";
    }
}
