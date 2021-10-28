package com.kindsonthegenius.social.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.social.location.Location;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;	

	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		
		userRepository.findAll()
		.forEach(users::add);
		
		return users;
	}

	
	public List<User> getUsersByLocation(String id) {
		List<User> users = new ArrayList<>();
		
		userRepository.findByLocationId(id)
		.forEach(users::add);
		
		return users;
	}

	
	public Optional<User> getUser(String id) {
		return userRepository.findById(id);
	}

	
	public void addUser(User user) {
		userRepository.save(user);
	}

	
	public void updateUser(String id, User user) {
		userRepository.save(user);
	}

	
	public void deleteUser(String id) {
	     userRepository.deleteById(id);	
	}


	public List<User> getUsersByLocationId(String Id) {
		return userRepository.findByLocationId(Id);
	}


	public List<User> getUsersByFirstname(String firstname) {
		return userRepository.findByFirstname(firstname);
	}
}

/*
 * {
  "id": "l2",
  "firstname": "Kindson",
  "lastname": "Munonye",
  "location" : {"id": "l2", "name": "Akokwa"},
  "email" : "kindsonthegenius@gmail.com"
}
 * */
