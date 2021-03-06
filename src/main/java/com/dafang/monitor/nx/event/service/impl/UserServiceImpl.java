package com.dafang.monitor.nx.event.service.impl;



import com.dafang.monitor.nx.event.entity.po.User;
import com.dafang.monitor.nx.event.mapper.UserMapper;
import com.dafang.monitor.nx.event.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectUserList();
    }

    @Override
    public void insert(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void delete(User user) {
        userMapper.deleteUser(user);
    }
}
