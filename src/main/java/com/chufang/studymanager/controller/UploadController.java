package com.chufang.studymanager.controller;

import com.chufang.studymanager.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws IOException {
        log.info("上传文件信息 username = {}, age = {}, image = {}", username, age, image);
        String originalFilename = image.getOriginalFilename();
        // 构建唯一的文件名
        String newFileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
        image.transferTo(new File("/Users/lkp/Documents/" + newFileName));
        return Result.success();
    }
}
