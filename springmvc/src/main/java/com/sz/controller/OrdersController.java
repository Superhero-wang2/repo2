package com.sz.controller;

import com.sz.pojo.Orders;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @RequestMapping("/good")
    public  String ordersGood(Model model){
        List<Orders> orders=new ArrayList<Orders>();
        Orders order=new Orders();
         order.setId(1);
         order.setName("heiehi");
         order.setYear("500");
        orders.add(order);

        model.addAttribute("orders",orders);
        return  "good";
    }

}
