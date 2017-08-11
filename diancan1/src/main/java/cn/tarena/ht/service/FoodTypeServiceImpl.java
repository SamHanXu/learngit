package cn.tarena.ht.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.FoodTypeMapper;
import cn.tarena.ht.pojo.FoodType;

@Service
public class FoodTypeServiceImpl implements FoodTypeService{
	@Autowired
	private FoodTypeMapper typeMapper;

	@Override
	public List<FoodType> findAll() {
		return typeMapper.findAll();
	}

	@Override
	public void saveFoodType(FoodType foodType) {
		String id = UUID.randomUUID().toString();
		foodType.setId(id);
		typeMapper.saveFoodType(foodType);
		
	}

	@Override
	public FoodType findTypeById(String id) {
		return typeMapper.findTypeById(id);
	}

	@Override
	public void updateType(FoodType foodType) {
		typeMapper.updateType(foodType);
		
	}

	@Override
	public void deleteType(String[] ids) {
		typeMapper.deleteType(ids);
		
	}
	
	

}
