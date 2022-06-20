package com.example.Demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.Category;
import com.example.Demo.Repository.CategoryRepo;
import com.example.Demo.Service.CategoryService;

@Service
public class CategoryImpl implements CategoryService{

	@Autowired
	private CategoryRepo categoryRepo;
	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub
		categoryRepo.save(category);
	}

	@Override
	public List<Category> show() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public Optional<Category> showByid(int id) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(id);
	}

	@Override
	public Category update(int id,Category category) {
		
		category.setId(id);
		
		return categoryRepo.save(category);
	}

}
