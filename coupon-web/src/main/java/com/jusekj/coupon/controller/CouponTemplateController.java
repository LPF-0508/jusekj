package com.jusekj.coupon.controller;


import com.jusekj.coupon.service.ICouponTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠卷模板表 前端控制器
 * </p>
 *
 * @author LPF
 * @since 2021-06-09
 */
@RestController
@RequestMapping("/template")
public class CouponTemplateController {
    @Autowired
    private ICouponTemplateService templateService;



}

