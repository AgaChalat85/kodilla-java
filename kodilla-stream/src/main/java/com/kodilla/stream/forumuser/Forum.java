package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser>  userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1239, "Lukasz", 'M', LocalDate.of(1978,7,23), 14 ));
        userList.add(new ForumUser(1238, "Stefan85", 'M', LocalDate.of(1985,9,2), 34 ));
        userList.add(new ForumUser(1237, "Justyna", 'F', LocalDate.of(2010,1,4), 5 ));
        userList.add(new ForumUser(1236, "Weronika", 'F', LocalDate.of(1990,5,14), 10 ));
        userList.add(new ForumUser(1235, "Marcin", 'M', LocalDate.of(2001,10,15), 42 ));
        userList.add(new ForumUser(1234, "Pawel", 'M', LocalDate.of(2001,10,16), 3 ));
        userList.add(new ForumUser(1233, "Jan", 'M', LocalDate.of(1996,11,23), 0 ));

    }

    public List<ForumUser> getList() {

        return new ArrayList<>(userList);
    }
}

