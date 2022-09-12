
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatorShould {

    @Test
    public void rotate_right_when_rotated_right_once() {
        assertEquals("E", new Rotator().turn("R", 1) );
    }

    @Test
    public void rotate_right_twice_when_rotated_right_twice() {
        assertEquals("S", new Rotator().turn("R", 2) );
    }

}