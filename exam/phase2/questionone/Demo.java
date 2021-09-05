package exam.phase2.questionone;

// Only 1 intance of Connection => Using singletone
public class Demo {
    public static void main(String[] args) {
        Connection connection1 = Connection.getConnection();
        Connection connection2 = Connection.getConnection();
    }    
}
