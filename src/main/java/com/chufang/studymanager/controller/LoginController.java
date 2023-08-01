package com.chufang.studymanager.controller;

import com.chufang.studymanager.bean.Emp;
import com.chufang.studymanager.bean.Result;
import com.chufang.studymanager.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/login")
    public Result login(@RequestBody Emp emp) {
        log.info("员工登录：{}", emp);
        Emp e = empService.login(emp);
        return e != null ? Result.success() : Result.error("用户名或者密码错误");
    }
}
