import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Gianluca on 05/07/2016.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne() throws Exception {
        assertEquals("1", fb.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() throws Exception {
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    public void threeReturnsFizz() throws Exception {
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz() throws Exception {
        assertEquals("Buzz", fb.evaluate(5));

    }

    @Test
    public void tenReturnsBuzz() throws Exception {
        assertEquals("Buzz", fb.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() throws Exception {
        assertEquals("FizzBuzz", fb.evaluate(15));
    }

    @Test
    public void thirtyReturnsFizzBuzz() throws Exception {
        assertEquals("FizzBuzz", fb.evaluate(30));
    }
}
