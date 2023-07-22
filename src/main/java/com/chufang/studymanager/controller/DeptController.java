package com.chufang.studymanager.controller;

import com.chufang.studymanager.bean.Dep;
import com.chufang.studymanager.bean.Result;
import com.chufang.studymanager.service.DepService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/deps")
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DepService depService;
//    @RequestMapping(value = "/deps", method = RequestMethod.GET)
    @GetMapping()
    public Result list() {
        log.info("查询全部部门数据");
        List<Dep> depList = depService.list();
        return Result.success(depList);
    }

    /**
     * 删除部门
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据ID删除部门:{}", id);
        depService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     */
    @PostMapping()
    public Result add(@RequestBody Dep dep) {
        depService.add(dep);
        Result success = Result.success();
        return success;
    }



}
