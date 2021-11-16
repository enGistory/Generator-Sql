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
public class CqFyContractInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 合同id
     */
    private Integer contractId;

    /**
     * 物业公司名字  cq_fy_call_in_unit name
     */
    private String callInUnitName;

    /**
     * 物业公司id cq_fy_call_in_unit表id
     */
    private Integer callInUnitId;

    /**
     * 楼盘id
     */
    private Integer fyId;

    /**
     * 房屋类别 1 期房  2 现房
     */
    private Integer houseType;

    /**
     * 购买套数
     */
    private Integer num;

    /**
     * 购买面积
     */
    private BigDecimal area;

    /**
     * 购买单价
     */
    private BigDecimal price;

    /**
     * 购房款总额
     */
    private BigDecimal allMoney;

    /**
     * 大修单价
     */
    private BigDecimal overhaulPrice;

    /**
     * 大修基金总额
     */
    private BigDecimal overhaulAllMoney;

    /**
     * 办证服务费
     */
    private BigDecimal servicePrice;

    /**
     * 办证服务费总额
     */
    private BigDecimal serviceAllPrice;

    /**
     * 补交物业费金额
     */
    private BigDecimal propertyFee;

    /**
     * 补交物业费计费时间
     */
    private Date propertyFeeTime;

    /**
     * 交房时间
     */
    private Date deliveryTime;

    /**
     * 竣工时间
     */
    private Date completionTime;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 地址
     */
    private String address;

    /**
     * 地址经纬度
     */
    private String addressId;

    /**
     * 交通配套
     */
    private String trafficSupporting;

    /**
     * 学校配套
     */
    private String schoolSupporting;

    /**
     * 生活配套
     */
    private String livingSupporting;

    /**
     * 医疗配套
     */
    private String medicalSupport;

    /**
     * 套数余数
     */
    private Integer count;

    /**
     * 物业费单价
     */
    private BigDecimal wyPrice;

    /**
     * 联系电话
     */
    private String phone;

    private static final long serialVersionUID = 1L;
}