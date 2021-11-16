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
public class CqFy implements Serializable {
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
    private String tdxz;

    /**
     * 
     */
    private String jfbz;

    /**
     * 
     */
    private Integer ys0;

    /**
     * 
     */
    private Integer ysZj;

    /**
     * 
     */
    private Integer ys;

    /**
     * 
     */
    private Integer bh;

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
    private String xy;

    /**
     * 0房源1房源五星23区块
     */
    private Integer xybh;

    /**
     * 
     */
    private String comm;

    /**
     * 
     */
    private Integer tcId;

    private static final long serialVersionUID = 1L;
}