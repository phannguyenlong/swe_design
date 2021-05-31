package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Director {
    public static void main(String[] args) {
        // build exam
        ExamBuilder builder = new ExamImplement();
        builder.addTrueFalseQuestion("Are you VGU studnet", 1, 1);
        
        builder.addMultipleChoiceQuestion("How old are you", 2, Arrays.asList("18", "19", "20"), 2); // solution start add 0

        builder.addMultipleResponseQuestion("How many subject you have passed?", 4,
                Arrays.asList("Algebra", "Statistic", "Database", "PE"), Arrays.asList(1, 2)); //  solution start add 0
        
        Exam exam = builder.build();

        // display exam
        System.out.println(exam);

        // test with answer
        List<Answer> answers = new ArrayList<>();
        answers.add(new SingleAnswer(0)); // true false ==> wrong
        answers.add(new SingleAnswer(2)); // multiple choice ==> correct
        answers.add(new MultipleAnswer(Arrays.asList(1, 3))); // multiple response ==> 1 correct
        
        System.out.println("The result is: " + exam.evaluate(answers));
    }
}
