package com.niit.projecttwo.dao;

import java.util.List;

import com.niit.projecttwo.model.Job;

public interface JobDao {
   
	void saveJobDetails(Job job);
	List<Job> getAllJobDetails();
	Job getJobById(int id);
}
