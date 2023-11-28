package com.example.APIRest.mappers;

import com.example.APIRest.dtos.ProductDTO;
import com.example.APIRest.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper extends BaseMapperImp<Product, ProductDTO> implements BaseMapper<Product, ProductDTO> {

    @Override
    public ProductDTO entityToDTO(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }
}
