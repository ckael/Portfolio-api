package com.ckael.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckael.portfolio.exception.NotFoundException;
import com.ckael.portfolio.model.Experiences;
import com.ckael.portfolio.repository.ExperiencesRepository;

@Service
public class ExperiencesServiceImpl implements ExperiencesService {

	@Autowired
	ExperiencesRepository Rep;
	@Override
	public Experiences saveExperience(Experiences e) {
		
		return Rep.save(e);
	}

	@Override
	public Experiences updateExperience(Experiences e) {
		
		return Rep.save(e);
	}

	@Override
	public void deleteExperience(Experiences e) {
		Rep.delete(e);

	}

	@Override
	public void deleteExperienceById(Long id) {
		Rep.deleteById(id);

	}

	@Override
	public Experiences getExperienceById(Long id) throws NotFoundException {
		
		return Rep.findById(id).orElseThrow(()->new NotFoundException("Experience non trouve"));
	}

	@Override
	public List<Experiences> getAllExperiences() {
		
		return Rep.findAll();
	}

}
