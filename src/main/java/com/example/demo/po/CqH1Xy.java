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
public class CqH1Xy implements Serializable {
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
    private Integer bh;

    /**
     * 
     */
    private String htbh;

    /**
     * 0无效1有效2预签
     */
    private Integer ok;

    /**
     * 1货币2实物
     */
    private Integer az;

    /**
     * 
     */
    private String renMc;

    /**
     * 
     */
    private String zjh;

    /**
     * 
     */
    private String renMc2;

    /**
     * 
     */
    private String zjh2;

    /**
     * 
     */
    private String workMc;

    /**
     * 
     */
    private Integer workUid;

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
    private Date fDay2;

    /**
     * 
     */
    private Integer sc;

    /**
     * 
     */
    private Integer phqSort;

    /**
     * 1货币2实物
     */
    private Integer az2;

    /**
     * 
     */
    private String phqP1;

    /**
     * 
     */
    private BigDecimal phqP1Ja;

    /**
     * 
     */
    private Integer xz;

    /**
     * 
     */
    private Date scDay;

    /**
     * 
     */
    private Integer scDayS;

    /**
     * 
     */
    private String scWorker;

    /**
     * 1已全额支付审核2已全额支付
     */
    private Integer zf;

    /**
     * 
     */
    private Integer zfok;

    /**
     * 补偿总额
     */
    private BigDecimal ja;

    /**
     * 
     */
    private Integer fh;

    /**
     * 0征收2预征收
     */
    private Integer sort;

    private static final long serialVersionUID = 1L;
}