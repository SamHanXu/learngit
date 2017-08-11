package cn.tarena.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.tarena.ht.pojo.Food;

public interface FoodMapper {

	/**
	 * 查询所有菜品
	 * @return
	 */
	public List<Food> findAll();

	/**
	 * 根据菜品id查看菜品
	 * @param id
	 * @return
	 */
	public Food findFoodById(String id);

	/**
	 * 保存新增菜品
	 */
	public void saveFood(Food food);

	/**
	 * 修改已有菜品
	 * @param food
	 */
	public void updateFood(Food food);

	/**
	 * 根据菜品id删除菜品
	 * @param id
	 */
	public void deleteFoodById(String id);
}
