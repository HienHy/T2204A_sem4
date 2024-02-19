package com.example.T2204A_sem4.api;


import com.example.T2204A_sem4.entity.Products;
import com.example.T2204A_sem4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductAPI {

@Autowired
private ProductService productService;


    @GetMapping("/")
    private List<Products> getAllBooks()
    {
        return productService.getAllProduct();
    }


}
