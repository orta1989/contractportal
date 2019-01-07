package com.triangle.contractportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.triangle.contractportal.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

}
