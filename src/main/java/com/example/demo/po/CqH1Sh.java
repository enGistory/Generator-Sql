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
public class CqH1Sh implements Serializable {
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
    private Integer xyId;

    /**
     * 
     */
    private Integer uid;

    /**
     * 
     */
    private String worker;

    /**
     * 
     */
    private Integer spUid;

    /**
     * 
     */
    private String spUid0;

    /**
     * 
     */
    private Integer cn;

    /**
     * 
     */
    private String comm;

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
    private Integer sqth;

    /**
     * 
     */
    private Integer ac;

    /**
     * 
     */
    private Integer lc0Id;

    /**
     * 
     */
    private Integer sqId;

    /**
     * 
     */
    private Integer zt;

    /**
     * 
     */
    private String yj;

    /**
     * 
     */
    private String qm;

    private static final long serialVersionUID = 1L;
}