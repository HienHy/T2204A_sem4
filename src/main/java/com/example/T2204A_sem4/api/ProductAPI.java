package com.example.T2204A_sem4.api;


import com.example.T2204A_sem4.entity.Products;
import com.example.T2204A_sem4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

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

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/{id}")
    private Products getProduct(@PathVariable("id") Long id)
    {
        return productService.getProductById(id);
    }
    @DeleteMapping("{id}")
    private void deleteProduct(@PathVariable("id") Long id)
    {
        productService.delete(id);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/create")
    private Long saveBook(@RequestBody Products products)
    {
        productService.saveOrUpdate(products);
        return products.getId();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/update")
    private Products update(@RequestBody Products products)
    {
        productService.saveOrUpdate(products);
        return products;
    }



}
