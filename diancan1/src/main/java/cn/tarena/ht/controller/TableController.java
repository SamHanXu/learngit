package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tarena.ht.pojo.Table;
import cn.tarena.ht.service.TableService;

@Controller
@RequestMapping("/foodmanager/table")
public class TableController {
	@Autowired
	private TableService tableService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<Table> tableList = tableService.findAll();
		model.addAttribute("tableList", tableList);
		return "foodmanager/table/tableList";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(){
		return "foodmanager/table/tableCreate";
	}
	
	@RequestMapping("/tosave")
	public String toSave(Table table){
		tableService.saveTable(table);
		return "redirect:/foodmanager/table/list";
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(String id,Model model){
		Table table = tableService.findTableById(id);
		model.addAttribute("table", table);
		return "foodmanager/table/tableUpdate";
	}
	
	@RequestMapping("/update")
	public String updateTable(Table table){
		tableService.updateTable(table);
		return "redirect:/foodmanager/table/list";
	}
	
	@RequestMapping("/delete")
	public String deleteTable(@RequestParam(value="id",required=true)String[] ids){
		tableService.deleteTable(ids);
		return "redirect:/foodmanager/table/list";
	}
	
	@RequestMapping("/toview")
	public String toView(String id,Model model){
		Table table = tableService.findTableById(id);
		model.addAttribute("table", table);
		return "/foodmanager/table/tableView";
	}

}
