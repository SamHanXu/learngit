package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.Order;

public interface OrderMapper {
	
	public List<Order> findAll();

	public void saveOrder(Order order);

}
