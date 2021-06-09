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
 * 优惠卷可使用商品表
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_coupon_product")
public class CouponProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 优惠卷模板ID
     */
    @TableField("couponTemplateId")
    private Integer coupontemplateid;

    /**
     * 商品ID
     */
    @TableField("productId")
    private Integer productid;

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
