package com.ckael.portfolio.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Education implements Serializable{
@Id @GeneratedValue(strategy=GenerationType.AUTO)
Long EducationId;
@Column
String EducationDegre;
@Column
int GraduationYear;
@Column
String EducationInstitut;
public Education(Long educationId, String educationDegre, int graduationYear, String educationInstitut) {
	super();
	EducationId = educationId;
	EducationDegre = educationDegre;
	GraduationYear = graduationYear;
	EducationInstitut = educationInstitut;
}
public Education() {
	super();
}
public Long getEducationId() {
	return EducationId;
}
public void setEducationId(Long educationId) {
	EducationId = educationId;
}
public String getEducationDegre() {
	return EducationDegre;
}
public void setEducationDegre(String educationDegre) {
	EducationDegre = educationDegre;
}
public int getGraduationYear() {
	return GraduationYear;
}
public void setGraduationYear(int graduationYear) {
	GraduationYear = graduationYear;
}
public String getEducationInstitut() {
	return EducationInstitut;
}
public void setEducationInstitut(String educationInstitut) {
	EducationInstitut = educationInstitut;
}


}
