public class SingleAnswer extends Answer {
    private int answer;

    public SingleAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public float checkAnswer(float weight, int solution) {
        if (solution == answer)
            return weight;
        else
            return 0;
    }
}
