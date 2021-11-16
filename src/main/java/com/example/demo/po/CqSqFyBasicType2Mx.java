package com.example.demo.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class CqSqFyBasicType2Mx implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 合同表id  为0时  未选择合同导入
     */
    private Integer cqFyContractId;

    /**
     * 房源名称
     */
    private String cqFyMc;

    /**
     * 房屋类别(住宅,非住宅)
     */
    private Integer sort;

    /**
     * 栋号
     */
    private String h0Mc;

    /**
     * 套号
     */
    private String th;

    /**
     * 户型
     */
    private String fx;

    /**
     * 建筑面积
     */
    private String mjJStr;

    /**
     * 套内面积
     */
    private String mjTStr;

    /**
     * 公摊系数
     */
    private String mjXyStr;

    /**
     * 购买单价
     */
    private BigDecimal buyPrice;

    /**
     * 装修状态
     */
    private String decorateState;

    /**
     * 土地性质
     */
    private String tdxz;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 添加人id
     */
    private Integer addUserId;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 入库操作人id
     */
    private Integer inStorageUserId;

    /**
     * 入库时间
     */
    private Date inStorageTime;

    /**
     * 是否已入库 1.否 2.是
     */
    private Integer isInStorage;

    /**
     * 入库类别 0.[购买建设]的明细表.分为导入->再入库 1.[安置房源库][购买建设]类别,导入明细时同时入库 2.[安置房源库][其它]类别,导入明细时同时入库
     */
    private Integer mxCategory;

    /**
     * 此条明细所属单位id 以应对跨单位导入明细
     */
    private Integer possessDwId;

    /**
     * 对应的入库时的h1_id
     */
    private Integer h1Id;

    /**
     * 居住面积
     */
    private BigDecimal mjJz2;

    /**
     *  1能够导入  2 无法导入
     */
    private Integer isTrue;

    /**
     * 错误原因
     */
    private String errorReason;

    /**
     * 房屋类别（期房，现房）
     */
    private Integer xf;

    /**
     * 批次
     */
    private String uuidKey;

    /**
     * 最大楼层数
     */
    private Integer lcs;

    /**
     * 最大户数
     */
    private Integer fs;

    /**
     * 楼栋id
     */
    private Integer h0Id;

    /**
     * 户型编号
     */
    private Integer fxBh;

    /**
     * 合同详情id
     */
    private Integer cqFyContractInfoId;

    /**
     * 安置单价
     */
    private String azDj;

    private static final long serialVersionUID = 1L;
}