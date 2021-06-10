package com.jusekj.coupon.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jusekj.coupon.entity.CouponProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {
//    @Autowired
//    private ICouponProductService couponProductService;
//    @Autowired
//    private ICouponTemplateService templateService;


    @Test
    public void test(){
//        List<CouponProduct> couponProducts = couponProductService.listAll();
        System.out.println("couponProducts.size()");
    }
}
