package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.tarena.ht.pojo.Dept;
import cn.tarena.ht.pojo.Role;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.service.DeptService;
import cn.tarena.ht.service.RoleService;
import cn.tarena.ht.service.UserInfoService;
import cn.tarena.ht.service.UserService;

@Controller
@RequestMapping("/sysadmin/user")
public class UserController extends BaseController{
	@Autowired
	private DeptService deptService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
		return "/sysadmin/user/jUserList";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam(value="userId",required=true)String[] userIds){
		userService.deleteUsers(userIds);
		return "redirect:/sysadmin/user/list";
	}
    
	@RequestMapping("/start")
	public String toStart(@RequestParam(value="userId",required=true)String[] userIds){
		int state = 1;
		userService.updateState(userIds,state);
		return "redirect:/sysadmin/user/list";
	}
	
	@RequestMapping("/stop")
	public String toStop(@RequestParam(value="userId",required=true)String[] userIds){
		int state = 0;
		userService.updateState(userIds,state);
		return "redirect:/sysadmin/user/list";
	}
	
	@RequestMapping("/tocreate")
	public String toCreate(Model model){
        List<Dept> deptList = deptService.findParentList();
        List<UserInfo> managerList = userInfoService.findManagerList();
        model.addAttribute("deptList",deptList);
        model.addAttribute("managerList", managerList);
		return "/sysadmin/user/jUserCreate";
	}
	
	@RequestMapping("/tosave")
	public String saveUser(User user){
		userService.saveUser(user);
		return "redirect:/sysadmin/user/list";
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(String userId,Model model){
		User user = userService.findUserById(userId);
		List<Dept> deptList = deptService.findParentList();
		List<UserInfo> managerList = userInfoService.findManagerList();
		model.addAttribute("user", user);
		model.addAttribute("deptList", deptList);
		model.addAttribute("managerList", managerList);
		return "/sysadmin/user/jUserUpdate";
	}
	@RequestMapping("/update")
	public String updateUser(User user){
		userService.updateUser(user);
		return "redirect:/sysadmin/user/list";
	}
	@RequestMapping("/torole")
	public String toRole(String userId,Model model) throws JsonProcessingException{
		List<String> uRoleIdList = roleService.findRoleIdByUserId(userId);
		List<Role> roleList = roleService.findAll();
		for(Role role:roleList){
			if(uRoleIdList.contains(role.getRoleId())){
				role.setChecked(true);
			}
		}
		ObjectMapper objectMapper = new ObjectMapper();
		String zTreeJSON = objectMapper.writeValueAsString(roleList);
//		System.out.println(zTreeJSON);
		model.addAttribute("zTreeJSON", zTreeJSON);
		model.addAttribute("userId", userId);
		return "/sysadmin/user/zUserRole";
		
	}
	@RequestMapping("/saveUserRole")
	public String saveUserRole(String userId,String[] roleIds){
		userService.deleteUserRoleById(userId);
		userService.saveUserRole(userId,roleIds);
		return "redirect:/sysadmin/user/list";
	}
	@RequestMapping("/toview")
	public String toView(String userId,Model model){
		User user = userService.findUserById(userId);
		model.addAttribute("user", user);
		return "sysadmin/user/jUserView";
	}
}
