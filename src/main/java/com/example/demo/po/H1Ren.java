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
public class H1Ren implements Serializable {
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
    private Integer renId;

    /**
     * 
     */
    private Integer gxId;

    /**
     * 
     */
    private Integer jdId;

    /**
     * 
     */
    private Integer sqId;

    /**
     * 1bt
     */
    private Integer bt;

    /**
     * 
     */
    private String mc;

    /**
     * 
     */
    private Integer zjId;

    /**
     * 
     */
    private String zjh;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private Integer fms;

    /**
     * 
     */
    private Integer azId;

    /**
     * 
     */
    private String azComm;

    /**
     * 
     */
    private String dw;

    /**
     * 
     */
    private String txzh;

    /**
     * 
     */
    private String syzh;

    /**
     * 
     */
    private String qtzh;

    /**
     * 
     */
    private String phoneZj;

    /**
     * 
     */
    private String phoneSj;

    /**
     * 
     */
    private String phoneGz;

    /**
     * 
     */
    private String dzxx;

    /**
     * 
     */
    private String comm;

    /**
     * 
     */
    private BigDecimal bzZxzj;

    /**
     * 
     */
    private BigDecimal bzPf;

    /**
     * 
     */
    private String picAdd;

    /**
     * 本人收入
     */
    private Integer sr;

    /**
     * 集资建房数
     */
    private Integer f1;

    /**
     * 优惠售房数
     */
    private Integer f2;

    /**
     * 经适房数
     */
    private Integer f3;

    /**
     * 其他购房数
     */
    private Integer f4;

    /**
     * 档案号
     */
    private String dah;

    /**
     * 
     */
    private String ht0;

    /**
     * 
     */
    private String ht1;

    /**
     * 
     */
    private String ht2;

    /**
     * 
     */
    private BigDecimal camj;

    /**
     * 
     */
    private BigDecimal cadj;

    /**
     * 
     */
    private Integer pzSort;

    private static final long serialVersionUID = 1L;
}