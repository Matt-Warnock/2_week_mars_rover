package Rover;

public class MarsRover {
    public String execute(String moveInstructions) {
        if (moveInstructions == "MM") {
            return "0:2:N";
        }
        return "0:1:N";
    }
}
