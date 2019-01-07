package com.triangle.contractportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.triangle.contractportal.model.CompanyModel;
import com.triangle.contractportal.model.UserModel;
import com.triangle.contractportal.repository.UserRepository;

@Service
public class RegistrationService {

	@Autowired
	UserRepository userRepository;
	
	public ResponseEntity<UserModel> register(UserModel model) {
		
		model = userRepository.save(model);
		
		return new ResponseEntity<UserModel>(model, HttpStatus.CREATED);
	}
	
	public ResponseEntity<CompanyModel> register(CompanyModel model) {
		
		return new ResponseEntity<CompanyModel>(model, HttpStatus.CREATED);
	}

}

