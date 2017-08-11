package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tarena.ht.pojo.Order;
import cn.tarena.ht.pojo.Table;
import cn.tarena.ht.service.OrderService;
import cn.tarena.ht.service.TableService;

@Controller
@RequestMapping("/foodmanager/order")
public class OrderController extends BaseController{
	@Autowired
	private OrderService orderService;
	@Autowired
	private TableService tableService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<Order> orderList = orderService.findAll();
		model.addAttribute("orderList", orderList);
		return "foodmanager/order/orderList";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(Model model){
		List<Table> tableList = tableService.findAll();
		model.addAttribute("tableList", tableList);
		return "foodmanager/order/orderCreate";
	}
	
	@RequestMapping("/tosave")
	public String toSave(Order order){
		orderService.saveOrder(order);
		return "redirect:/foodmanager/order/list";
	}

}
