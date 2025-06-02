package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    private List<User> subscriptions;

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public Boolean isSubscribed(User user) {
        for (User currentUser : subscriptions)
            if (currentUser.getUserName().equals(user.getUserName()))
                return true;
        return false;
    }

    public Boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return userName;
    }
}
