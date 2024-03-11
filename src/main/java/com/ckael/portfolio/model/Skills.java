package com.ckael.portfolio.model;

import java.io.Serializable;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skills implements Serializable  {
	
@Id@ GeneratedValue(strategy=GenerationType.AUTO)
Long skillsId;
@Column
String skillsName;
@Column
int skillsrate;
@Column

String skillsDescription;
public Long getSkillsId() {
	return skillsId;
}
public void setSkillsId(Long skillsId) {
	this.skillsId = skillsId;
}
public String getSkillsName() {
	return skillsName;
}
public void setSkillsName(String skillsName) {
	this.skillsName = skillsName;
}
public int getSkillsrate() {
	return skillsrate;
}
public void setSkillsrate(int skillsrate) {
	this.skillsrate = skillsrate;
}
public String getSkillsDescription() {
	return skillsDescription;
}
public void setSkillsDescription(String skillsDescription) {
	this.skillsDescription = skillsDescription;
}
public Skills(Long skillsId, String skillsName, int skillsrate, String skillsDescription) {
	super();
	this.skillsId = skillsId;
	this.skillsName = skillsName;
	this.skillsrate = skillsrate;
	this.skillsDescription = skillsDescription;
}
public Skills() {
	super();
	
}




}
