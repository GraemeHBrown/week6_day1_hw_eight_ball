import java.util.ArrayList;
import java.util.Collections;

public class EightBall {
    private ArrayList<Integer> numbers;

    public EightBall(ArrayList<Integer> numbersToAdd){
        this.numbers = new ArrayList<Integer>(numbersToAdd);
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public int getRandom(){
        Collections.shuffle(numbers);
        return numbers.get(0);
    }


}
