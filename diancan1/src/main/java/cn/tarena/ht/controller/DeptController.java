package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tarena.ht.pojo.Dept;
import cn.tarena.ht.service.DeptService;

@Controller
@RequestMapping("/sysadmin/dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<Dept> deptList = deptService.findAll();
		model.addAttribute("deptList", deptList);
		return "sysadmin/dept/jDeptList";
	}
	
	@RequestMapping("/delete")
	public String toDelete(String[] deptId){
		deptService.deleteDepts(deptId);
		return "redirect:/sysadmin/dept/list";
	}
	
	@RequestMapping("/start")
	public String toStart(String[] deptId){
		int state = 1;
		deptService.updateState(deptId,state);
		return "redirect:/sysadmin/dept/list";
	}
	
	@RequestMapping("/stop")
	public String toStop(String[] deptId){
		int state = 0;
		deptService.updateState(deptId,state);
		return "redirect:/sysadmin/dept/list";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(Model model){
		List<Dept> parentList = deptService.findParentList();
		model.addAttribute("parentList", parentList);
		return "sysadmin/dept/jDeptCreate";
	}
    
	@RequestMapping("/tosave")
	public String saveDept(Dept dept){
		deptService.saveDept(dept);
		return "redirect:/sysadmin/dept/list";
	}
	
	@RequestMapping("/toview")
	public String toView(String deptId,Model model){
	   Dept dept = deptService.findDeptById(deptId);
	   model.addAttribute("dept", dept);
	   return "sysadmin/dept/jDeptView";
	}
	
	@RequestMapping("toupdate")
	public String toUpdate(String deptId,Model model){
		List<Dept> parentList = deptService.findParentListById(deptId);
		model.addAttribute("parentList", parentList);
		Dept dept = deptService.findDeptById(deptId);
		model.addAttribute("dept", dept);
		return "sysadmin/dept/jDeptUpdate";
	}
	
	@RequestMapping("/update")
	public String updateDept(Dept dept){
		deptService.updateDept(dept);
		return "redirect:/sysadmin/dept/list";
	}
}
