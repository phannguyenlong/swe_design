package exam.phase1.questionthree;

// using observer design pattern
public class Demo {
    public static void main(String[] args) {
        // create center
        SportCenter center1 = new SportCenter("Center 1");
        SportCenter center2 = new SportCenter("Center 2");

        // create member
        Member member1 = new Member("member 1");
        Member member2 = new Member("member 2");
        Member member3 = new Member("member 3");
        Trainer trainer1 = new Trainer("trainer 1");

        // asgin memeber for center
        center1.addUser(member1);
        center1.addUser(member2);
        center1.addUser(trainer1);

        center2.addUser(member1);
        center2.addUser(member3);

        // set state for center
        center1.setState(1);
        
        center2.setState(2);
    }    
}
