package com.yusufEcommerce.ecommerce.dto;

import com.yusufEcommerce.ecommerce.entity.Address;
import com.yusufEcommerce.ecommerce.entity.Customer;
import com.yusufEcommerce.ecommerce.entity.Order;
import com.yusufEcommerce.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
