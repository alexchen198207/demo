package com.example.dao.mapper;

import com.example.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    void addUser(User user);

    /**
     * 在userMapper.xml中添加了queryUser方法后，在UserMapper 接口添加相应的方法。其中因为查询的user表，所以返回值类型用User对象去接收。根据用户名称去查询，
     * 所以入参为String类型，名称为username =>dao层写完毕后，去service层完成业务实现
     *
     * @param username
     * @return QuerySet
     */
    User queryUser(@Param("username") String username);

    void deleteUser(User user);
    void updateUser(User username);
}
