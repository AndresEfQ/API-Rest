package com.example.APIRest.services;

import com.example.APIRest.dtos.ProductDTO;
import com.example.APIRest.entities.Product;
import com.example.APIRest.mappers.BaseMapperImp;
import com.example.APIRest.mappers.ProductMapper;
import com.example.APIRest.repositories.BaseRepository;
import com.example.APIRest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseServiceImpl<Product, ProductDTO, ProductMapper, Long> {

    public ProductService(BaseRepository<Product, Long> baseRepository, ProductMapper productMapper) {
        super(baseRepository);
        this.modelMapper = productMapper;
    }
}
