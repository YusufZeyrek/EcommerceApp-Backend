package com.yusufEcommerce.ecommerce.dao;

import com.yusufEcommerce.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
    //New query method findBy it is query method parameter is id the field is CategoryId
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
    
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);

}
