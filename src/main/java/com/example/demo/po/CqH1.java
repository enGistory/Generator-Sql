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
public class CqH1 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer h0Id;

    /**
     * 
     */
    private Integer ld;

    /**
     * 0保底
     */
    private Integer bd;

    /**
     * 0违面扣保底1不扣
     */
    private Integer bd2;

    /**
     * 
     */
    private BigDecimal bdkMj;

    /**
     * 0私房1公房2部分产权3成套无证房
     */
    private Integer gf;

    /**
     * 
     */
    private Integer fzz;

    /**
     * 
     */
    private Integer fzzId;

    /**
     * 
     */
    private BigDecimal gf2Bl;

    /**
     * 
     */
    private String gf2Dw;

    /**
     * 
     */
    private BigDecimal gf2DwBl;

    /**
     * 分配项目id
     */
    private Integer bmId;

    /**
     * 0实物1货币
     */
    private Integer azyx;

    /**
     * 0公共1领导掌握 2 裁决
     */
    private Integer gg;

    /**
     * 未分配0已分配1
     */
    private Integer fp;

    /**
     * 
     */
    private Integer fzId;

    /**
     * 
     */
    private Integer renId;

    /**
     * 
     */
    private String dh2;

    /**
     * 
     */
    private String th;

    /**
     * 
     */
    private String thComm;

    /**
     * 
     */
    private Integer fxBh;

    /**
     * 户型
     */
    private String fx;

    /**
     * 
     */
    private BigDecimal mjJ;

    /**
     * 
     */
    private BigDecimal mjT;

    /**
     * 阳台
     */
    private BigDecimal mjY;

    /**
     * 
     */
    private BigDecimal mjG;

    /**
     * 所在楼层
     */
    private Integer lc;

    /**
     * 
     */
    private Integer fsbh;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private String cqz;

    /**
     * 
     */
    private String gtz;

    /**
     * 
     */
    private Integer pt;

    /**
     * 
     */
    private BigDecimal zgf;

    /**
     * 
     */
    private BigDecimal zgfMj;

    /**
     * 实际居住人口数
     */
    private Integer jzs;

    /**
     * 户籍人口数
     */
    private Integer fjs;

    /**
     * 
     */
    private Integer bS;

    /**
     * 
     */
    private Integer bFs;

    /**
     * 
     */
    private Integer bD;

    /**
     * 
     */
    private Integer bFd;

    /**
     * 
     */
    private Integer bQ;

    /**
     * 
     */
    private Integer bBl;

    /**
     * 
     */
    private Integer bDh;

    /**
     * 
     */
    private Integer bKt;

    /**
     * 
     */
    private String zx;

    /**
     * 
     */
    private BigDecimal wzMj;

    /**
     * 
     */
    private String wzJg;

    /**
     * 
     */
    private Integer wzNd;

    /**
     * 
     */
    private String qt;

    /**
     * 
     */
    private String lxRen;

    /**
     * 
     */
    private String gx;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String dz;

    /**
     * 
     */
    private String comm;

    /**
     * 
     */
    private String comm2;

    /**
     * 
     */
    private String comm3;

    /**
     * 
     */
    private BigDecimal xs;

    /**
     * 
     */
    private BigDecimal dj;

    /**
     * 
     */
    private BigDecimal dj2;

    /**
     * 
     */
    private BigDecimal ktf;

    /**
     * 装修费
     */
    private BigDecimal zxf;

    /**
     * 装修费录入 为0计算
     */
    private BigDecimal zxf2;

    /**
     * 违建费
     */
    private BigDecimal wjf;

    /**
     * 
     */
    private Integer xyYx;

    /**
     * 
     */
    private Integer xyJf;

    /**
     * 
     */
    private Integer lc1;

    /**
     * 
     */
    private Integer lc2;

    /**
     * 
     */
    private Integer lc3;

    /**
     * 
     */
    private Date fDay;

    /**
     * 1货币2实物
     */
    private Integer az;

    /**
     * 1意愿协议
     */
    private Integer yy;

    /**
     * 
     */
    private Date yyDay;

    /**
     * 
     */
    private Integer yyDayS;

    /**
     * 
     */
    private String yyRenMc;

    /**
     * 
     */
    private Integer yyRenId;

    /**
     * 房源id
     */
    private Integer fyId;

    /**
     * 0征收房源1扫尾房源
     */
    private Integer fySort1;

    /**
     * 1协议
     */
    private Integer xy;

    /**
     * 
     */
    private String cqsm;

    /**
     * 
     */
    private Integer bFbl;

    /**
     * 
     */
    private Integer b2S;

    /**
     * 
     */
    private Integer b2Fs;

    /**
     * 
     */
    private Integer b2D;

    /**
     * 
     */
    private Integer b2Fd;

    /**
     * 
     */
    private Integer b2Q;

    /**
     * 
     */
    private Integer b2Fq;

    /**
     * 
     */
    private Integer b2Bl;

    /**
     * 
     */
    private Integer b2Fbl;

    /**
     * 
     */
    private Integer b2Dh;

    /**
     * 
     */
    private Integer b2Kt;

    /**
     * 
     */
    private Integer az2;

    /**
     * 
     */
    private Integer dwId;

    /**
     * 当前分配单位
     */
    private Integer dwIdAc;

    /**
     * 
     */
    private Integer xlf;

    /**
     * 
     */
    private String qzh;

    /**
     * 
     */
    private Integer bDld;

    /**
     * 
     */
    private BigDecimal chmjJ;

    /**
     * 
     */
    private BigDecimal chmjXs;

    /**
     * 纯网络
     */
    private Integer bWl;

    /**
     * 
     */
    private Integer gfdwId;

    /**
     * 
     */
    private Integer b2Wl;

    /**
     * 
     */
    private Integer bDl;

    /**
     * 
     */
    private Integer b2Dl;

    /**
     * 
     */
    private BigDecimal jaSf;

    /**
     * 
     */
    private String gf1Zyh;

    /**
     * 
     */
    private Integer bSzds;

    /**
     * 
     */
    private Integer bRsq;

    /**
     * 
     */
    private Integer b2Rsq;

    /**
     * 
     */
    private Integer b2Szds;

    /**
     * 
     */
    private Integer b2Dld;

    /**
     * 
     */
    private Integer djXy;

    /**
     * 
     */
    private Integer djFk;

    /**
     * 
     */
    private BigDecimal jaJd;

    /**
     * 
     */
    private BigDecimal jaKb;

    /**
     * 
     */
    private String pgh;

    /**
     * 
     */
    private BigDecimal jaZj;

    /**
     * 
     */
    private Integer bfcq;

    /**
     * 
     */
    private BigDecimal jaGzw;

    /**
     * 
     */
    private BigDecimal jaZx;

    /**
     * 
     */
    private Integer bWs;

    /**
     * 与预设街道不一致可录入
     */
    private String jdmc2;

    /**
     * 
     */
    private String gfhth;

    /**
     * 
     */
    private BigDecimal gfcsmj;

    /**
     * 
     */
    private String gzh;

    /**
     * 
     */
    private Integer lock;

    /**
     * 
     */
    private Integer xylock;

    /**
     * 
     */
    private String bdc;

    /**
     * 
     */
    private String fpMc;

    /**
     * 裁决指定h
     */
    private Integer cjH;

    /**
     * 
     */
    private String pgjg;

    /**
     * 
     */
    private String chjg;

    /**
     * 
     */
    private String kcjg;

    /**
     * 1住宅11非商12非工13非办
     */
    private Integer ff;

    /**
     * 共有产权证
     */
    private String cqz2;

    /**
     * 
     */
    private Date buytime;

    /**
     * 
     */
    private BigDecimal wyfDj;

    /**
     * 安置房装修0清水1简装
     */
    private Integer azfZx;

    /**
     * 咨询意见书
     */
    private String zxyjs;

    /**
     * 0 被征收房屋   1 房源
     */
    private Integer fy;

    /**
     * 
     */
    private String mdbh;

    /**
     * 
     */
    private Date gdfDbDay;

    /**
     * 0为未占用 1占用
     */
    private Integer occupide;

    /**
     * 延期到期时间
     */
    private Date delayTime;

    /**
     * 0未延期  1延期 
     */
    private Integer delayStatus;

    /**
     * 购买单价
     */
    private BigDecimal buyPrice;

    /**
     * 实测建筑面积
     */
    private BigDecimal measuredAreaJ;

    /**
     * 实测建筑面积
     */
    private BigDecimal measuredAreaT;

    /**
     * 
     */
    private Integer recoveryStatus;

    private static final long serialVersionUID = 1L;
}