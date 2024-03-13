package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Project>> listProject()
	{
		
		return new ResponseEntity<>(Service.getAllProject(), HttpStatus.OK) ;
	}
	
	@GetMapping("/deleteProject/Id/{Id}")
	public ResponseEntity<?> deleteProject(@PathVariable() Long Id) 
	{	
		Service.deleteProjectById(Id);	
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findProject/{Id}")
	public ResponseEntity<Project> findProjectById(@PathVariable() Long Id)
	{
		
		Project projet = Service.getProjectById(Id);
		return ResponseEntity.ok(projet);
	}
	
	@PostMapping("/editProject")
	public ResponseEntity<Project> editProject(@RequestBody Project p) 
	{
		
		Project projet = Service.updateProject(p);
		return ResponseEntity.accepted().body(projet);
	}
	
	@PostMapping("/saveProject")
	public ResponseEntity<Project> saveProject(@RequestBody Project p) 
	{
		
		return new ResponseEntity<>(Service.addProject(p), HttpStatus.CREATED);
	}
	
	@GetMapping("/getProjectPage/{page}")
	public ResponseEntity<Page<Project>>  getProjectPage(@PathVariable() int page)
	{	
		return new ResponseEntity<>(Service.getProjectPage(page),HttpStatus.OK);
	}
}

