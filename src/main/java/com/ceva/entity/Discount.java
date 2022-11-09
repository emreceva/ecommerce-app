package com.ceva.entity;

import com.ceva.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Discount extends BaseEntity {

    private BigDecimal discount;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private DiscountType discountType;
}
