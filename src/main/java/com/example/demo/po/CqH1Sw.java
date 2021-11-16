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
public class CqH1Sw implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer h1Id;

    /**
     * 
     */
    private Integer fyH1Id;

    /**
     * 
     */
    private Integer bh;

    /**
     * 0意向1协议
     */
    private Integer sort;

    /**
     * 
     */
    private Date eDay;

    /**
     * 
     */
    private Integer eDayS;

    /**
     * 
     */
    private Date fDay;

    /**
     * 
     */
    private Integer fDayS;

    /**
     * 
     */
    private String workMc;

    /**
     * 
     */
    private Integer workUid;

    /**
     * 房款
     */
    private BigDecimal ja0;

    /**
     * 物业专项维修资金
     */
    private BigDecimal ja1;

    /**
     * 原房类别
     */
    private Integer hSort;

    /**
     * 安置价面积
     */
    private BigDecimal mj;

    /**
     * 安置单价
     */
    private BigDecimal dj0;

    /**
     * 增购单价
     */
    private BigDecimal dj1;

    /**
     * 1补充协议选房
     */
    private Integer xy2;

    /**
     * 公摊超15%补偿
     */
    private BigDecimal ja3;

    /**
     * 税费
     */
    private BigDecimal ja2;

    /**
     * 安置房装修补偿
     */
    private BigDecimal ja4;

    /**
     * 
     */
    private String azMc;

    /**
     * 
     */
    private String azZjh;

    /**
     * 0房款按套内*1.15，1按建面
     */
    private Integer ja0Js;

    /**
     * 
     */
    private String ja4Comm;

    /**
     * 
     */
    private BigDecimal ja1Sl;

    /**
     * 
     */
    private Integer zfDayS;

    /**
     * 接房日期
     */
    private Integer zfshhjfdDayS;

    /**
     * 
     */
    private Integer azys1;

    /**
     * 
     */
    private BigDecimal ja5;

    private static final long serialVersionUID = 1L;
}