package exam.phase1.questionthree.method2;

public abstract class User {
    protected String code;
    protected boolean registerNotify;
    
    public User(String code, boolean registerNotify) {
        this.code = code;
        this.registerNotify = registerNotify;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void registerCenterNotify(SportCenter center) {
        // let customer decided to add themself to notify or not
        if (this.registerNotify) {
            center.addRegisteredNotifyUser(this);
        }
    };

    public abstract void update(SportCenter center);

}
