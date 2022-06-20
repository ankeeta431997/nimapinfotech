package com.example.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.Entity.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
