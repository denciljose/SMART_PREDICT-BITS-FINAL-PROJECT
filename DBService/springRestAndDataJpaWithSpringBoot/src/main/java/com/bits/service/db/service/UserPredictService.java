package com.bits.service.db.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserPredictModel;
@Service
public interface UserPredictService {
	
	 public List<UserPredictModel> retrieveUserPredictModels();	 
	 public List<UserPredictModel>  getUserPredictModel(String userPredictModelId);
	 public UserPredictModel getUserPredictModelByGameId(Long gameId);
	 public UserPredictModel getUserPredictModelByUserId(Long userId);
	 public void saveUserPredictModel(UserPredictModel userPredictModel);
	 public void deleteUserPredictModel(Long userPredictModelId);
	 public void updateUserPredictModel(UserPredictModel userPredictModel);

}
