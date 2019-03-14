package com.example.demo.Mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface UserMapper{

    @Insert("insert into user(name,age) values(#{name},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int addUser(User u);

    //    @Select("select * from user where id=#{id}")
    User find(Integer id);

    @Select("select * from user ORDER BY age DESC")
    List<User> findByAge();
}
