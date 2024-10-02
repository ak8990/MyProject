package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Orders;
import com.example.demo.repository.orderRepo;

@RestController
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	orderRepo orderRepo;
	
		
	@PostMapping("conformOrder")
	public Orders addStudent(@RequestBody Orders order)
	{
		Orders p=new Orders();
		p.setOname(order.getOname());
		p.setAddon(order.getAddon());
		p.setTopping(order.getTopping());
		p.setType(order.getType());
		p.setSize(order.getSize());
		p.setOprice(order.getOprice());
					
		orderRepo.save(p);
		return p;
	}

	

}
