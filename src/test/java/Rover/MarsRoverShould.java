package Rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @Test
    public void move_self_one_position_forward() {
        assertEquals("0:1:N", new MarsRover().execute("M"));
    }
}
