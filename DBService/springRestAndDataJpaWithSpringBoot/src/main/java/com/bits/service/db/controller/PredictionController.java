package com.bits.service.db.controller;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.repo.PredictRepository;
import com.bits.service.db.service.PredictService;


@RestController

public class PredictionController {

	 @Autowired
	 private PredictService predictservice;
	 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/SavePredict" )
	 public void savePredict(@RequestBody PredictModel predictModel){
		//predictRepository.save(predictModel);
		System.out.println("PredictModel Inserting"+predictModel.getTeam1());
		System.out.println("PredictModel Inserting"+predictModel.getTeam2());
		System.out.println("PredictModel Inserting"+predictModel.getDate());
	//System.out.println("PredictModel"+predictModel.getTeam1());
		predictservice.savePredictModel(predictModel);
		
	  System.out.println("Employee Saved Successfully");
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/predictList")
	 public List<PredictModel> getPredict() {
		List<PredictModel> predicts = predictservice.retrievePredictModels();
		//List<PredictModel> employees = predictRepository.findAll();
	  System.out.println("Employee Get Call");
	  return predicts;
	 }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/predictListBydate")
	 public List<PredictModel> getPredictbyDate() {
		//List<PredictModel> predicts = predictservice.retrievePredictModels();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		System.out.println( "Sample Date"+dtf.format(localDate));
		List<PredictModel> predicts = predictservice.getPredictByDate(dtf.format(localDate));
	   System.out.println("Employee Get Call");
	   return predicts;
	 }

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/api/UpatepredictList")
	 public void  updateEmployees(@RequestBody PredictModel predictModel) {
	  predictservice.updatePredictModel(predictModel);;
	  System.out.println("Employee Update Call");
	 }

	
	

}
