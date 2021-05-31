package builder;

import java.util.List;

public class MultipleAnswer extends Answer {
    private List<Integer> answer;

    public MultipleAnswer(List<Integer> answer) {
        this.answer = answer;
    }

    @Override
    public float checkAnswer(float weight, List<Integer> solution) {
        int sum = 0;
        for (int i = 0; i < answer.size(); i++) {
            if (solution.contains(answer.get(i))) 
                sum += 1;
        }
        return (sum * weight) / solution.size(); // narrow down to scale of weight
    }
}
