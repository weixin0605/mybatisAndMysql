package com.sws.code.mycode.server;

import com.sws.code.mycode.dao.DeptDao;
import com.sws.code.mycode.entry.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeptServer {
    @Autowired
    private DeptDao deptDao;

    public Dept selectDeptByPrimary(int id){
        Dept dept = deptDao.selectByPrimaryKey(id);
        return dept;
    }

    public int getAllNum(){
        int num = deptDao.getAllNum();
        return num;
    }
}
