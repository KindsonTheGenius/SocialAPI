package com.kindsonthegenius.social.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
	
	public List<User> findByLocationId(String locationId); // findby<Classname>Id

	public List<User> findByFirstname(String Firstname);
	
}
