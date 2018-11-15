package com.bits.service.db.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.db.model.UserScoreModel;
import com.bits.service.db.service.UserScoreService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserScoreController {
	
	
	@Autowired
	private UserScoreService userservie;
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/SaveUser")
	public void saveUser(@RequestBody UserScoreModel userModel){
		//predictRepository.save(predictModel);
		userservie.saveUserModel(userModel);
	  System.out.println("User Saved Successfully");
	 }
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/getUser/{userId}")
	 public Optional<UserScoreModel> getUser(@PathVariable Long userId) {
		Optional<UserScoreModel> userModel = userservie.getUserModel(userId);
		//List<PredictModel> employees = predictRepository.findAll();
	  System.out.println("User Get Call");
	  return userModel;
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/userResults")
	 public List<UserScoreModel> getUser() {
		List<UserScoreModel> userModel = userservie.retrieveUserModels();
		//List<PredictModel> employees = predictRepository.findAll();
	  System.out.println("User Get Call");
	  return userModel;
	 }
}



