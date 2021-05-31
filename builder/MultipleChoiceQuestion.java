package builder;

import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> option;
    private int solution;

    public MultipleChoiceQuestion(String content, float weight, List<String> option, int solution) {
        super(content, weight);
        this.option = option;
        this.solution = solution;
    }

    @Override
    public String getOption() {
        String display = "";
        for (int i = 0; i < option.size(); i++)
            display += (i + 1) + ") " + option.get(i) + "\t";
        return display;
    }

    @Override
    public float getPoint(Answer answer) {
        return answer.checkAnswer(weight, solution);
    }
}
