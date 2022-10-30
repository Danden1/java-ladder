package nextstep.ladder;

import java.util.Collections;
import java.util.List;

public class Users {
    private final List<User> users;

    public Users(List<User> users) {
        this.users = users;
    }

    public int getSize() {
        return users.size();
    }

    public List<User> getUsers() {
        return Collections.unmodifiableList(users);
    }
}