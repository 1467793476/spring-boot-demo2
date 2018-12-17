package com.baizhi.controller;

import com.baizhi.entity.Ems;
import com.baizhi.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("es")
public class TestController {
    @Autowired
    private EmsService emsService;

    //es/updateAction
    @RequestMapping("/queryAll")
    public List<Ems> queryAll(HttpSession session) {
        List<Ems> list = emsService.queryAll();
        session.setAttribute("emslist", list);
        return list;
    }
}
