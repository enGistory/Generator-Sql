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
public class CqFyContract implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 1 房源购买合同 2单位调剂合同
     */
    private Integer type;

    /**
     * 操作人id
     */
    private Integer workId;

    /**
     * 操作日期
     */
    private Date workDate;

    /**
     * 生成规则见维护需求
     */
    private String workBh;

    /**
     * 购买来源字典表程序编号
     */
    private Integer purchaseSourceCxbh;

    /**
     * 购买来源字典表名称
     */
    private String purchaseSourceName;

    /**
     * 购买项目id
     */
    private Integer payForBmId;

    /**
     * 开发商id  cq_fy_call_in_unit id
     */
    private Integer callInUnitId;

    /**
     * 开发商名字  cq_fy_call_in_unit name
     */
    private String callInUnitName;

    /**
     * 开发商/调入单位 收款名称
     */
    private String beneficiaryName;

    /**
     * 开发商/调入单位 开户行
     */
    private String bankName;

    /**
     * 开发商/调入单位 银行卡号
     */
    private String bankNum;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 合同签订时间
     */
    private Date signDate;

    /**
     * 合同总金额
     */
    private BigDecimal sumMoney;

    private static final long serialVersionUID = 1L;
}