package builder;

import java.util.List;

public class Exam {
    private List<Question> question_list;

    Exam(List<Question> question_list) {
        this.question_list = question_list;
    }

    public float evaluate(List<Answer> answers) {
        float sum = 0;
        for (int i = 0; i < answers.size(); i++) {
            sum += question_list.get(i).getPoint(answers.get(i));
        }
        return sum;
    }

    @Override
    public String toString() {
        String display = "";
        for (Question quest : question_list)
            display += quest + "\n";
        return display;
    }
}
