package com.jusekj.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠卷模板表
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_coupon_template")
public class CouponTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 优惠卷code
     */
    @TableField("couponCode")
    private String couponcode;

    /**
     * 优惠卷名称
     */
    @TableField("couponName")
    private String couponname;

    /**
     * 优惠卷标题
     */
    @TableField("couponTitle")
    private String coupontitle;

    /**
     * 优惠卷类型  0：满减卷 1：折扣卷
     */
    @TableField("couponType")
    private Integer coupontype;

    /**
     * 折扣率
     */
    private String discount;

    /**
     * 满减金额
     */
    @TableField("fullAmount")
    private Integer fullamount;

    /**
     * 优惠金额
     */
    @TableField("lessAmount")
    private Integer lessamount;

    /**
     * 可使用平台
     */
    private Integer platform;

    /**
     * 活动开始时间
     */
    @TableField("activityStartTime")
    private LocalDateTime activitystarttime;

    /**
     * 活动结束时间
     */
    @TableField("activityEndTime")
    private LocalDateTime activityendtime;

    /**
     * 优惠卷发放总量
     */
    @TableField("totalCoupon")
    private Integer totalcoupon;

    /**
     * 发放规则  0：启用即可发放  1：指定时间发放
     */
    @TableField("sendType")
    private Integer sendtype;

    /**
     * 发放时间
     */
    @TableField("sendTime")
    private LocalDateTime sendtime;

    /**
     * 有效期开始时间
     */
    @TableField("validityStartTime")
    private LocalDateTime validitystarttime;

    /**
     * 有效期结束时间
     */
    @TableField("validityEndTime")
    private LocalDateTime validityendtime;

    /**
     * 是否参与其他优惠活动  0：不参加   1：参加
     */
    @TableField("otherActivitiesFlag")
    private Integer otheractivitiesflag;

    /**
     * 优惠卷模板状态  0：停用  1：启用
     */
    @TableField("templateStatus")
    private Integer templatestatus;

    /**
     * 跳转页面
     */
    @TableField("linkUrlId")
    private String linkurlid;

    /**
     * 优惠卷领取地址
     */
    @TableField("discountUrl")
    private String discounturl;

    /**
     * 可使用用户类型  1：全平台  2：新用户 3：老用户
     */
    @TableField("userType")
    private Integer usertype;

    /**
     * 创建人ID
     */
    @TableField("createUserId")
    private Integer createuserid;

    /**
     * 创建人名称
     */
    @TableField("createUserName")
    private String createusername;

    /**
     * 创建时间
     */
    @TableField("createdAt")
    private LocalDateTime createdat;

    /**
     * 修改时间
     */
    @TableField("updatedAt")
    private LocalDateTime updatedat;


}
