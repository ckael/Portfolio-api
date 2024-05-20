package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.ckael.portfolio.model.Experiences;
import com.ckael.portfolio.service.ExperiencesServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/experience")
public class ExperiencesController {

	@Autowired
	ExperiencesServiceImpl Service;
	
	@GetMapping("/listExperiences")
	public  ResponseEntity<List<Experiences>> listExperiences()
	{
		return new ResponseEntity<>(Service.getAllExperiences(),HttpStatus.OK);
	}
	
	@GetMapping("/findExperience/{Id}")
	public ResponseEntity<Experiences> findExperiencesById(@PathVariable Long Id) 
	{
		Experiences experience = Service.getExperienceById(Id);
		return ResponseEntity.ok(experience);
	}
	
	@DeleteMapping("/deleteExperience/Id/{Id}")
	public ResponseEntity<String> deleteExperience(@PathVariable Long Id) 
	{
		Service.deleteExperienceById(Id);
		return ResponseEntity.ok("Experience \t"+Id+"\t deleted successfuly");
	}
	
	@PostMapping("/addExperience")
	public ResponseEntity<Experiences> addExperiences(@Valid @RequestBody() Experiences e) 
	{
		Experiences experience = Service.saveExperience(e);
		return new ResponseEntity<>(experience,HttpStatus.CREATED);
	}
	
	@PutMapping("/editExperience")
	public ResponseEntity<Experiences> editExperiences(@Valid @RequestBody() Experiences e) 
	{
		Experiences experience= Service.updateExperience(e);
		return ResponseEntity.accepted().body(experience);
	}
}
