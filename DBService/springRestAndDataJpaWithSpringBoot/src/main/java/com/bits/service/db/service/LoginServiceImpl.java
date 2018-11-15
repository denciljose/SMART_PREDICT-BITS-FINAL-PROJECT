package com.bits.service.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.service.db.model.UserModel;
import com.bits.service.db.repo.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired 
	private UserRepository userrepo;

	@Override
	public List<UserModel> retrieveUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UserModel> getUser(String UserName) {
		// TODO Auto-generated method stub
		return userrepo.findById(UserName);
	}

	@Override
	public void saveUser(UserModel newUser) {
		// TODO Auto-generated method stub
		userrepo.save(newUser);
	}

	@Override
	public void deleteUser(String UserName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePredictModel(UserModel User) {
		// TODO Auto-generated method stub
		
	}
	
	


}
