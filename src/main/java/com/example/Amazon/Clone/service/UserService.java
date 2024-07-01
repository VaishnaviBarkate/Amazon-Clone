package com.example.Amazon.Clone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Amazon.Clone.model.User;
import com.example.Amazon.Clone.repository.UserRepository;

@Service
public class UserService {

	    @Autowired
	    private UserRepository userRepository;

	    public User registerUser(User user) {
	        return userRepository.save(user);
	    }

	    public boolean loginUser(String email, String password) {
	     List<User> List = userRepository.findAll();
	     
	     boolean con = false;
	     
	     for (User userfromdb : List) {
			if(userfromdb.getEmail().equals(email)&& userfromdb.getPassword().equals(password)) {
				
				con=true;
				
			}
			
		}
		return con;
	   
	    
	}

}
