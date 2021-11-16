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
public class CqLc0 implements Serializable {
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
    private Integer sort;

    /**
     * 
     */
    private Integer cw;

    private static final long serialVersionUID = 1L;
}