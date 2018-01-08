import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightball;

    @Before
    public void before(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,4,8));
        eightball = new EightBall(numbers);
    }

    @Test
    public void eightBallHasThreeStartingNumbers(){
        assertEquals(3, eightball.getNumberCount());
    }
}
