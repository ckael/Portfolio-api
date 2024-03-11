package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckael.portfolio.model.Project;
import com.ckael.portfolio.service.ProjectServiceImpl;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired 
	ProjectServiceImpl Service;
	
	@GetMapping("/listProjects")
	public List<Project> listProject()
	{
		
		return Service.getAllProject();
	}
	
	@GetMapping("/deleteProject/Id/{Id}")
	public void deleteProject(@PathVariable() Long Id) 
	{
		
		Service.deleteProjectById(Id);	
	}
	@GetMapping("/findProject/{Id}")
	public Project findProjectById(@PathVariable() Long Id)
	{
		
		return Service.getProjectById(Id);
	}
	
	@PostMapping("/editProject")
	public Project editProject(@RequestBody Project p) 
	{
		
		return Service.updateProject(p);
	}
	
	@PostMapping("/saveProject")
	public Project saveProject(@RequestBody Project p) 
	{
		
		return Service.addProject(p);
	}
	@GetMapping("/getProjectPage/{page}")
	public Page<Project> getProjectPage(@PathVariable() int page)
	{
		
		return Service.getProjectPage(page);
	}
}

