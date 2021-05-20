import java.util.List;

public interface ExamBuilder {
    public void addTrueFalseQuestion(String content, float weight, int solution);

    public void addMultipleChoiceQuestion(String content, float weight, List<String> options, int solution);

    public void addMultipleResponseQuestion(String content, float weight, List<String> options, List<Integer> solution);
    
    public Exam build();
}
