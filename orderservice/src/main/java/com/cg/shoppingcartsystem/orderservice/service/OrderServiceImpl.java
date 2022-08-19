package com.cg.shoppingcartsystem.orderservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.shoppingcartsystem.orderservice.entities.Orders;
import com.cg.shoppingcartsystem.orderservice.repositories.OrderRepository;

public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository ordersrepo;
	private Object orderid;
	public int addOrders(Orders orders) {
		
		Orders orders1 = new Orders();
		orders1.setOrderStatus(orders1.getOrderStatus());
		orders1.setOrderDate(orders1.getOrderDate());
		orders1.setAmmountPaid(orders1.getAmmountPaid());
		orders1.setModeOfPayment(orders1.getModeOfPayment());
		orders1.setQuantity(orders1.getQuantity());
		orders1.setCustemerId(orders1.getCustemerId());
		//orders.setCustomer(customer);
		//ordersrepo.save(orders);
		return orders1.getOrderid();
	}

	public List<Orders> viewAllOrders() {
		List<Orders> orderslist= ordersrepo.findAll();
		ArrayList<Orders> orderslist1 =new ArrayList<Orders>();
		for(Orders orders : orderslist1) {
			Orders orders1 = new Orders();
			orders1.setOrderStatus(orders1.getOrderStatus());
			orders1.setOrderDate(orders1.getOrderDate());
			orders1.setAmmountPaid(orders1.getAmmountPaid());
			orders1.setModeOfPayment(orders1.getModeOfPayment());
			orders1.setQuantity(orders1.getQuantity());
			orders1.setCustemerId(orders1.getCustemerId());
		}
			return orderslist1;
	}

	public Orders getOrdersById(int order_id)  {
	Orders orders = ordersrepo.getOrdersByOrderid(orderid);
	if(orders == null)
		throw new OrderNotFoundException();
	Orders orders1 = new Orders();
	orders.setOrderStatus(orders1.getOrderStatus());
	orders.setOrderDate(orders1.getOrderDate());
	orders1.setAmmountPaid(orders1.getAmmountPaid());
	
	orders.setCustemerId(orders1.getCustemerId());
	
	return orders;
}
	
	

@Override
	public void deleteOrders(int orderid) {
		ordersrepo.deleteById(orderid);
	}

}
