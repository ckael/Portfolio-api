package com.ckael.portfolio.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ckael.portfolio.model.Project;

public interface ProjectService {
	Project addProject(Project p);
	Project updateProject(Project p );
	void deleteProjectById(Long id);
	void deleteProject(Project p);
	Project getProjectById(Long Id);
	Page<Project> getProjectPage(int page);
	List<Project> getAllProject();
}
