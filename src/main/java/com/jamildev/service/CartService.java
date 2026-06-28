package com.jamildev.service;

import com.jamildev.exception.ProductException;
import com.jamildev.model.Cart;
import com.jamildev.model.CartItem;
import com.jamildev.model.Product;
import com.jamildev.model.User;

public interface CartService {

    CartItem addCartItem(User user,
                         Product product,
                         String size,
                         int quantity) throws ProductException;

    Cart findUserCart(User user);

}
