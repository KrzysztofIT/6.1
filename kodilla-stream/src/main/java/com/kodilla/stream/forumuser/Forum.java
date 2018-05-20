package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> list = new ArrayList<>();

    public Forum() {
        list.add(new ForumUser(1, "Olek", 'M',LocalDate.of(1990 , 11 , 25) , 50));
        list.add(new ForumUser(2, "Jan", 'M',LocalDate.of(2011 , 11 , 25) , 50));
        list.add(new ForumUser(3, "Tomek", 'M',LocalDate.of(1990 , 11 , 25) , 0));
        list.add(new ForumUser(4, "Ola", 'F',LocalDate.of(2000, 11 , 25) , 150));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(list);
    }
}
