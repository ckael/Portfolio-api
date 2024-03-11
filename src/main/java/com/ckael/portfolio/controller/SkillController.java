package com.ckael.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Skills> listSkills()
	{
		
		return Service.getAllSkills();
	}
	
	@GetMapping("/deleteSkill/Id/{Id}")
	public void deleteSkills(@PathVariable() Long Id) 
	{
		Service.deleteSkillsById(Id);	
	}
	
	@GetMapping("/findSkill/{Id}")
	public Skills findSkillById(@PathVariable() Long Id) 
	{
		
		return Service.getSkillsById(Id);
	}
	
	@PostMapping("/saveSkill")
	public Skills saveSkill(@RequestBody Skills s) 
	{
		
		return Service.saveSkills(s);
	}
	
	@PostMapping("/editSkill")
	public Skills editSkill(@RequestBody Skills s)
	{
		
		return Service.updateSkills(s);
	}
	
}
