package com.ej.files.service.user;



import com.ej.files.entity.menu.Menu;
import com.ej.files.entity.user.User;

import java.util.List;

public interface UserService {

    User queryUser(String userName, String password);

    User getById(String id);

    List<User> getList(User user);

    void save(User user);

    void update(User user);

    void delete(String id);


}
