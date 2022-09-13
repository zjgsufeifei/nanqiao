package com.example.nanqiao.api.controllers;

import com.example.nanqiao.common.request.content.ContentAddRequest;
import com.example.nanqiao.common.request.content.ContentQueryRequest;
import com.example.nanqiao.common.request.content.ContentUpdateRequest;
import com.example.nanqiao.common.response.BaseResponse;
import com.example.nanqiao.common.response.PageResult;
import com.example.nanqiao.common.vo.ContentVO;
import com.example.nanqiao.core.service.ContentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author smile
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/nan_qiao/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    BaseResponse<Boolean> add(@Valid @RequestBody ContentAddRequest request) {
        return BaseResponse.success(contentService.add(request)).build();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    BaseResponse<Boolean> update(@Valid @RequestBody ContentUpdateRequest request) {
        return BaseResponse.success(contentService.update(request)).build();
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    BaseResponse<PageResult<ContentVO>> query(@Valid @RequestBody ContentQueryRequest request) {
        return BaseResponse.success(contentService.list(request)).build();
    }
}
