package com.chufang.studymanager.service;

import com.chufang.studymanager.bean.Dep;

import java.util.List;

public interface DepService {

    List<Dep> list();

    void delete(Integer id);

    void add(Dep dep);
}
