package com.chufang.studymanager.controller;

import com.chufang.studymanager.bean.PageBean;
import com.chufang.studymanager.bean.Result;
import com.chufang.studymanager.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/emps")
@Slf4j
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize
    ) {
        PageBean pageBean = empService.page(page, pageSize);
        return Result.success(pageBean);
    }

}
