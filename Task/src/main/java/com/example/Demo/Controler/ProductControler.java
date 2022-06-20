package com.example.Demo.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Product;
import com.example.Demo.ServiceImpl.ProductImpl;

@RestController
public class ProductControler {

	@Autowired
	private ProductImpl productImpl;
	
	@PostMapping("/saved")
	public void savedata(@RequestBody Product product)
	{
		productImpl.saveprod(product);
	}
	@GetMapping("/display")
	public List<Product> shoeall()
	{
		return productImpl.showProduct();
	}
	@GetMapping("/display/{id}")
	public Optional<Product> findid(@PathVariable int id)
	{
		return productImpl.showByidprod(id);
	}
	@PutMapping("/update")
	public Product upa(@PathVariable int id,@RequestBody Product product )
	{
		return productImpl.updatep(id, product);
	}
}
