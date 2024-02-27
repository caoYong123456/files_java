package com.ej.files.service.user;



import com.ej.files.entity.user.User;
import com.ej.files.entity.user.UserLog;

import java.util.List;

public interface UserLogService {

    UserLog queryUserLog(String userName, String password);

    UserLog getById(String id);

    List<UserLog> getList(UserLog userLog);

    void save(UserLog userLog);

    void update(UserLog userLog);

    void delete(String id);


}
