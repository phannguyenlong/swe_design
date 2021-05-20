import java.util.ArrayList;
import java.util.List;

public class ExamImplement implements ExamBuilder {
    List<Question> question_list = new ArrayList<>();

    @Override
    public void addTrueFalseQuestion(String content, float weight, int solution) {
        question_list.add(new TrueFalseQuestion(content, weight, solution));
    }

    @Override
    public void addMultipleChoiceQuestion(String content, float weight, List<String> options, int solution) {
        question_list.add(new MultipleChoiceQuestion(content, weight, options, solution));
    }

    @Override
    public void addMultipleResponseQuestion(String content, float weight, List<String> options,
            List<Integer> solution) {
        question_list.add(new MultipleResponseQuestion(content, weight, options, solution));
    }

    @Override
    public Exam build() {
        return new Exam(question_list);
    }
    
}
