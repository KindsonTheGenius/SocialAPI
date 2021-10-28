package com.kindsonthegenius.social.post;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {
		
	  @Autowired
	  private PostService postService;
	
	  @RequestMapping(value = "/posts")
	  public String getAllPost() {
		  //return postService.getAllPosts();
		  return "posts";
	  }	  
	  
	  @RequestMapping(value = "/posts/{id}")
	  public Optional<Post> getPost(@PathVariable String id) {
	      return postService.getPost( id);
	  }
	  
	  
	  @RequestMapping(value = "/posts", method = RequestMethod.POST)	  
	  public void addPost(@RequestBody Post post) {
		  postService.addPost(post);
	  }
	  
	  @RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
	  public void updatePost(@PathVariable String id, @RequestBody Post post) {

	        postService.updatePost(id, post);

	  }
	  
	  
	  @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
	  public void deletePost(@PathVariable String id) {
	      postService.deletePost(id);
	  }
	 
	  
	  

}

