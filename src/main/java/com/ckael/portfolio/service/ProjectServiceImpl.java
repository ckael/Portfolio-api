package com.ckael.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ckael.portfolio.exception.NotFoundException;
import com.ckael.portfolio.model.Project;
import com.ckael.portfolio.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository Rep;
	@Override
	public Project addProject(Project p) {
		
		return Rep.save(p);
	}

	@Override
	public Project updateProject(Project p) {
		
		return Rep.save(p);
	}

	@Override
	public void deleteProjectById(Long id) {
		Rep.deleteById(id);
		
	}

	@Override
	public void deleteProject(Project p) {
		Rep.delete(p);
		
	}

	@Override
	public Project getProjectById(Long Id) throws NotFoundException{
	
		return Rep.findById(Id).orElseThrow(()->new NotFoundException("Projet non trouve"));
	}

	@Override
	public List<Project> getAllProject() {
		
		return Rep.findAll();
	}

	@Override
	public Page<Project> getProjectPage(int page) {
		PageRequest p =PageRequest.of(page,2);
		
		
		return Rep.findAll(p) ;
	}

}
