package com.baizhi.service;


import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public void login(User u) {
        User user = userMapper.queryOne(u.getUsername());
        //System.out.println(user);
        if (user == null) throw new RuntimeException("用户不存在");
        if (!u.getPassword().equals(user.getPassword())) throw new RuntimeException("密码不对");

    }

    public void regist(User u) {
        // TODO Auto-generated method stub
        User user = userMapper.queryOne(u.getUsername());
        if (user == u) throw new RuntimeException("该用户已存在");
        userMapper.insert(u);
    }

}
