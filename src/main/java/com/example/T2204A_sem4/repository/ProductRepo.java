package com.example.T2204A_sem4.repository;

import com.example.T2204A_sem4.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepo extends CrudRepository<Products,Long> {


}
