package exam.phase1.questionthree;

// using observer design pattern
public class Demo {
    public static void main(String[] args) {
        // create center
        SportCenter center1 = new SportCenter("Center 1");
        SportCenter center2 = new SportCenter("Center 2");

        // create member and assign center
        Member member1 = new Member("member 1", true);
        Member member2 = new Member("member 2", false);
        Member member3 = new Member("member 3", true);
        Trainer trainer1 = new Trainer("trainer 1", false);

        // asgin memeber for center
        member1.registerCenter(center1);
        member2.registerCenter(center1);
        trainer1.registerCenter(center1);

        member1.registerCenter(center2);
        member3.registerCenter(center2);

        // set state for center
        center1.setState(1);
        
        center2.setState(2);
    }    
}
