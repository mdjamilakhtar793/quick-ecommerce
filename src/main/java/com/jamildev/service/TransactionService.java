package com.jamildev.service;

import com.jamildev.model.Order;
import com.jamildev.model.Seller;
import com.jamildev.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);

    List<Transaction> getTransactionBySeller(Seller seller);

    List<Transaction> getAllTransactions();
}
