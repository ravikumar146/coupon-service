package com.nextgen.couponservice.coupons.service.impl;

import com.nextgen.couponservice.coupons.dto.CouponResponse;
import com.nextgen.couponservice.coupons.entity.Coupon;
import com.nextgen.couponservice.coupons.repository.CouponRepository;
import com.nextgen.couponservice.coupons.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CouponServiceImpl is an implementation of the CouponService interface.
 * It provides the business logic for managing coupons in the e-commerce system.
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Override
    public Coupon createCoupon(Coupon coupon) {
       return couponRepository.save(coupon);
    }

    @Override
    public List<CouponResponse> getActiveCoupons() {
        return couponRepository.findByIsActiveTrue()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    private CouponResponse toResponse(Coupon coupon) {
        return CouponResponse.builder()
                .code(coupon.getCode())
                .title(coupon.getTitle())
                .description(coupon.getDescription())
                .type(coupon.getType().name().toLowerCase())
                .value(coupon.getValue())
                .minimumOrder(coupon.getMinimumOrder())
                .build();
    }
}
