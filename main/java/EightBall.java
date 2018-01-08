import java.util.ArrayList;
import java.util.Collections;

public class EightBall {
    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answersToAdd){
        this.answers = new ArrayList<String>(answersToAdd);
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public void add(String answerToAdd) {
       answers.add(answerToAdd);
    }

    public void remove(String answerToRemove){
        answers.remove(answerToRemove);
    }
}
