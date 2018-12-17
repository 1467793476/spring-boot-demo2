package com.baizhi.mapper;

import com.baizhi.entity.User;

public interface UserMapper {
    public User queryOne(String username);

    public void insert(User user);


}
