package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckael.portfolio.model.Experiences;
import com.ckael.portfolio.service.ExperiencesServiceImpl;

@RestController
@RequestMapping("/experience")
public class ExperiencesController {

	@Autowired
	ExperiencesServiceImpl Service;
	
	@GetMapping("/listExperiences")
	public List<Experiences> listExperiences()
	{
		
		return Service.getAllExperiences();
	}
	@GetMapping("/findExperience/{Id}")
	public Experiences findExperiencesById(@PathVariable Long Id) 
	{
		
		return Service.getExperienceById(Id);
	}
	@GetMapping("/deleteExperience/Id/{Id}")
	public void deleteExperience(@PathVariable Long Id) 
	{
		Service.deleteExperienceById(Id);
	}
	@PostMapping("/addExperience")
	public Experiences addExperiences(@RequestBody() Experiences e) 
	{
		
		return Service.saveExperience(e);
	}
	@PostMapping("/editExperience")
	public Experiences editExperiences(@RequestBody() Experiences e) 
	{
		
		return Service.updateExperience(e);
	}
}
