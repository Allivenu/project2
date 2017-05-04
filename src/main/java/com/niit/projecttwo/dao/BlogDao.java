package com.niit.projecttwo.dao;


import java.util.List;

import com.niit.projecttwo.model.BlogPost;

public interface BlogDao {
   
	void saveBlogPost(BlogPost blogPost);
	List<BlogPost> getBlogPosts();
	BlogPost getBlogPostById(int id);
}