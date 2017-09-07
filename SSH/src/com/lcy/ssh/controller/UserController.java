package com.lcy.ssh.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcy.ssh.pojo.User;
import com.lcy.ssh.service.UserService;

@Controller
public class UserController {
	@Resource(name="userService")  
    private UserService userService; 
	@RequestMapping("/addUser")
	@ResponseBody
	public void addUser() throws Exception {
		User user=new User();
		user.setName("梁城月");
		user.setAge(22);
		userService.addUser(user);
	}
	@RequestMapping("/getUsersJson")
	@ResponseBody
	public String getUsersJson() throws Exception {
		List<User> users=userService.getUsers();
		System.out.println();
		JSONArray jsonArray=JSONArray.fromObject(users);
		return jsonArray.toString();
	}
}
