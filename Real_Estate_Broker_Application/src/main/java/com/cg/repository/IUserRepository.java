package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String>{
	
	
}
