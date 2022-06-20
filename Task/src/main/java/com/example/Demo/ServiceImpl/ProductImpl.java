package com.example.Demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Product;
import com.example.Demo.Repository.ProductRepo;
import com.example.Demo.Service.ProductService;
@Service
public class ProductImpl implements ProductService{

	@Autowired
	private ProductRepo productRepo;
	@Override
	public void saveprod(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
	}

	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> showByidprod(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id);
	}

	@Override
	public Product updatep(int id,Product Product) {
		// TODO Auto-generated method stub
		Product.setIid(id);
		return productRepo.save(Product);
	}

}
