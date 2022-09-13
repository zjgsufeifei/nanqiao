package com.example.nanqiao.common.response.activity;

import com.example.nanqiao.common.dto.ApplyDetailDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/12
 **/
@Data
public class ApplyListResponse implements Serializable {
    private static final long serialVersionUID = -8038786585961538748L;
    List<ApplyDetailDTO> applyList;
}
