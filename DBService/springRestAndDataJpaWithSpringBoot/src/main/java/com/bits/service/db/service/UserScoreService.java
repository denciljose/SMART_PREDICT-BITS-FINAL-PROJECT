package com.bits.service.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserScoreModel;
;
@Service
public interface UserScoreService {
	
	 public List<UserScoreModel> retrieveUserModels();	
	 public Optional<UserScoreModel>  getUserModel(Long UserModelId);
	 public void saveUserModel(UserScoreModel UserModel);
	 public void deleteUserModel(Long UserModelId);
	 public void updateUserModel(UserScoreModel UserModel);
	 public List<UserScoreModel> retrieveUserScoreByID();
	 

}
