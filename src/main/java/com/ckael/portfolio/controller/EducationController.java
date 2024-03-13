package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Education>>  listEducation()
	{
		return new ResponseEntity<>(Service.getAllEducation(), HttpStatus.OK);
	}
	
	@GetMapping("/findEducation/{Id}")
	public ResponseEntity<Education> findEducationById(@PathVariable Long Id) 
	{	
		Education edu = Service.getEducationById(Id);
		return ResponseEntity.ok(edu);
	}
	
	@GetMapping("/deleteEducation/Id/{Id}")
	public ResponseEntity<?> deleteEducation(@PathVariable Long Id)
	{
		Service.deleteEducationById(Id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/addEducation")
	public ResponseEntity<Education> saveEducation(@RequestBody() Education e)
	{
		Education edu =  Service.saveEducation(e);
		return new ResponseEntity<>(edu, HttpStatus.CREATED);
	}
	
	@PostMapping("/editEducation")
	public ResponseEntity<Education> editEducation(@RequestBody() Education e)
	{
		Education edu = Service.editEducation(e);
		return ResponseEntity.accepted().body(edu);
	}
}
