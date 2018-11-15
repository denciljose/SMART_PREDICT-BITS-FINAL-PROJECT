package com.bits.service.db.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserModel;
@Service
public interface LoginService {
	
	 public List<UserModel> retrieveUsers();	
	 public Optional<UserModel>  getUser(String UserName);
	 public void saveUser(UserModel NewUser);
	 public void deleteUser(String UserName);
	 public void updatePredictModel(UserModel User);

}