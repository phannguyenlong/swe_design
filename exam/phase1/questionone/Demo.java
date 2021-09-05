package exam.phase1.questionone;

// Using Factory Design Pattern
public class Demo {
    public static void main(String[] args) {
        Sport zumba = SportFactory.getSport("Zumba");
        Sport badminton = SportFactory.getSport("Badminton");
    }    
}
