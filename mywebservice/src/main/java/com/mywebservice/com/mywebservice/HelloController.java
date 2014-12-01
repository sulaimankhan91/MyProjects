package com.mywebservice.com.mywebservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.mywebservice.com.model.UserModel;

@RestController
@RequestMapping("/services/users/")
public class HelloController {


	@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	public List<UserModel> getHello(){
		List<UserModel> list = getusers();
		return list;
	}
	
	@RequestMapping(value = "/{id}" , method=RequestMethod.GET, headers="Accept=application/json")
	public UserModel getUserHello(@PathVariable String id){
		List<UserModel> list = getusers();
	for(UserModel um : list){
		if(um.getId().equals(id)){
			return um;
		}
	}
		
		return null;
	}
	
	List<UserModel> getusers(){
		List<UserModel> list = new ArrayList<UserModel>();
		UserModel um = new UserModel("Sulaiman", "1");
		UserModel um2 = new UserModel("Zubair", "2");
		UserModel um3 = new UserModel("Hannan", "3");
		list.add(um);
		list.add(um2);
		list.add(um3);
		return list;
	}
	
}
