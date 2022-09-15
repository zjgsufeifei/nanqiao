package com.example.nanqiao.common.request.activity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

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
    private String imagePath;

    /**
     * 活动介绍内容存储路径
     */
    private String descPath;

    /**
     * 活动内容存储路径
     */
    private String contentPath;

    /**
     * 注意事项存储路径
     */
    private String attentionPath;

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
     * 活动开始时间
     */
    @NotNull(message = "活动开始时间不能为空")
    private Date startTime;
}
