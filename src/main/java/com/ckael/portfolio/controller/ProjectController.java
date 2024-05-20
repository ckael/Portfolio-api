package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckael.portfolio.model.Project;
import com.ckael.portfolio.service.ProjectServiceImpl;

import jakarta.validation.Valid;

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
	
	@DeleteMapping("/deleteProject/Id/{Id}")
	public ResponseEntity<String> deleteProject(@PathVariable() Long Id) 
	{	
		Service.deleteProjectById(Id);	
		return ResponseEntity.ok("Project \t"+Id+"\t deleted successfuly");
	}
	
	@GetMapping("/findProject/{Id}")
	public ResponseEntity<Project> findProjectById(@PathVariable() Long Id)
	{
		
		Project projet = Service.getProjectById(Id);
		return ResponseEntity.ok(projet);
	}
	
	@PutMapping("/editProject")
	public ResponseEntity<Project> editProject(@Valid @RequestBody Project p) 
	{
		
		Project projet = Service.updateProject(p);
		return ResponseEntity.accepted().body(projet);
	}
	
	@PostMapping("/addProject")
	public ResponseEntity<Project> saveProject(@Valid @RequestBody Project p) 
	{
		
		return new ResponseEntity<>(Service.addProject(p), HttpStatus.CREATED);
	}
	
	@GetMapping("/getProjectPage/{page}")
	public ResponseEntity<Page<Project>>  getProjectPage(@PathVariable() int page)
	{	
		return new ResponseEntity<>(Service.getProjectPage(page),HttpStatus.OK);
	}
}

