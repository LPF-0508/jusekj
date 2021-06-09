package com.jusekj.coupon;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jusekj.coupon"})
public class CouponWebApplication{
    public static void main(String[] args) {
        SpringApplication.run(CouponWebApplication.class, args);
    }

}
