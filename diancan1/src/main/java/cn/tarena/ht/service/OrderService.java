package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Order;

public interface OrderService {
	
	public List<Order> findAll();

	public void saveOrder(Order order);

}
