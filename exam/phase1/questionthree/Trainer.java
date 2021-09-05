package exam.phase1.questionthree;

public class Trainer extends User{
    public Trainer(String code, boolean registerNotify) {
        super(code, registerNotify);
    }

    public void registerCenter(SportCenter center) {
        // let customer decided to add themself to notify or not
        if (this.registerNotify) {
            center.addUser(this);
        }
    }

    @Override
    public void update(SportCenter center) {
       System.out.println("Member " + this.code + " acknowledges that center " + center.getCode() + " has change to state " + center.getState());
    }
}
