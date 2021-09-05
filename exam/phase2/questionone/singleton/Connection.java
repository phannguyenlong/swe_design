package exam.phase2.questionone.singleton;

import java.time.LocalTime;

// put in another package so that Client cannot create this Class
public class Connection {
    LocalTime createAt;

    Connection() {
        LocalTime time = LocalTime.now();
        this.createAt = time;
        System.out.println("A Connection has been established at " + this.createAt);
    }
}
