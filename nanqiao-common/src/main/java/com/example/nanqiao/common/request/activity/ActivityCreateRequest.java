package com.example.nanqiao.common.request.activity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: coco
 * @Date: 2022/9/15
 **/
@Data
public class ActivityCreateRequest implements Serializable {
    private static final long serialVersionUID = -9047766939822057805L;
    /**
     * 创建人
     */
    private String creator;

    /**
     * 标题
     */
    @NotNull(message = "活动标题不能为空")
    private String title;

    /**
     * 图片存储路径
     */
    private List<String> imagePathList;

    /**
     * 活动介绍内容存储路径
     */
    private String descPath;

    /**
     * 活动内容存储路径
     */
    private String contentPath;

    /**
     * 注意事项
     */
    private String attention;

    /**
     * 人数限制
     */
    private Integer numberLimit;
    /**
     * 活动地址
     */
    @NotNull(message = "活动地址不能为空")
    private String address;
    /**
     * 活动开始时间 毫秒时间戳
     */
    @NotNull(message = "活动开始时间不能为空")
    private Long startTime;
}
