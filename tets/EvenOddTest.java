import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    @Test
    public void even() {

        EvenOdd e= new EvenOdd();
        assertEquals("Even",e.check(3000));

    }
    @Test
    public void odd() {

        EvenOdd o= new EvenOdd();
        assertEquals("Odd",o.check(3001));
    }
}