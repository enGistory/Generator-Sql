package com.example.demo.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class CqSqFyFileInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 关联表id
     */
    private Integer relationId;

    /**
     * 路径
     */
    private String path;

    /**
     * 源文件名
     */
    private String name;

    /**
     * 关联cq_fy_file_type表id
     */
    private Integer type;

    /**
     * 文件类别 1.图片 2.文档
     */
    private Integer fileType;

    /**
     * 上传人用户id
     */
    private Integer addUserId;

    /**
     * 上传时间 
     */
    private Date addtime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 
     */
    private Integer createUserId;

    private static final long serialVersionUID = 1L;
}