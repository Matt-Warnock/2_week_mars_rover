package Rover;

import Rover.Rotator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatorShould {
    private Rotator rotor;
    private String originalDirection = "N";

    @BeforeEach
    void setup() {
        rotor = new Rotator(originalDirection);
    }
    @Test
    public void rotate_right_when_rotated_right_once() {
        String turnDirection = "R";
        int numberOfRotations = 1;

        String result = rotor.turn(turnDirection, numberOfRotations);

        assertEquals("E", result );
    }

    @Test
    public void rotate_right_twice_when_rotated_right_twice() {
        assertEquals("S", rotor.turn("R", 2) );
    }

    @Test
    public void rotate_right_twice_when_rotated_right_five_times() {
        assertEquals("E", rotor.turn("R", 5) );
    }
}