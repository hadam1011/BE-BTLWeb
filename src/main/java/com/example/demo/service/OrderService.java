package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepo;
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Order> getAllByUserid(int id) {
		String sql = "select s from Order s where s.userid = :id";
		return entityManager.createQuery(sql, Order.class)
				.setParameter("id", id)
				.getResultList();
	}
	
	public Order create (Order order) {
		return orderRepo.save(order);
	}
	
	public void delete (int id) {
		orderRepo.deleteById(id);
	}
}
