package com.ckael.portfolio.service;

import java.util.List;

import com.ckael.portfolio.model.Education;

public interface EducationService {
	Education saveEducation(Education e);
	Education editEducation(Education e);
	void deleteEducationById(Long id);
	void deleteEducation(Education e);
	Education getEducationById(Long id);
	List<Education> getAllEducation();

}
