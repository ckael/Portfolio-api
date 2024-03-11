package com.ckael.portfolio.service;

import java.util.List;

import com.ckael.portfolio.model.Experiences;

public interface ExperiencesService {
	Experiences saveExperience(Experiences e);
	Experiences updateExperience(Experiences e);
	void deleteExperience(Experiences e);
	void deleteExperienceById(Long id);
	Experiences getExperienceById(Long id);
	List<Experiences> getAllExperiences();
	

}
