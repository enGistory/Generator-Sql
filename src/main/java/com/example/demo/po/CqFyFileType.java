package com.example.demo.po;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class CqFyFileType implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 附件的类别名称
     */
    private String mc;

    /**
     * cxbh  -1合同附件
     */
    private Integer cxbh;

    /**
     * sort
     */
    private Integer sort;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 房源申请信息主表 cq_sq_fy_basic 表id
     */
    private Integer cqSqFyBasicId;

    /**
     * 用于判断是否能在网页上操作删除该类别 0.是 1.否
     */
    private Integer isPageDeleted;

    /**
     * 是否是在申请后新增的该类别 0否 1.是
     */
    private Integer isApplyAdd;

    /**
     * 
     */
    private Integer mustUpload;

    /**
     * 
     */
    private Integer createUserId;

    /**
     * 
     */
    private Integer isApplyAdd1;

    private static final long serialVersionUID = 1L;
}