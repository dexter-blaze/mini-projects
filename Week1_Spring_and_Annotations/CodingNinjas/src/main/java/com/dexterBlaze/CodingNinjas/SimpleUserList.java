package com.dexterBlaze.CodingNinjas;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class SimpleUserList implements UserList{
    List<User> listOfUsers;

    public SimpleUserList() {
        listOfUsers = new ArrayList<>();
    }

    public List<User> getUserList () {
        return this.listOfUsers;
    }

    public void addUser(User user) {
        this.listOfUsers.add(user);

    }
}
