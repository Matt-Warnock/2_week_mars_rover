
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatorShould {
    private String originalDirection = "N";

    @Test
    public void rotate_right_when_rotated_right_once() {
        assertEquals("E", new Rotator(originalDirection).turn("R", 1) );
    }

    @Test
    public void rotate_right_twice_when_rotated_right_twice() {
        assertEquals("S", new Rotator(originalDirection).turn("R", 2) );
    }

    @Test
    public void rotate_right_twice_when_rotated_right_five_times() {
        assertEquals("E", new Rotator(originalDirection).turn("R", 5) );
    }
}