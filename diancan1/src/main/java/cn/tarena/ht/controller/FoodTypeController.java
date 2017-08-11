package cn.tarena.ht.controller;

import java.util.List;

import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tarena.ht.pojo.FoodType;
import cn.tarena.ht.service.FoodTypeService;

@Controller
@RequestMapping("/foodmanager/type")
public class FoodTypeController {
	@Autowired
	private FoodTypeService typeService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<FoodType> typeList = typeService.findAll();
		model.addAttribute("typeList", typeList);
		return "foodmanager/type/foodTypeList";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(){
		return "foodmanager/type/foodTypeCreate";
	}
	
	@RequestMapping("/tosave")
	public String toSave(FoodType foodType){
		typeService.saveFoodType(foodType);
		return "redirect:/foodmanager/type/list";
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(String id,Model model){
		FoodType foodType = typeService.findTypeById(id);
		model.addAttribute("foodType", foodType);
		return "foodmanager/type/foodTypeUpdate";
	}
	
	@RequestMapping("/update")
	public String updateType(FoodType foodType){
		typeService.updateType(foodType);
		return "redirect:/foodmanager/type/list";
	}
	
	@RequestMapping("/delete")
	public String deleteType(@RequestParam(value="id", required=true)String[] ids){
		typeService.deleteType(ids);
		return "redirect:/foodmanager/type/list";
	}
	
	@RequestMapping("/toview")
	public String toView(String id,Model model){
		FoodType foodType = typeService.findTypeById(id);
		model.addAttribute("foodType", foodType);
		return "foodmanager/type/foodTypeView";
	}

}
