public class TrueFalseQuestion extends Question {
    private int solution; // 1 for true, 0 for false

    public TrueFalseQuestion(String content, float weight, int solution) {
        super(content, weight);
        this.solution = solution;
    }

    @Override
    public String getOption() {
        return "1) True\t2) False";
    }

    @Override
    public float getPoint(Answer answer) {
        return answer.checkAnswer(weight, solution);
    }
}
