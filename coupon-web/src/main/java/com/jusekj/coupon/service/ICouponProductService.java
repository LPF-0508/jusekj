package com.jusekj.coupon.service;

import com.jusekj.coupon.entity.CouponProduct;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 优惠卷可使用商品表 服务类
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
public interface ICouponProductService extends IService<CouponProduct> {

    List<CouponProduct> listAll();

}
