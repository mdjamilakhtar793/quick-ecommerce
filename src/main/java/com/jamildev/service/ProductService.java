package com.jamildev.service;

import com.jamildev.exception.ProductException;
import com.jamildev.model.Product;
import com.jamildev.model.Seller;
import com.jamildev.request.CreateProductRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    Product createProduct(CreateProductRequest req, Seller seller) throws ProductException;

    void deleteProduct(Long productId) throws ProductException;

    Product updateProduct(Long productId, Product product) throws ProductException;

    Product updateProductStock(Long productId) throws ProductException;


    Product findProductById(Long id) throws ProductException;


    List<Product> searchProduct(String query);

    Page<Product> getAllProduct(String category,
                                String brand,
                                String colors,
                                String sizes,
                                Integer minPrice,
                                Integer maxPrice,
                                Integer minDiscount,
                                String sort,
                                String stock,
                                Integer pageNumber);

    List<Product> recentlyAddedProduct();

    List<Product> getProductBySellerId(Long sellerId);
}
