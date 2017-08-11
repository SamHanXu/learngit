package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.tarena.ht.pojo.Module;
import cn.tarena.ht.pojo.Role;
import cn.tarena.ht.service.ModuleService;
import cn.tarena.ht.service.RoleService;

@Controller
@RequestMapping("/sysadmin/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	private ModuleService moduleService;
	@RequestMapping("/list")
	public String findAll(Model model){
		List<Role> roleList = roleService.findAll();
		model.addAttribute("roleList", roleList);
		return "sysadmin/role/jRoleList";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(){
		return "sysadmin/role/jRoleCreate";
		
	}
	
	@RequestMapping("/tosave")
	public String toSave(Role role){
		roleService.saveRole(role);
		return "redirect:/sysadmin/role/list";
	}
	@RequestMapping("roleModule")
	public String roleModule(String roleId,Model model) throws JsonProcessingException{
		model.addAttribute("roleId", roleId);
		List<String> rModuleList = roleService.findRoleModuleList(roleId);
		List<Module> moduleList = moduleService.findAll();
		for(Module module:moduleList){
			if(rModuleList.contains(module.getModuleId())){
				module.setChecked(true);
			}
		}
		ObjectMapper objectMapper = new ObjectMapper();
		String zTreeJSON = objectMapper.writeValueAsString(moduleList);
		model.addAttribute("zTreeJSON", zTreeJSON);
		return "/sysadmin/role/zRoleModule";
		
	}
	
	@RequestMapping("/saveRoleModule")
	public String saveRoleModule(String roleId,String[] moduleIds){
		roleService.savaRoleModule(roleId,moduleIds);
		return "redirect:/sysadmin/role/list";
		
	}
	
	@RequestMapping("/toview")
	public String toView(String roleId,Model model){
		Role role = roleService.findRoleById(roleId);
		model.addAttribute("role", role);
		return "/sysadmin/role/jRoleView";
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(String roleId,Model model){
		Role role = roleService.findRoleById(roleId);
		model.addAttribute("role", role);
		return "/sysadmin/role/jRoleUpdate";
	}
    
	@RequestMapping("/update")
	public String updateRole(Role role){
		roleService.updateRole(role);
		return "redirect:/sysadmin/role/list";
	}
	
	@RequestMapping("/delete")
	public String deleteRole(@RequestParam("roleId")String[] roleIds){
		roleService.deleteRole(roleIds);
		return "redirect:/sysadmin/role/list";
	}
}
