package exam.phase1.questiontwo.singelton;

import java.util.Objects;

// Lazy Singleton object
// In charge of create 1 object of connection for the whole program
public class Singleton {
    private static Connection connection;
    
    private Singleton() {}

    public static Connection getConnection() {
        if (Objects.isNull(connection)) // only create when first use
            connection = new Connection();
        return connection;
    }
}
