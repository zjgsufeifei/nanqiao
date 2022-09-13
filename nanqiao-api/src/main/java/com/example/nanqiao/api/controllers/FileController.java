package com.example.nanqiao.api.controllers;

import com.example.nanqiao.common.response.BaseResponse;
import com.example.nanqiao.core.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author smile
 */
@Slf4j
@RestController
@RequestMapping("/nan_qiao/file")
public class FileController {
    @Autowired
    private FileService fileService;

    /**
     * 上传文件
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public BaseResponse<String> upload(@RequestPart("file") MultipartFile file) {
        return BaseResponse.success(fileService.upload(file)).build();
    }
}
