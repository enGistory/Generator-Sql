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
public class HousingCirculation implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 1、购买建设；2入库；3 调拨到征收项目  4房源退回；5单位调剂6 收回房源 ；7项目调剂；8预选；9 裁决  10 撤销裁决）；11 已安置；12接房；13 办证资料移交  14  撤销办证   
     */
    private Integer cxbh;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 不同类别 对应的主表id
     */
    private Integer tabId;

    /**
     * 房源h1id
     */
    private Integer fyH1Id;

    /**
     * 操作人id
     */
    private Integer workUid;

    /**
     * 操作人名字
     */
    private String workName;

    /**
     * 流转时间 已审核通过后 更新房源状态的时间为准
     */
    private Date workDate;

    /**
     * 审批编号
     */
    private String workBh;

    /**
     * 项目id  购买项目 调剂项目
     */
    private String bmName;

    /**
     * 单位名称  开发商/平台单位/需求单位
     */
    private String dwName;

    /**
     * 被征收人 /接房人
     */
    private String renName;

    /**
     * 协议编号
     */
    private String xyBh;

    /**
     * 权证编号
     */
    private String bzBh;

    /**
     * 合同编号
     */
    private String contractBh;

    /**
     * 
     */
    private Integer bmId;

    private static final long serialVersionUID = 1L;
}