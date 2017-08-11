package cn.tarena.ht.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/toLogin.action")
	public String toLogin(){
		return "/sysadmin/login/login";
	
     }
	
	@RequestMapping("/login.action")
	public String login(String userName,String password,Model model,HttpSession httpSession){
		if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(password)){
			model.addAttribute("errorInfo", "用户名或密码不能为空");
			return "/sysadmin/login/login";
		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
		try{
			subject.login(token);
			User user = (User) subject.getPrincipal();
			httpSession.setAttribute("userSession", user);
			return "redirect:/home";
		}catch(AuthenticationException e){
			e.printStackTrace();
			model.addAttribute("errorInfo", "用户名和密码错误");
			return "/sysadmin/login/login";
		}
		
	}
	
	
	/*@RequestMapping("/login.action")
	public String login(String userName,String password,Model model,HttpSession httpSession){
		if(StringUtils.isEmpty(userName)||StringUtils.isEmpty(password)){
			model.addAttribute("errorInfo", "用户名或密码不能为空");
			return "/sysadmin/login/login";
		}
		
		password=Md5HashPassword.getMd5Hash(password, userName);
		User user = userService.findUserByUP(userName,password);
		if(user==null){
			model.addAttribute("errorInfo", "用户名和密码错误");
			return "/sysadmin/login/login";
		}
		httpSession.setAttribute("userSession", user);
		return "redirect:/home";
	}*/
	
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("userSession");
		return "/sysadmin/login/login";
	}

}