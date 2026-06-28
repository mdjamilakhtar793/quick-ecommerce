package com.jamildev.repository;

import com.jamildev.model.Cart;
import com.jamildev.model.CartItem;
import com.jamildev.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
