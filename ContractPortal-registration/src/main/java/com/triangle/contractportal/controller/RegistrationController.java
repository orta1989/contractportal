package com.triangle.contractportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.triangle.contractportal.model.CompanyModel;
import com.triangle.contractportal.model.UserModel;
import com.triangle.contractportal.service.RegistrationService;

@RestController
@RequestMapping("/register")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<UserModel> register(@RequestBody UserModel model) {

		return registrationService.register(model);
	}
	
	@PostMapping(value = "/company", consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<CompanyModel> register(@RequestBody CompanyModel model) {

		return registrationService.register(model);
	}

}
