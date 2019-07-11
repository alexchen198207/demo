package com.example.service;

import com.example.dao.entity.User;
import com.example.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    /**
     * @param username 调用UserMapper的queryUser方法，参数是用户名username
     * @return 返回User对象
     */
    public User queryUser(String username) {
        return userMapper.queryUser(username);
    }

    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

}
