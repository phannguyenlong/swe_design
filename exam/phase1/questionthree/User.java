package exam.phase1.questionthree;

public abstract class User {
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract void update(SportCenter center);
}
