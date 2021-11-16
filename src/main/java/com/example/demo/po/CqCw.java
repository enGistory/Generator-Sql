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
public class CqCw implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer bmId;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private Integer sort2;

    /**
     * 
     */
    private Integer uid;

    /**
     * 
     */
    private String uidMc;

    /**
     * 
     */
    private Integer cwDw1Id;

    /**
     * 
     */
    private Integer cwDw2Id;

    /**
     * 
     */
    private Integer bank1Id;

    /**
     * 
     */
    private Integer bank2Id;

    /**
     * 
     */
    private BigDecimal ja;

    /**
     * 
     */
    private BigDecimal ja2;

    /**
     * 
     */
    private String mc;

    /**
     * 
     */
    private Integer mc2i;

    /**
     * 
     */
    private Integer ac;

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
    private Date fNow;

    /**
     * 
     */
    private String comm;

    /**
     * 
     */
    private Integer cw0Id;

    /**
     * 
     */
    private Integer sqId;

    /**
     * 
     */
    private String xcommf3;

    private static final long serialVersionUID = 1L;
}