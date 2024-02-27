package com.ej.files.dao.user;

import com.ej.files.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDaoMapper {

    User getById(String id);

    User queryUser(@Param("userName") String userName, @Param("password") String password);

    List<User> getList(User user);

    void save(User user);

    void update(User user);

    void delete(String id);

}
