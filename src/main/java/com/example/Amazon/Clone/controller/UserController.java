package com.example.Amazon.Clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.Amazon.Clone.model.User;
import com.example.Amazon.Clone.service.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {

	@Autowired
    private UserService userService;
	@RequestMapping("/web")
    public String WePage() {
    	return "Web";
    }
	
	 @RequestMapping("/loginpage")
	    public String LoginPage() {
	    	return "loginPage";
	    }
	

    @RequestMapping("/register")
    public String registerPage() {
    	
    	
        return "register";
    }

    @RequestMapping("/registers")
    public String registerUser(User user) {
    	System.out.println(user);
    	User registerUser = userService.registerUser(user);
    	if(registerUser==null) {
    		return "register";
    		
    	}
    	
        return "loginPage";
    }

    @RequestMapping("/login")
    public String loginUser(User user) {
    	
    	
    	boolean loginUser = userService.loginUser(user.getEmail(), user.getPassword());
    	
    	System.out.println(loginUser);
    	if(loginUser) {
    		 return "Web";
    	}
		return "loginPage";
    	
       
    }
}
