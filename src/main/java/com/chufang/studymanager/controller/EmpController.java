package com.chufang.studymanager.controller;

import com.chufang.studymanager.bean.PageBean;
import com.chufang.studymanager.bean.Result;
import com.chufang.studymanager.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/emps")
@Slf4j
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer pageSize
//    ) {
//        PageBean pageBean = empService.page(page, pageSize);
//        return Result.success(pageBean);
//    }
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name,
                       Short gender,
                       @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate end) {
        PageBean pageBean = empService.page(page, pageSize,name, gender, begin, end);
        return Result.success(pageBean);
    }
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
         log.info("批量删除 {}", ids);
         empService.delete(ids);
        return Result.success();
    }

}
