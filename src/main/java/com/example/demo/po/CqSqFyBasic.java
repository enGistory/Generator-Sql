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
public class CqSqFyBasic implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 生成规则见维护需求
     */
    private String workBh;

    /**
     * 申请单位id
     */
    private Integer applyId;

    /**
     * 使用项目id
     */
    private Integer useBmId;

    /**
     * 使用单位id
     */
    private Integer useDwId;

    /**
     * 套数
     */
    private Integer num;

    /**
     * 面积
     */
    private BigDecimal area;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 申请人id
     */
    private Integer applyerId;

    /**
     * 申请日期
     */
    private Date applyDate;

    /**
     * 申请原因
     */
    private String applyReason;

    /**
     * 操作人id
     */
    private Integer workId;

    /**
     * 操作日期
     */
    private Date workDate;

    /**
     * 是否发出：0未发出  1待审  2审批通过  3审批退回  4不走审批
     */
    private Integer status;

    /**
     * 申请id（不走审批为 0）
     */
    private Integer sqId;

    /**
     * 类型id(cq_sq_fy_work_type表cxbh )： 1 年度需求计划2 购买建设3 房源调拨4 房源调剂5 重新入库6 房源处置7 房源使用 8 单位调剂  9 项目调剂  10 补偿决定
     */
    private Integer typeCxbh;

    /**
     * 1显示  2删除
     */
    private Integer deleted;

    /**
     * 1.调入  2.调出  TYPE_ID=4有效
     */
    private Integer sort;

    /**
     * type_id = 2 时有效  导入的明细表是否已确认入库 0.否 1.是
     */
    private Integer type2IsExportMx;

    /**
     * type_id = 2时有效 安置房源库是否已导入过 0.否 1.是
     */
    private Integer azfykIsExport;

    /**
     * 单位为征地事务中心时存项目名称,需求项目名称
     */
    private String bmName;

    /**
     * 房源调剂使用  生成调剂申请时 默认为0  操作发出按钮后 变为 1   调剂的对方单位才能进行房源选择 选择后  进行确定操作 字段变为2  申请单位才可往下发出申请 
     */
    private Integer type4Ok;

    /**
     * 需求计划缺口  当planning_gap=0 时 查询字表数据
     */
    private Integer planningGap;

    /**
     * 房源勾选状态，type: 3,4,5,6时使用，1未勾选，2结束勾选
     */
    private Integer tickStatus;

    /**
     * 房源勾选结束时间
     */
    private Date tickTime;

    /**
     * 弃用
     */
    private Integer demandDwId;

    /**
     * 调剂项目Id
     */
    private Integer djBmId;

    /**
     * 权证申请资料移交 1-项目文件 2-项目会议纪要 3-协议原件 4-公证书 5-个案会议纪要
     */
    private String qzYjZl;

    /**
     * 申请单通过时间
     */
    private Date passTime;

    /**
     * 延长周期
     */
    private Integer ycDay;

    private static final long serialVersionUID = 1L;
}