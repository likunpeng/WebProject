package com.chufang.studymanager.controller;

import com.chufang.studymanager.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) {
        log.info("上传文件信息 username = {}, age = {}, image = {}", username, age, image);
        return Result.success();
    }
}
