package com.hfad.android14fragments.data;

import com.hfad.android14fragments.models.User;

import java.util.ArrayList;

public class UserService {

    public ArrayList<User> getUserList(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Blank Space","Taylor Swift","1"));
        list.add(new User("Watch Me","Silento","2"));
        list.add(new User("Earned It","The Weekend","3"));
        list.add(new User("The Hills","The Weekend","4"));
        list.add(new User("Writing’s On The Wall","Sam Smith","5"));

        return list;
    }
}
