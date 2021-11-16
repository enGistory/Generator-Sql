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
public class CqLc2 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer lc0Id;

    /**
     * 
     */
    private Integer bmId;

    /**
     * 
     */
    private Integer fz2Id;

    /**
     * 
     */
    private Integer uid;

    /**
     * 
     */
    private Integer bh;

    /**
     * 
     */
    private Integer ok;

    /**
     * 
     */
    private Integer msn;

    /**
     * 
     */
    private Integer msn2;

    /**
     * 
     */
    private Integer h;

    /**
     * 职务
     */
    private String zw;

    /**
     * 操作权限 1 选房  
     */
    private Integer isXf;

    private static final long serialVersionUID = 1L;
}