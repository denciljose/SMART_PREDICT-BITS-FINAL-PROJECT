package com.bits.service.db.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.model.UserModel;
import com.bits.service.db.model.UserScoreModel;
import com.bits.service.db.service.LoginService;
import com.bits.service.db.service.UserScoreService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/registration")
	public void saveUser(@RequestBody UserModel userModel){
		//predictRepository.save(predictModel);
		loginService.saveUser(userModel);
	  System.out.println("User Saved Successfully");
	 }

	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/login")
	 public Optional<UserModel>  getUser(@RequestBody UserModel userModel) {
		  System.out.println("Get User Being Invoked"+userModel.getUserName());
		return loginService.getUser(userModel.getUserName());
	
	 }

}
