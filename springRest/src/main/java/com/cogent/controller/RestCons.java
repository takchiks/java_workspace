package com.cogent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestCons {
	@RequestMapping("/hey")
	@ResponseBody
	public int[] getMe(@RequestParam(name="user",required = false) String name) {
		int arr[] = {1,2,3,4};
		return arr;
	}

	@RequestMapping("/greet")
	@ResponseBody
	public String msgType(@RequestParam(name="msgType",required = false) String msgType) {
		String msg="";
		if(msgType!=null && msgType.trim().equalsIgnoreCase("morning")) {
			msg="Hello! Good morning";
		}else if(msgType!=null && msgType.trim().equalsIgnoreCase("Evening"))  {
			msg="hi! Good evening";
		}else {
			msg = "How are you?";
		}
		return msg;
	}
	@RequestMapping(path="/post", method = RequestMethod.POST)
	@ResponseBody
	private String postas(@RequestParam(name = "user", required = false) String username) {
		
		return "Username: " +username;
		
	}
	@RequestMapping(path="/post", method = RequestMethod.GET)
	@ResponseBody
	private String getas(@RequestParam(name = "user", required = false) String username) {
		
		return "Username: " +username;
		
	}

}
