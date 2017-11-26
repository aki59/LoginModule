package com.wipro.LoginMod.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User, Long> {
	//User findByEmail(String email);
	User findByUserName(String userName);

}
