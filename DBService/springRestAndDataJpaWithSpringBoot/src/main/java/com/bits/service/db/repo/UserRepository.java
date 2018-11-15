package com.bits.service.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bits.service.db.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel,String>{ 

}
