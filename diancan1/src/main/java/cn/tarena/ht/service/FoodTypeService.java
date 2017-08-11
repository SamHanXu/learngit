package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.FoodType;

public interface FoodTypeService {
	public List<FoodType> findAll();

	public void saveFoodType(FoodType foodType);

	public FoodType findTypeById(String id);

	public void updateType(FoodType foodType);

	public void deleteType(String[] ids);

}
