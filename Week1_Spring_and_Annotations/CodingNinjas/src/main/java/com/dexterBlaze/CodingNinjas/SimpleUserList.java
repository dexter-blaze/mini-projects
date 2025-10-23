package com.dexterBlaze.CodingNinjas;
import java.util.ArrayList;
import java.util.List;

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
