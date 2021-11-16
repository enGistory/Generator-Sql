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
public class H1RenAc implements Serializable {
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
    private Integer h1RenId;

    /**
     * 
     */
    private Integer ac;

    /**
     * 
     */
    private Integer jz;

    /**
     * 
     */
    private Date iDay;

    /**
     * 
     */
    private Integer iDayS;

    private static final long serialVersionUID = 1L;
}