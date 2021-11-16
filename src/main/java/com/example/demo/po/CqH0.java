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
public class CqH0 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 0房源1征收房
     */
    private Integer sort;

    /**
     * 
     */
    private Integer bmId;

    /**
     * 
     */
    private String mc;

    /**
     * 
     */
    private Integer bh;

    /**
     * 
     */
    private String jg;

    /**
     * 
     */
    private Integer ld;

    /**
     * 
     */
    private Integer lcs;

    /**
     * 
     */
    private Integer lcs2;

    /**
     * 
     */
    private Integer fs;

    /**
     * 公摊系数
     */
    private BigDecimal xs;

    /**
     * 单价
     */
    private BigDecimal dj;

    /**
     * 
     */
    private Date jfDay;

    /**
     * 
     */
    private Integer jfDayS;

    /**
     * 
     */
    private Integer ys0;

    /**
     * 
     */
    private Integer ys;

    /**
     * 
     */
    private String tdxz;

    /**
     * 
     */
    private String jfbz;

    /**
     * 
     */
    private Integer x;

    /**
     * 
     */
    private Integer y;

    /**
     * 
     */
    private String comm;

    /**
     * 0期房1现房
     */
    private Integer xf;

    /**
     * 
     */
    private String xy;

    /**
     * 
     */
    private Integer a1;

    /**
     * 
     */
    private Integer jgId;

    /**
     * 
     */
    private Integer h1Sort;

    /**
     * 增加月数
     */
    private Integer ys1;

    /**
     * 
     */
    private Integer fz2Id;

    /**
     * 
     */
    private String jdmc;

    /**
     * 鉴定文号
     */
    private String jdwh;

    /**
     * 
     */
    private Integer wsSort;

    /**
     * 0按楼层户数1按ID
     */
    private Integer px;

    /**
     * 
     */
    private String zb;

    /**
     * 房屋性质  1商品房 2拆迁房 3房改房 经济适用房
     */
    private Integer houseNature;

    /**
     * 房屋类型 1 电梯房  2 非电梯
     */
    private Integer houseType;

    private static final long serialVersionUID = 1L;
}