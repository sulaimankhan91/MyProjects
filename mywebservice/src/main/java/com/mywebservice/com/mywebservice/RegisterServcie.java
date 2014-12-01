package com.mywebservice.com.mywebservice;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mywebservice.com.request.Request;
import com.mywebservice.com.response.Response;

@Controller
@RequestMapping("/services/register")
public class RegisterServcie {

	@RequestMapping(value="/newUser" , method = RequestMethod.POST)
	public @ResponseBody Response registerNewUser(@RequestBody Request request){
		Response response = new Response();
		response.setBody("body");
		response.setId("1");
		response.setName("name");
		return  response;
	}
	
}
