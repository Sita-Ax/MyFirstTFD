package Exercise9;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestExercise {

    @Test
    public void firstTestCase(){

        String text = "Some first text";
        int actual = text.length();
        int expected = 15;

        assertEquals(expected, actual);
    }
}
