package com.jusekj.coupon.service;

import com.jusekj.coupon.entity.CouponProduct;
import com.jusekj.coupon.service.ICouponProductService;
import com.jusekj.coupon.service.ICouponTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {
    @Resource
    private ICouponProductService couponProductService;
    @Resource
    private ICouponTemplateService templateService;


    @Test
    public void test(){
        List<CouponProduct> couponProducts = couponProductService.listAll();
        System.out.println(couponProducts.size());
    }
}
