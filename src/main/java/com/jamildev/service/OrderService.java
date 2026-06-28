package com.jamildev.service;

import com.jamildev.domain.OrderStatus;
import com.jamildev.exception.OrderException;
import com.jamildev.model.Address;
import com.jamildev.model.Cart;
import com.jamildev.model.Order;
import com.jamildev.model.User;

import java.util.List;
import java.util.Set;

public interface OrderService {

    Set<Order> createOrder(User user, Address shippingAddress, Cart cart);

    Order findOrderById(Long orderId) throws OrderException;

    List<Order> usersOrderHistory(Long userId);

    List<Order> getShopsOrders(Long sellerId);

    Order updateOrderStatus(Long orderId,
                            OrderStatus orderStatus)
            throws OrderException;

    void deleteOrder(Long orderId) throws OrderException;

    Order cancelOrder(Long orderId, User user) throws OrderException;

}
