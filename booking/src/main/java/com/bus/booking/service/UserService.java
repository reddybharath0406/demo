package com.bus.booking.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bus.booking.Dao.UserRegistrationDao;
import com.bus.booking.Entity.UserSignUpDetailsEntity;
import com.bus.booking.component.UserSignupDetails;

@Service
public class UserService {
	/*
	 * @Autowired UserRegistrationDao userdao;
	 * 
	 * @Autowired UserSignupDetails userDetails; UserSignUpDetailsEntity
	 * userEntity1;
	 * 
	 * @Transactional(readOnly=false) public void save(UserSignupDetails
	 * userdetails) { userEntity1 = new UserSignUpDetailsEntity();
	 * userEntity1.setFirstname(userdetails.getFirstname());
	 * userEntity1.setLastname(userdetails.getLastname());
	 * userEntity1.setAge(userdetails.getAge());
	 * userEntity1.setGender(userdetails.getGender());
	 * userEntity1.setMobile(userdetails.getMobile());
	 * userEntity1.setState(userdetails.getState());
	 * userEntity1.setCountry(userdetails.getCountry());
	 * userdao.saveUser(userEntity1); }
	 * 
	 * @Transactional(readOnly=false) public void update(UserSignupDetails
	 * userdetails) { this.save(userdetails); }
	 * 
	 * public UserSignupDetails getUser(int id) {
	 * 
	 * 
	 * userEntity1=(UserSignUpDetailsEntity)userdao.getUser(id);
	 * 
	 * userDetails.setFirstname(userEntity1.getFirstname());
	 * userDetails.setLastname(userEntity1.getLastname());
	 * userDetails.setAge(userEntity1.getAge());
	 * userDetails.setGender(userEntity1.getGender());
	 * userDetails.setMobile(userEntity1.getMobile());
	 * userDetails.setState(userEntity1.getState());
	 * userDetails.setCountry(userEntity1.getCountry());
	 * 
	 * return userDetails; }
	 * 
	 * public void deleteUser(int id) { userdao.deleteUser(id); }
	 */}
