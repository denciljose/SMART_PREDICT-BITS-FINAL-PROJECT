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
import com.bits.service.db.model.UserPredictModel;
import com.bits.service.db.service.UserPredictService;
import com.bits.service.db.service.UserScoreService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {

	@Autowired
	 private UserPredictService userPredService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/SaveUserPrediction")
	 public void SavePrediction(@RequestBody UserPredictModel userPredictModel){		
		userPredService.saveUserPredictModel(userPredictModel);
	  System.out.println("User Prediction Saved Successfully");
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/userpredictListAll")
	 public List<UserPredictModel> GetUserPredictions() {
		List<UserPredictModel> userPredictModel = userPredService.retrieveUserPredictModels();
		System.out.println("User Prediction get call");
	  return userPredictModel;
	 }
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/userpredictList/{userId}")
	 public List<UserPredictModel> getUserPredictionsById(@PathVariable String userId) {
		List<UserPredictModel> userPredictModel = userPredService.getUserPredictModel(userId);
		System.out.println("User Prediction get call");
	  return userPredictModel;
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/userpredictList")
	 public void  UpdateUserPredictions(@RequestBody UserPredictModel userPredictModel) {
		userPredService.updateUserPredictModel(userPredictModel);
	  System.out.println("User Prediction Update Call");
	 }
	
}
