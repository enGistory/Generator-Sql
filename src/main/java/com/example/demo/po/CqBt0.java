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
public class CqBt0 implements Serializable {
    /**
     * 
     */
    private Integer id;

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
    private Integer js;

    /**
     * 
     */
    private Integer cxbh;

    /**
     * 0补偿1奖励
     */
    private Integer jl;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private Integer qy;

    /**
     * 
     */
    private String comm;

    private static final long serialVersionUID = 1L;
}