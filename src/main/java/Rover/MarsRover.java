package Rover;

public class MarsRover {
    private String currantDirection = "N";
    public String execute(String moveInstructions) {
        int numberOfMoves = 0;
        String[] directionPositions = {"N", "E", "S", "W"};

        if (moveInstructions.contains("M")) {
            numberOfMoves = moveInstructions.length();
        }

        Rotator rotator = new Rotator("N");
//        if (moveInstructions.equals("R")) {
//            direction = directionPositions[1];
//        }
//        if (moveInstructions.equals("RR")) {
//            direction = directionPositions[2];
//        }
//        if (moveInstructions.equals("RRR")) {
//            direction = directionPositions[3];
//        }

        return "0:" + numberOfMoves + ":" + direction;
    }


}
