package com.nextgen.couponservice.coupons.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouponResponse {

    private String code;
    private String title;
    private String description;
    private String type;
    private Double value;
    private Double minimumOrder;
}
