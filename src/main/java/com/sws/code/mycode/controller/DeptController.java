package com.sws.code.mycode.controller;

import com.sws.code.mycode.entry.Dept;
import com.sws.code.mycode.server.DeptServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    DeptServer deptServer;

    @RequestMapping("/dept/getDeptByKey")
    public Dept getDeptByPrimaryKey(int id){
        Dept dept = deptServer.selectDeptByPrimary(id);
        return dept;
    }

    @RequestMapping("/dept/getAllNum")
    public int getAllNum(){
       int num = deptServer.getAllNum();
        return num;
    }
}
