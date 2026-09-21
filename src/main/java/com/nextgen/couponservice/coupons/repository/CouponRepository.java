package com.nextgen.couponservice.coupons.repository;

import com.nextgen.couponservice.coupons.dto.CouponResponse;
import com.nextgen.couponservice.coupons.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository class for managing coupon data.
 */
@Repository
public interface CouponRepository  extends JpaRepository<Coupon, Long> {

    List<Coupon> findByIsActiveTrue();

}
