package com.example.APIRest.services;

import com.example.APIRest.entities.Product;
import com.example.APIRest.repositories.BaseRepository;
import com.example.APIRest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository) {
        super(baseRepository);
    }
}
