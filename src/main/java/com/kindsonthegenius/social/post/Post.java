package com.kindsonthegenius.social.post;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.kindsonthegenius.social.user.User;

@Entity
public class Post {

   @Id
   private String id;
   private String postdate;
   
   @ManyToOne
   private User user;  
   private String details;  
	   
	public Post(String id, String postdate, User user, String details) {
		this.id = id;
		this.postdate = postdate;
		this.user = user;
		this.details = details;
	}
	
	public Post() { //Default constructor with not params
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPostdate() {
		return postdate;
	}
	
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	   
	   
}
