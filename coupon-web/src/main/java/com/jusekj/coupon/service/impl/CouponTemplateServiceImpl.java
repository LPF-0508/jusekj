package com.jusekj.coupon.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jusekj.coupon.entity.CouponTemplate;
import com.jusekj.coupon.mapper.CouponTemplateMapper;
import com.jusekj.coupon.service.ICouponTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 优惠卷模板表 服务实现类
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
@Service
public class CouponTemplateServiceImpl extends ServiceImpl<CouponTemplateMapper, CouponTemplate> implements ICouponTemplateService {
    @Override
    @DS("test02")
    public List<CouponTemplate> listAll() {
        return this.list();
    }
}
