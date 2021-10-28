package com.kindsonthegenius.social.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
	public class PostService {
		
		@Autowired
		private PostRepository postRepository;
		
		public List<Post> getAllPosts() {
		   List<Post> posts = new ArrayList<>();
		   
		   postRepository.findAll()
		   .forEach(posts::add);
		   
		   return posts;	 
		}
		
		public List<Post> getPostsByUser(String id) {
		   List<Post> posts = new ArrayList<>();
		   
		   postRepository.findByUserId(id)
		   .forEach(posts::add);
		   
		   return posts;	 
		}
		
		   	   
		public Optional<Post> getPost(String id) {
			return postRepository.findById(id);
		}

		public void addPost(Post post) {
			postRepository.save(post);
		}
		
		public void updatePost(String id, Post post) {
			postRepository.save(post);
		}
		
		public void deletePost(String id) {
		     postRepository.deleteById(id);	
		}	
}