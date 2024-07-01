//package com.example.Amazon.Clone.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.Amazon.Clone.model.Order;
//import com.example.Amazon.Clone.repository.OrderRepository;
//
//@Service
//public class OrderService {
//
//	@Autowired
//    private OrderRepository orderRepository;
//
//    public Order placeOrder(Order order) {
//        return orderRepository.save(order);
//    }
//
//    public List<Order> getOrderHistory() {
//        return orderRepository.findAll();
//    }
//}
