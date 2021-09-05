package exam.phase1.questiontwo;

import exam.phase1.questiontwo.singelton.Connection;
import exam.phase1.questiontwo.singelton.Singleton;

// Only 1 intance of Connection => Using singletone
public class Demo {
    public static void main(String[] args) {
        Connection connection1 = Singleton.getConnection();
        Connection connection2 = Singleton.getConnection();
    }
}
