package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.Demo.Entity.Category;

public interface CategoryService {

	public void save(Category category);
	public List<Category> show();
	public Optional<Category> showByid(int id);
	public void delete(int id);
	public Category update(int id,Category category);
}
