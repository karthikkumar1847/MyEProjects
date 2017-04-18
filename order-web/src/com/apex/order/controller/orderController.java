package com.apex.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apex.order.bo.OrderBO;
import com.apex.order.vo.Order;

@Controller
@SessionAttributes
public class orderController {

	@Autowired
	private OrderBO orderBO = null;
		@RequestMapping(value="/orderEntry.do")
		public String displayOrder(@ModelAttribute("orderForm") Order order){
			
			return "orderpage";
		}
		@RequestMapping(value="/placeorder.do")
		public String processOrder(@ModelAttribute("orderForm") Order order){
			System.out.println("Starting of orderController: processOrder()");
			System.out.println(order.getCard());
			orderBO.placeOrder(order);
			System.out.println("completed of orderController: processOrder()");
			return "orderconfirmation";
		}
		public OrderBO getOrderBO() {
			return orderBO;
		}
		public void setOrderBO(OrderBO orderBO) {
			this.orderBO = orderBO;
		}
	

}
