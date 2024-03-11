package com.ckael.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckael.portfolio.model.Skills;
import com.ckael.portfolio.repository.SkillsRepository;
@Service
public class SkillsServiceImpl implements SkillsService {
	@Autowired
	SkillsRepository Rep;
	
	@Override
	public Skills saveSkills(Skills s) {
		
		return Rep.save(s);
	}

	@Override
	public Skills updateSkills(Skills s) {
		
		return Rep.save(s);
	}

	@Override
	public void deleteSkillsById(Long id) {
		
		Rep.deleteById(id);
	}

	@Override
	public Skills getSkillsById(Long Id) {
		
		return Rep.findById(Id).get();
	}

	@Override
	public List<Skills> getAllSkills() {
		
		return Rep.findAll();
	}

}
