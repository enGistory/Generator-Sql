package com.example.demo.po;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class CqSqFyBasicInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * cq_fy_basic(房源申请信息主表id)
     */
    private Integer cqFyBasicId;

    /**
     * 房源id：cq_fy表的id
     */
    private Integer fyId;

    /**
     * 栋id: cq_h0表id sort=0为房源的栋
     */
    private Integer h0Id;

    /**
     * 户id：cq_h1表id
     */
    private Integer h1Id;

    /**
     * 户型表id（house_type表）
     */
    private Integer houseTypeId;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 最小面积
     */
    private BigDecimal minArea;

    /**
     * 最大面积
     */
    private BigDecimal maxArea;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 添加数据是手动写的房源名字与fyid无关联
     */
    private String fyName;

    /**
     * 1未使用 2已使用  3 已收回
     */
    private String fyStatus;

    /**
     * 裁决人id
     */
    private Integer cjH;

    /**
     * 裁决人备注
     */
    private String remark;

    /**
     * 
     */
    private Integer yfH1Id;

    /**
     * 房源延长天数
     */
    private Integer ycDay;

    /**
     * 1 未延期自动收回，2 延期自动回收
     */
    private Integer recoveryStatus;

    /**
     * 回收前的归属项目
     */
    private Integer recoveryBmId;

    private static final long serialVersionUID = 1L;
}