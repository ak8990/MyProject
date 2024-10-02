package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Products;
import com.example.demo.repository.productRepo;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	productRepo productRepo;
	
		
	@GetMapping("getProduct")
	public List<Products> get()
	{
		return productRepo.findAll();
	}
		
	
}
