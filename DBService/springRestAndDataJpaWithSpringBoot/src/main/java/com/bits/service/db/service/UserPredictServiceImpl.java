package com.bits.service.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserPredictModel;
import com.bits.service.db.repo.UserPredictRepository;

@Service
public class UserPredictServiceImpl implements UserPredictService{

	@Autowired
	private UserPredictRepository userPredictRepo;
	
	@Override
	public List<UserPredictModel> retrieveUserPredictModels() {
		// TODO Auto-generated method stub
		return	userPredictRepo.findAll();
	}

	@Override
	public List<UserPredictModel> getUserPredictModel(String userPredictModelId) {
		// TODO Auto-generated method stub
	return userPredictRepo.findByUserModelId(userPredictModelId);
	}

	@Override
	public void saveUserPredictModel(UserPredictModel userPredictModel) {
		// TODO Auto-generated method stub
		userPredictRepo.save(userPredictModel);
	}

	@Override
	public void deleteUserPredictModel(Long userPredictModelId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserPredictModel(UserPredictModel userPredictModel) {
		// TODO Auto-generated method stub
		userPredictRepo.save(userPredictModel);
	}

	@Override
	public UserPredictModel getUserPredictModelByGameId(Long gameId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPredictModel getUserPredictModelByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
