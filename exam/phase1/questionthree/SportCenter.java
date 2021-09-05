package exam.phase1.questionthree;

import java.util.ArrayList;

// act as Observer Subject
public class SportCenter {
    ArrayList<User> members = new ArrayList<User>(); // list for containing user
    protected String code;
    protected int state;
    
    public SportCenter(String code) {
        this.code = code;
    }

    public void setState(int state) {
        this.state = state;
        notifyUser(); // use for notify all user when it change states
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

    public void addUser(User user) {
        members.add(user);
    }

    public void removeUser(User user) {
        members.remove(user);
    }

    private void notifyUser() {
        for (User user : members) {
            user.update(this);
        }
    }
}
