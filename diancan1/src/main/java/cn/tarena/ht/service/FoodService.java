package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Food;
import cn.tarena.ht.pojo.FoodType;

public interface FoodService {
	
    //查找所有菜品
	public List<Food> findAll();

	//根据id查找菜品
	public Food findFoodById(String id);

	//保存新增菜品
	public void saveFood(Food food);

	//修改已有菜品
	public void updateFood(Food food);

	//根据id删除菜品
	
	public void deleteFoodById(String id);


}
