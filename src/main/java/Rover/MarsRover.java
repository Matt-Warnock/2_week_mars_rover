package Rover;

public class MarsRover {
    private Rotator rotator;

    public MarsRover() {
        this.rotator = new Rotator("N");
    }

    public String execute(String moveInstructions) {
//        int numberOfMoves = 0;
//        String[] directionPositions = {"N", "E", "S", "W"};

//        if (moveInstructions.contains("M")) {
//            numberOfMoves = moveInstructions.length();
//        }

        this.rotator.turnMarsRover(moveInstructions);

        return "0:" + numberOfMoves + ":" + direction;
    }


}
