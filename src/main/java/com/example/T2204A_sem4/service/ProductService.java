package com.example.T2204A_sem4.service;

import com.example.T2204A_sem4.entity.Products;
import com.example.T2204A_sem4.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class ProductService {


    @Autowired
    ProductRepo productRepo;
    //getting all books record by using the method findaAll() of CrudRepository
    public List<Products> getAllProduct()
    {
        List<Products> products = new ArrayList<Products>();
        productRepo.findAll().forEach(books1 -> products.add(books1));
        return products;
    }


    public Products getProductById(Long id)
    {
        return productRepo.findById(id).get();
    }

    public void saveOrUpdate(Products products)
    {
        productRepo.save(products);
    }
    public void delete(Long id)
    {
        productRepo.deleteById(id);
    }
    public void update(Products products, Long id)
    {
        productRepo.save(products);
    }
}
