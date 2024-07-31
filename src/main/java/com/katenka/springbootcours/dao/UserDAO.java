package com.katenka.springbootcours.dao;



import com.katenka.springbootcours.model.User;

import java.util.List;

public interface UserDAO {
    List<User> index();

    User show(long id) ;
    void save(User user);
    void update(long id, User user);
    void delete(long id);

}
