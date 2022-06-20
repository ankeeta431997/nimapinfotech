package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
