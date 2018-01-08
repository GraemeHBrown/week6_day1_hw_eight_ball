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

    @Test
    public void numbersListSameAsPassedToConstructor(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,8));
        eightball = new EightBall(numbers);
        assertEquals(numbers, eightball.getNumbers());
    }

    @Test
    public void getRandomReturnsNumberFromList(){
        int randomNumber = eightball.getRandom();
        assertEquals(true, eightball.getNumbers().contains(randomNumber));
    }
}
