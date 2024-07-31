package com.katenka.springbootcours.service;


import com.katenka.springbootcours.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(long id);
    void save(User user);
    void update(long id, User user);
    void delete(long id);
}
