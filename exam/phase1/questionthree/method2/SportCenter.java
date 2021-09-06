package exam.phase1.questionthree.method2;

import java.util.ArrayList;

// act as Observer Subject
public class SportCenter {
    ArrayList<User> registerNotifyUser = new ArrayList<User>(); // list for users that register notify
    protected String code;
    protected int state;
    
    public SportCenter(String code) {
        this.code = code;
    }

    public void setState(int state) {
        this.state = state;
        notifyUser(); // use for notify registered users when it change states
    }

    public int getState() {
        return state;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void addRegisteredNotifyUser(User user) {
        registerNotifyUser.add(user);
    }

    public void removeRegisteredNotifyUser(User user) {
        registerNotifyUser.remove(user);
    }

    private void notifyUser() {
        for (User user : registerNotifyUser) 
            user.update(this);
    }
}
