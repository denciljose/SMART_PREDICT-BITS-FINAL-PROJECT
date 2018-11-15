package com.bits.service.db.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bits.service.db.model.UserPredictModel;

public interface UserPredictRepository extends JpaRepository<UserPredictModel,Long>{ 
	
	 @Query(value = "SELECT * FROM USER_PREDICT_MODEL WHERE USERID = ?1", nativeQuery = true)
	List<UserPredictModel> findByUserModelId(String userID);

}