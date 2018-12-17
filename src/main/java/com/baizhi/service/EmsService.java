package com.baizhi.service;

import com.baizhi.entity.Ems;

import java.util.List;

public interface EmsService {
    public List<Ems> queryAll();

    public Ems queryOneByID(Integer id);

    public void insert(Ems ems);

    public void update(Ems ems);

    public void delete(Integer id);
}
