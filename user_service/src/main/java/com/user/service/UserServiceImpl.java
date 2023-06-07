package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	

    //fake user list

    List<User> list = List.of(
            new User(1311L, "ved patel", "23525625"),
            new User(1312L, "jamal masti", "99999"),
            new User(1314L, "ved jamal", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
