package com.ckael.portfolio.service;

import java.util.List;

import com.ckael.portfolio.model.Skills;

public interface SkillsService {
	Skills saveSkills(Skills s);
	Skills updateSkills(Skills s);
	public void deleteSkillsById(Long id);
	Skills getSkillsById(Long Id);
	List<Skills> getAllSkills();
}
