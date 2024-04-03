package com.yusufEcommerce.ecommerce.dao;

import com.yusufEcommerce.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    // select * from customer c where c.email = theEmail
    Customer findByEmail(String theEmail);
}
