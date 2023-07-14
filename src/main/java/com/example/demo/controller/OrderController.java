package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

@Controller
@CrossOrigin
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/oders/{id}")
	public List<Order> getAllOrder(@PathVariable String id) {
		return orderService.getAllByUserid(Integer.valueOf(id));
	}
	
	@PostMapping("/oder") 
	public Order createOrder(@RequestBody Order order) {
		return orderService.create(order);
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable String id) { 
		orderService.delete(Integer.valueOf(id));
	}
}	
