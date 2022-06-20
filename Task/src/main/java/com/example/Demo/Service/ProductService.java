package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;


import com.example.Demo.Entity.Product;

public interface ProductService {

	
	public void saveprod(Product product);
	public List<Product> showProduct();
	public Optional<Product> showByidprod(int id);
	public Product updatep(int id,Product Product);
}
