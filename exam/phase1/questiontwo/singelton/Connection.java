package exam.phase1.questiontwo.singelton;

import java.time.LocalTime;

// put in anthoer package => so that client can't create Connection but onlye Singleton can
public class Connection {
    LocalTime createAt;
    
    Connection() {
        LocalTime time = LocalTime.now();
        this.createAt = time;
        System.out.println("A connection has been established at " + this.createAt);
    }
}
