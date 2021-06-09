package com.jusekj.coupon.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jusekj.coupon.entity.CouponProduct;
import com.jusekj.coupon.mapper.CouponProductMapper;
import com.jusekj.coupon.service.ICouponProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 优惠卷可使用商品表 服务实现类
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
@Service
public class CouponProductServiceImpl extends ServiceImpl<CouponProductMapper, CouponProduct> implements ICouponProductService {
    @Override
    @DS("test01")
    public List<CouponProduct> listAll() {
        return this.list();
    }
}
