package com.example.nanqiao.api.controllers;

import com.example.nanqiao.common.request.content.ContentCatalogAddRequest;
import com.example.nanqiao.common.request.content.ContentCatalogQueryRequest;
import com.example.nanqiao.common.request.content.ContentCatalogUpdateRequest;
import com.example.nanqiao.common.response.BaseResponse;
import com.example.nanqiao.common.response.PageResult;
import com.example.nanqiao.common.vo.ContentCatalogVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smile
 */
@Slf4j
@RestController
@RequestMapping("/nan_qiao/content/catalog")
public class ContentCatalogController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    BaseResponse<Boolean> add(@RequestBody ContentCatalogAddRequest request) {
        return BaseResponse.success(true).build();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    BaseResponse<Boolean> update(@RequestBody ContentCatalogUpdateRequest request) {
        return BaseResponse.success(true).build();
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    BaseResponse<PageResult<ContentCatalogVO>> query(@RequestBody ContentCatalogQueryRequest request) {
        return BaseResponse.newSuccResponse().build();
    }
}
