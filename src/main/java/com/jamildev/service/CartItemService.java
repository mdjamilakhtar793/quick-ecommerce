package com.jamildev.service;

import com.jamildev.exception.CartItemException;
import com.jamildev.exception.UserException;
import com.jamildev.model.CartItem;


public interface CartItemService {

    CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

    void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;

    CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
