package com.chufang.studymanager.service.impl;

import com.chufang.studymanager.bean.Dep;
import com.chufang.studymanager.mapper.DepMapper;
import com.chufang.studymanager.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DepServiceImpl implements DepService {
    @Autowired
    private DepMapper depMapper;
    @Override
    public List<Dep> list() {
        List<Dep> depList = depMapper.list();
        return depList;
    }

    @Override
    public void delete(Integer id) {
        depMapper.delete(id);
    }

    @Override
    public void add(Dep dep) {
        dep.setCreateTime(LocalDateTime.now());
        dep.setUpdateTime(LocalDateTime.now());
        depMapper.insert(dep);
    }
}
