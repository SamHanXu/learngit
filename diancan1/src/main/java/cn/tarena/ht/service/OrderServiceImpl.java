package cn.tarena.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.OrderMapper;
import cn.tarena.ht.pojo.Order;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
 
	@Override
	public List<Order> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public void saveOrder(Order order) {
		order.setState("1");
		orderMapper.saveOrder(order);
		
	}

}
