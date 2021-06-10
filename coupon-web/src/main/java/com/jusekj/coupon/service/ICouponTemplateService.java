package com.jusekj.coupon.service;

import com.jusekj.coupon.entity.CouponProduct;
import com.jusekj.coupon.entity.CouponTemplate;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 优惠卷模板表 服务类
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
public interface ICouponTemplateService extends IService<CouponTemplate> {
    List<CouponTemplate> listAll();



}
