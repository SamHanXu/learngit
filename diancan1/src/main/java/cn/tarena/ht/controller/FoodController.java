package cn.tarena.ht.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import cn.tarena.ht.pojo.Food;
import cn.tarena.ht.pojo.FoodType;
import cn.tarena.ht.service.FoodService;
import cn.tarena.ht.service.FoodTypeService;

@Controller
@RequestMapping("/foodmanager/food")
public class FoodController {
	
	@Autowired
	private FoodTypeService foodTypeService;

	@Autowired
	private FoodService foodService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<Food> foodList = foodService.findAll();
		model.addAttribute("foodList", foodList);
		return "/foodmanager/food/foodList";
	}
	
	@RequestMapping("/toview")
	public String toView(String id,Model model){
		Food food = foodService.findFoodById(id);
		model.addAttribute("food", food);
		return "/foodmanager/food/foodView";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(Model model){
		List<FoodType> fTypeList = foodTypeService.findAll();
		model.addAttribute("fTypeList", fTypeList);
		return "/foodmanager/food/foodCreate";
	}
	
	@RequestMapping("/tosave")
	public String toSave(Food food){
		foodService.saveFood(food);
		return "redirect:/foodmanager/food/List";
	}
	
	@RequestMapping("toupdate")
	public String toUpdate(String id,Model model){
		Food food = foodService.findFoodById(id);
		model.addAttribute("food", food);
		List<FoodType> fTypeList = foodTypeService.findAll();
		model.addAttribute("fTypeList", fTypeList);
		return "/foodmanager/food/foodUpdate";
	}
	
	@RequestMapping("update")
	public String update(Food food){
		foodService.updateFood(food);
		return "redirect:/foodmanager/food/list";
	}
	
	@RequestMapping("delete")
	public String delete(String id){
		foodService.deleteFoodById(id);
		return "redirect:/foodmanager/food/list";
	}

	
}
