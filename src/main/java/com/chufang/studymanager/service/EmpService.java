package com.chufang.studymanager.service;

import com.chufang.studymanager.bean.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

//    PageBean page(Integer page, Integer pageSize);
    PageBean page(Integer page, Integer pageSize,String name,
                  Short gender,
                  LocalDate begin,
                  LocalDate end);

    void delete(List<Integer> ids);
}
