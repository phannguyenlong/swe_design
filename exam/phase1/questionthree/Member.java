package exam.phase1.questionthree;

public class Member extends User {
    public Member(String code) {
        this.code = code;
    }

    @Override
    public void update(SportCenter center) {
       System.out.println("Member " + this.code + " acknowledges that center " + center.getCode() + " has change to state " + center.getState());
    }
}
