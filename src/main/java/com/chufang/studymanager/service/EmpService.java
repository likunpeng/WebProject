package com.chufang.studymanager.service;

import com.chufang.studymanager.bean.PageBean;

public interface EmpService {

    PageBean page(Integer page, Integer pageSize);
}
