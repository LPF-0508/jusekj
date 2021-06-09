package com.jusekj.coupon.controller;


import com.jusekj.coupon.entity.CouponProduct;
import com.jusekj.coupon.entity.CouponTemplate;
import com.jusekj.coupon.service.ICouponProductService;
import com.jusekj.coupon.service.ICouponTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 优惠卷可使用商品表 前端控制器
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
@RestController
@RequestMapping("/product")
public class CouponProductController {
    @Autowired
    private ICouponProductService couponProductService;

    @Autowired
    private ICouponTemplateService templateService;

    @GetMapping("/list")
    public Object test(){
        List<CouponProduct> couponProducts = couponProductService.listAll();
        List<CouponTemplate> couponTemplates = templateService.listAll();
        System.out.println(couponProducts);
        System.out.println(couponTemplates);
        return couponProducts;
    }
}

