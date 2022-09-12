package com.example.nanqiao.core.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.example.nanqiao.core.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author smile
 */
@Slf4j
@Service
public class FileServiceImpl implements FileService {
    private static String END_POINT = "https://oss-cn-shanghai.aliyuncs.com";
    private static String BUCKET_NAME = "nanqiao-gongzhonghao";
    private static String ACCESS_KEY_ID = "LTAI5tSXkPeNSzLmRGxpTTZ6";
    private static String ACCESS_KEY_SECRET = "u5A4bOgrI7cBt3NPCcttWer1hS32q5";

    public String upload(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        OSS ossClient = new OSSClientBuilder().build(END_POINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);

        try {
            ossClient.putObject(BUCKET_NAME, fileName, file.getInputStream());
        } catch (Exception e) {
            log.error("upload file error", e);
        } finally {
            ossClient.shutdown();
        }

        return fileName;
    }
}
