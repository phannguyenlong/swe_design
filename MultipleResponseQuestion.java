import java.util.List;

public class MultipleResponseQuestion extends Question {
    private List<String> option;
    private List<Integer> solution;

    public MultipleResponseQuestion(String content, float weight, List<String> option, List<Integer> solution) {
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
