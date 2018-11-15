package com.bits.service.db.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.service.db.model.PredictModel;
import com.bits.service.db.model.UserScoreModel;

public interface UserScoreRepository extends JpaRepository<UserScoreModel,Long>{ 
	
	//List<UserScoreModel> findTop2ByNameOrderByscoreDesc(String name);
	// List<UserScoreModel> findFirst5Bydate();
}
