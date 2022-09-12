package Rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverShould {
    @Test
    public void move_self_one_position_forward() {
        assertEquals("0:1:N", new MarsRover().execute("M"));
    }
    @Test
    public void move_self_two_positions_forward() {
        assertEquals("0:2:N", new MarsRover().execute("MM"));
    }
    @Test
    public void move_self_three_positions_forward() {
        assertEquals("0:3:N", new MarsRover().execute("MMM"));
    }
    @Test
    public void rotate_to_the_right() {
        assertEquals("0:0:E", new MarsRover().execute("R"));
    }
}
