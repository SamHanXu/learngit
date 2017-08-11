package cn.tarena.ht.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.FoodMapper;
import cn.tarena.ht.mapper.FoodTypeMapper;
import cn.tarena.ht.pojo.Food;
import cn.tarena.ht.pojo.FoodType;

@Service
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodTypeMapper foodTypeMapper;
	
	@Autowired
	private FoodMapper foodMapper;

	@Override
	public List<Food> findAll() {
		return foodMapper.findAll();
	}

	@Override
	public Food findFoodById(String id) {
		return foodMapper.findFoodById(id);
	}

	@Override
	public void saveFood(Food food) {
		String id = UUID.randomUUID().toString();
		food.setId(id);
		foodMapper.saveFood(food);
		
	}

	@Override
	public void updateFood(Food food) {
		foodMapper.updateFood(food);
		
	}

	@Override
	public void deleteFoodById(String id) {
		foodMapper.deleteFoodById(id);
		
	}

	
	

}
