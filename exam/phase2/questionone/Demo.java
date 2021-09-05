package exam.phase2.questionone;

import exam.phase2.questionone.singleton.Connection;
import exam.phase2.questionone.singleton.Singleton;

// Only 1 intance of Connection => Using singletone
public class Demo {
    public static void main(String[] args) {
        Connection connection1 = Singleton.getConnection();
        Connection connection2 = Singleton.getConnection();
    }    
}
