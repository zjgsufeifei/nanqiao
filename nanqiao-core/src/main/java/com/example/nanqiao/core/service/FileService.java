package com.example.nanqiao.core.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author smile
 */
public interface FileService {
    String upload(MultipartFile file);
}
