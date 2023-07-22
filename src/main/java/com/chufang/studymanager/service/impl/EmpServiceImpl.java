package com.chufang.studymanager.service.impl;

import com.chufang.studymanager.bean.Emp;
import com.chufang.studymanager.bean.PageBean;
import com.chufang.studymanager.mapper.EmpMapper;
import com.chufang.studymanager.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

//    @Override
//    public PageBean page(Integer page, Integer pageSize) {
//        Long count = empMapper.count();
//        Integer start = (page - 1) * pageSize;
//        List<Emp> empList = empMapper.page(start, pageSize);
//        PageBean pageBean = new PageBean(count, empList);
//        return pageBean;
//    }


    @Override
    public PageBean page(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);

        List<Emp> empList = empMapper.page();

        Page<Emp> p = (Page<Emp>) empList;

        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());

        return pageBean;
    }
}
