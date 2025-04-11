package com.thetechieguy.ecommerce.payment;

import com.thetechieguy.ecommerce.customer.CustomerResponse;
import com.thetechieguy.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
