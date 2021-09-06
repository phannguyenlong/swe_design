package exam.phase1.questionthree.method2;

public class Trainer extends User{
    public Trainer(String code, boolean registerNotify) {
        super(code, registerNotify);
    }

    @Override
    public void update(SportCenter center) {
       System.out.println("Member " + this.code + " acknowledges that center " + center.getCode() + " has change to state " + center.getState());
    }
}
