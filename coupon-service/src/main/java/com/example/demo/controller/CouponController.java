package com.example.demo.controller;

import com.example.demo.model.Coupon;
import com.example.demo.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupons")
public class CouponController {

    private final CouponService couponService;

    @Autowired
    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }
    @GetMapping("/{couponCode}")
    public Coupon findCoupon(@PathVariable("couponCode") String couponCode) {
        return couponService.getCouponByCode(couponCode);
    }
}
