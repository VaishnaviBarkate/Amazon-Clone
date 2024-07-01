//package com.example.Amazon.Clone.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.Amazon.Clone.model.Order;
//import com.example.Amazon.Clone.service.OrderService;
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrderController {
//
//	@Autowired
//    private OrderService orderService;
//
//    @PostMapping
//    public Order placeOrder(@RequestBody Order order) {
//        return orderService.placeOrder(order);
//    }
//
//    @GetMapping
//    public List<Order> getOrderHistory() {
//        return orderService.getOrderHistory();
//    }
//}
