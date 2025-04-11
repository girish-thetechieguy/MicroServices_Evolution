package com.thetechieguy.ecommerce.kafka;

import com.thetechieguy.ecommerce.customer.CustomerResponse;
import com.thetechieguy.ecommerce.order.PaymentMethod;
import com.thetechieguy.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
