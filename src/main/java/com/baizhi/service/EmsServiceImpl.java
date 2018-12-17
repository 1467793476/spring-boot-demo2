package com.baizhi.service;


import com.baizhi.entity.Ems;
import com.baizhi.mapper.EmsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmsServiceImpl implements EmsService {
    @Autowired
    private EmsMapper emsMapper;


    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Ems> queryAll() {
        // TODO Auto-generated method stub
        List<Ems> list = emsMapper.queryAll();
        return list;
    }

    public void insert(Ems ems) {
        // TODO Auto-generated method stub
        emsMapper.regist(ems);
    }

    public void delete(Integer id) {
        // TODO Auto-generated method stub
        emsMapper.delete(id);
    }

    public Ems queryOneByID(Integer id) {
        // TODO Auto-generated method stub
        Ems ems = emsMapper.queryOne(id);
        return ems;
    }

    public void update(Ems ems) {
        // TODO Auto-generated method stub
        emsMapper.update(ems);
    }

}
