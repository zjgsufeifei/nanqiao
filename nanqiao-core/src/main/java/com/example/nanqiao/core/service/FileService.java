package com.example.nanqiao.core.service;

import com.example.nanqiao.common.request.file.FileUploadRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author smile
 */
public interface FileService {
    String upload(FileUploadRequest request, MultipartFile file);
}
