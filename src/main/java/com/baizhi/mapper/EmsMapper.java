package com.baizhi.mapper;

import com.baizhi.entity.Ems;

import java.util.List;

public interface EmsMapper {

    public List<Ems> queryAll();

    public Ems queryOne(Integer id);

    public void regist(Ems ems);

    public void update(Ems ems);

    public void delete(Integer id);
}
