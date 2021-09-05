package exam.phase1.questionone;

// SportFactory in charge of create Sport and return to client
public class SportFactory {
    private SportFactory() {
    }
    
    public static Sport getSport(String sportName) {
        switch (sportName) {
            case "Badminton":
                return new Badminton();
            case "Zumba":
                return new Zumba();
            default:
                throw new IllegalArgumentException("Sport not found");
        }
        
    }
}
