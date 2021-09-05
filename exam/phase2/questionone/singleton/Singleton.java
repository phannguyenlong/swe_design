package exam.phase2.questionone.singleton;

import java.util.Objects;

// Lazy Singleton object
// In charge of create 1 object of connection for the whole progra
public class Singleton {
    private static Connection connection;
    
    private Singleton() {
    }
    
    public static Connection getConnection() {
        if (Objects.isNull(connection)) 
            connection = new Connection(); // only create when first use
        return connection;
    }
}
