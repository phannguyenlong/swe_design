package exam.phase1.questionthree;

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

    public abstract void update(SportCenter center);

    public abstract void registerCenter(SportCenter center);
}
