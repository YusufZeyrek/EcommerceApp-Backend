package com.yusufEcommerce.ecommerce.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.yusufEcommerce.ecommerce.dto.PaymentInfo;
import com.yusufEcommerce.ecommerce.dto.Purchase;
import com.yusufEcommerce.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentInfo(PaymentInfo paymentInfo) throws StripeException;



}
