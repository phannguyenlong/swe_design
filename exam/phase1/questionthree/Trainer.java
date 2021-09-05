package exam.phase1.questionthree;

public class Trainer extends User{
    public Trainer(String code) {
        this.code = code;
    }

    @Override
    public void update(SportCenter center) {
       System.out.println("Member " + this.code + " acknowledges that center " + center.getCode() + " has change to state " + center.getState());
    }
}
