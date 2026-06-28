package com.jamildev.service;


import com.jamildev.exception.WishlistNotFoundException;
import com.jamildev.model.Product;
import com.jamildev.model.User;
import com.jamildev.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

