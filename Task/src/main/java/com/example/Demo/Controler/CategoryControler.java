package com.example.Demo.Controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.Entity.Category;
import com.example.Demo.ServiceImpl.CategoryImpl;

@RestController
public class CategoryControler {

	@Autowired
	private CategoryImpl categoryImpl;
	
	@PostMapping("/save")
	public void add(@RequestBody Category category)
	{
		categoryImpl.save(category);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Category> findbyid(@PathVariable int id)
	{
		return categoryImpl.showByid(id);
	}
	@GetMapping("/get")
	public List<Category> print()
	{
		return categoryImpl.show();
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id)
	{
		categoryImpl.delete(id);
	}
	@PutMapping("/put/{id}")
	public Category up(@PathVariable int id,@RequestBody Category category)
	{
		return categoryImpl.update(id, category);
	}
}
