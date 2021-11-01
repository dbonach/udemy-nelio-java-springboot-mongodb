package com.estudandojava.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estudandojava.spring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
