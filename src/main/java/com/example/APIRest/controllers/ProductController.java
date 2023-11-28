package com.example.APIRest.controllers;

import com.example.APIRest.dtos.ProductDTO;
import com.example.APIRest.entities.Product;
import com.example.APIRest.mappers.ProductMapper;
import com.example.APIRest.services.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/products")
public class ProductController extends BaseControllerImpl<Product, ProductDTO, ProductMapper, ProductService> {
}
