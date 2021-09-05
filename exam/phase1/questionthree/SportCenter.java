package exam.phase1.questionthree;

import java.util.ArrayList;

// act as Observer Subject
public class SportCenter {
    ArrayList<User> members = new ArrayList<User>(); // list for containing users
    ArrayList<User> registerNotifyUser = new ArrayList<>(); // list for users register for notify when change state
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

    public ArrayList<User> getAllUsers() {
        return members;
    }

    public void addUser(User user) {
        members.add(user);
    }

    public void removeUser(User user) {
        members.remove(user);
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
