package com.nextgen.couponservice.coupons.controller;

import com.nextgen.couponservice.coupons.dto.CouponResponse;
import com.nextgen.couponservice.coupons.entity.Coupon;
import com.nextgen.couponservice.coupons.service.CouponService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CouponController is responsible for handling HTTP requests related to coupons.
 * It provides endpoints for creating, retrieving, updating, and deleting coupons.
 */
@Tag(name = "Coupons", description = "APIs for managing coupons")
@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @Operation(summary = "Create a new coupon")
    @PostMapping("/create")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }

    @Operation(summary = "Get all active coupons")
    @GetMapping("/list")
    public List<CouponResponse> getActiveCoupons() {
        return couponService.getActiveCoupons();
    }
}
