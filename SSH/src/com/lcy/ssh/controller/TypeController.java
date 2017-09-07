package com.lcy.ssh.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcy.ssh.pojo.Type;
import com.lcy.ssh.pojo.User;
import com.lcy.ssh.service.TypeService;
import com.lcy.ssh.service.UserService;

@Controller
public class TypeController {
	@Resource(name = "typeService")
	private TypeService typeService;
	@Resource(name="userService")  
    private UserService userService;
	@RequestMapping("/addType")
	@ResponseBody
	public void addType() throws Exception {
		Type type = new Type();
		type.setName("学生");
		User user=userService.findUserById("297e02335e416f9b015e4170e0130000");
		type.setUser(user);
		typeService.addType(type);
	}
	@RequestMapping("/getTypesJson")
	@ResponseBody
	public String getTypesJson() throws Exception {
		List<Type> list=typeService.getTypes();
		JSONArray jsonArray=JSONArray.fromObject(list);
		return jsonArray.toString();
	}
}
