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
public class CqFyContractImport implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 合同id  为0时  为无合同
     */
    private Integer contractId;

    /**
     * 房源id
     */
    private Integer h1Id;

    /**
     * 操作人id
     */
    private Integer workId;

    /**
     * 操作日期
     */
    private Date workDate;

    /**
     * 合同详情id
     */
    private Integer contractInfoId;

    private static final long serialVersionUID = 1L;
}