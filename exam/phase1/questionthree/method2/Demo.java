package exam.phase1.questionthree.method2;

import java.util.ArrayList;
import java.util.HashMap;

// using observer design pattern
// 2 method keeping the manager and let the array inside SportCenter hold members that need to notify
public class Demo {
    public static HashMap<SportCenter, ArrayList<User>> manager = new HashMap<>();

    public static void main(String[] args) {
        // create center
        SportCenter center1 = new SportCenter("Center 1");
        SportCenter center2 = new SportCenter("Center 2");
        manager.put(center1, new ArrayList<User>());
        manager.put(center2, new ArrayList<User>());

        // create member
        Member member1 = new Member("member 1", true);
        Member member2 = new Member("member 2", false);
        Member member3 = new Member("member 3", true);
        Trainer trainer1 = new Trainer("trainer 1", false);

        // asgin memeber for center
        manager.get(center1).add(member1);
        manager.get(center1).add(member2);
        manager.get(center1).add(trainer1);
        manager.get(center2).add(member1);
        manager.get(center2).add(member3);

        // member register for notify
        member1.registerCenterNotify(center1);
        member2.registerCenterNotify(center1);
        trainer1.registerCenterNotify(center1);

        member1.registerCenterNotify(center2);
        member3.registerCenterNotify(center2);

        // set state for center
        center1.setState(1);
        
        center2.setState(2);
    }    
}
