package com.bits.service.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserScoreModel;
import com.bits.service.db.repo.UserScoreRepository;
@Service
public class UserScoreServiceImpl implements UserScoreService{

	
	@Autowired
	private UserScoreRepository userServie;
	@Override
	public List<UserScoreModel> retrieveUserModels() {
		// TODO Auto-generated method stub
		return userServie.findAll();
	 
	}
	 @Override
	 public List<UserScoreModel> retrieveUserScoreByID()
	 {
		 return userServie.findAll(); 
	 }

	@Override
	public Optional<UserScoreModel> getUserModel(Long UserModelId) {
		// TODO Auto-generated method stub
		return userServie.findById(UserModelId);
	//	return null;
	}

	@Override
	public void saveUserModel(UserScoreModel userModel) {
		// TODO Auto-generated method stub
		userServie.save(userModel);
		
	}

	@Override
	public void deleteUserModel(Long UserModelId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserModel(UserScoreModel UserModel) {
		// TODO Auto-generated method stub
		
	}

}
