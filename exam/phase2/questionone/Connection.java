package exam.phase2.questionone;

import java.time.LocalTime;
import java.util.Objects;

// Lazy Singleton object
// In charge of create 1 object of connection for the whole progra
public class Connection {
    private LocalTime createAt;
    private static Connection connection;

    private Connection() {
        LocalTime time = LocalTime.now();
        this.createAt = time;
        System.out.println("A Connection has been established at " + this.createAt);
    }

    public static Connection getConnection() {
        if (Objects.isNull(connection)) 
            connection = new Connection(); // only create when first use
        return connection;
    }
}
