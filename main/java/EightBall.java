import java.util.ArrayList;

public class EightBall {
    private ArrayList<Integer> numbers;

    public EightBall(ArrayList<Integer> numbersToAdd){
        this.numbers = numbersToAdd;
    }

    public int getNumberCount() {
        return this.numbers.size();
    }
}
