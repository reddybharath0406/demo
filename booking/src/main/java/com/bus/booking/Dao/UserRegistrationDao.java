package com.bus.booking.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bus.booking.Entity.UserSignUpDetailsEntity;
@Repository
public interface UserRegistrationDao extends CrudRepository<UserSignUpDetailsEntity,Long>{	 
	/*
	 * public void saveUser(UserSignUpDetailsEntity userentity);
	 * 
	 * public void deleteUser(int id);
	 * 
	 * public UserSignUpDetailsEntity getUser(int id);
	 * 
	 * public void saveOrUpdateUser(UserSignUpDetailsEntity userEntity);
	 */
	
}
