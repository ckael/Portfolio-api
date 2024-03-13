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

import com.ckael.portfolio.model.Skills;
import com.ckael.portfolio.service.SkillsServiceImpl;

@RestController
@RequestMapping("/skill")
public class SkillController {
	@Autowired
	SkillsServiceImpl Service;
	
	@GetMapping("/listSkills")
	public ResponseEntity<List<Skills>>  listSkills()
	{	
		return new ResponseEntity<>(Service.getAllSkills(), HttpStatus.OK);
	}
	
	@GetMapping("/deleteSkill/Id/{Id}")
	public ResponseEntity<?> deleteSkills(@PathVariable() Long Id) 
	{
		Service.deleteSkillsById(Id);	
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findSkill/{Id}")
	public ResponseEntity<Skills> findSkillById(@PathVariable() Long Id) 
	{
		
		Skills sk = Service.getSkillsById(Id);
		return ResponseEntity.ok(sk);
	}
	
	@PostMapping("/saveSkill")
	public ResponseEntity<Skills> saveSkill(@RequestBody Skills s) 
	{	
		return new ResponseEntity<>(Service.saveSkills(s),HttpStatus.CREATED); 
	}
	
	@PostMapping("/editSkill")
	public ResponseEntity<Skills> editSkill(@RequestBody Skills s)
	{
		Skills sk = Service.updateSkills(s);
		return ResponseEntity.accepted().body(sk);
	}
	
}
