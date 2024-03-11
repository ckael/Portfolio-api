package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckael.portfolio.model.Education;

import com.ckael.portfolio.service.EducationServiceImpl;

@RestController
@RequestMapping("/education")
public class EducationController {
	@Autowired
	EducationServiceImpl Service;
	
	@GetMapping("/listEducation")
	public List<Education> listEducation()
	{
		return Service.getAllEducation();
	}
	@GetMapping("/findEducation/{Id}")
	public Education findEducationById(@PathVariable Long Id) 
	{	
		return Service.getEducationById(Id);
	}
	@GetMapping("/deleteEducation/Id/{Id}")
	public void deleteEducation(@PathVariable Long Id)
	{
		Service.deleteEducationById(Id);
	}
	@PostMapping("/addEducation")
	public Education saveEducation(@RequestBody() Education e)
	{
		
		return Service.saveEducation(e);
	}
	@PostMapping("/editEducation")
	public Education editEducation(@RequestBody() Education e)
	{
		
		return Service.editEducation(e);
	}
}
