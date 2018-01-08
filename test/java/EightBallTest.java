import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall eightball;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList<>(Arrays.asList("It is certain","Cannot predict now","My sources say no"));
        eightball = new EightBall(answers);
    }

    @Test
    public void eightBallHasThreeStartingAnswers(){
        assertEquals(3, eightball.getAnswerCount());
    }

    @Test
    public void answersListSameAsPassedToConstructor(){
        ArrayList<String> answers = new ArrayList<>(Arrays.asList("It is certain","Cannot predict now","Very doubtful"));
        eightball = new EightBall(answers);
        assertEquals(answers, eightball.getAnswers());
    }

    @Test
    public void getRandomAnswerReturnsAnswerFromList(){
        String randomAnswer = eightball.getRandomAnswer();
        assertEquals(true, eightball.getAnswers().contains(randomAnswer));
    }

    @Test
    public void addingAnAnswerShowsInListOfAnswers(){
        String answerToAdd = "Ask again later";
        eightball.add(answerToAdd);
        assertEquals(true, eightball.getAnswers().contains(answerToAdd));
    }

    @Test
    public void addingAnAnswerIncreasesAnswerCount(){
        int answerCountBefore = 3;
        assertEquals(answerCountBefore, eightball.getAnswerCount());
        String answerToAdd = "Ask again later";
        eightball.add(answerToAdd);
        assertEquals(answerCountBefore+1, eightball.getAnswerCount());
    }

    @Test
    public void removingAnAnswerRemovesItFromList(){
        String answerToRemove = "It is certain";
        eightball.remove(answerToRemove);
        assertEquals(false, eightball.getAnswers().contains(answerToRemove));
    }

    @Test
    public void removingAnAnswerDecreasesAnswerCount(){
        int answerCountBefore = 3;
        String answerToRemove = "It is certain";
        eightball.remove(answerToRemove);
        assertEquals(answerCountBefore-1, eightball.getAnswerCount());
    }
}
