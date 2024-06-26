package com.ckael.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckael.portfolio.exception.NotFoundException;
import com.ckael.portfolio.model.Education;
import com.ckael.portfolio.repository.EducationRepository;
@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	EducationRepository Rep;
	@Override
	public Education saveEducation(Education e) {
	
		return Rep.save(e);
	}

	@Override
	public Education editEducation(Education e) {
		
		return Rep.save(e);
	}

	@Override
	public void deleteEducationById(Long id) {
		Rep.deleteById(id);

	}

	@Override
	public void deleteEducation(Education e) {
		Rep.delete(e);

	}

	@Override
	public Education getEducationById(Long id) throws NotFoundException {
		
		return Rep.findById(id).orElseThrow(()->new NotFoundException("Cette education n'est pas present dans la base de donnees"));
	}

	@Override
	public List<Education> getAllEducation() {
		
		return Rep.findAll();
	}

}
