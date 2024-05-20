package com.ckael.portfolio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Experiences implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long ExperienceId;
	
	@NotBlank(message="must be not null")
	@Column
	String ExperienceCompany;
	
	@NotBlank(message="must be not null")
	@Column
	String ExperienceDuration;
	
	@NotBlank(message="must be not null")
	@Column
	String ExperienceTitle;
	
	@NotBlank(message="must be not null")
	@Size(min=10,message="Experiences information is incomplet")
	@Column
	String ExperiencesDesc;
	
	public Experiences(Long experienceId, String experienceCompany, String experienceDuration, String experienceTitle,
			String experiencesDesc) {
		super();
		ExperienceId = experienceId;
		ExperienceCompany = experienceCompany;
		ExperienceDuration = experienceDuration;
		ExperienceTitle = experienceTitle;
		ExperiencesDesc = experiencesDesc;
	}
	
	public Experiences() {
		
	}
	public Long getExperienceId() {
		return ExperienceId;
	}
	public void setExperienceId(Long experienceId) {
		ExperienceId = experienceId;
	}
	public String getExperienceCompany() {
		return ExperienceCompany;
	}
	public void setExperienceCompany(String experienceCompany) {
		ExperienceCompany = experienceCompany;
	}
	public String getExperienceDuration() {
		return ExperienceDuration;
	}
	public void setExperienceDuration(String experienceDuration) {
		ExperienceDuration = experienceDuration;
	}
	public String getExperienceTitle() {
		return ExperienceTitle;
	}
	public void setExperienceTitle(String experienceTitle) {
		ExperienceTitle = experienceTitle;
	}
	public String getExperiencesDesc() {
		return ExperiencesDesc;
	}
	public void setExperiencesDesc(String experiencesDesc) {
		ExperiencesDesc = experiencesDesc;
	}
	
	

}
