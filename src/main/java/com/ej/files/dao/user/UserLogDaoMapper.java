package com.ej.files.dao.user;

import com.ej.files.entity.user.UserLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserLogDaoMapper {

    UserLog getById(String id);

    UserLog queryUserLog(@Param("userLogName") String userLogName, @Param("password") String password);

    List<UserLog> getList(UserLog userLog);

    void save(UserLog userLog);

    void update(UserLog userLog);

    void delete(String id);

}
