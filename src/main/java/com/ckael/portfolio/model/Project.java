package com.ckael.portfolio.model;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
Long ProjectId;
@Column
String ProjectLink;
@Column
String ProjectDesc;
@Column
String ProjectTitle;
@Column 
String ProjectTech;
public Long getProjectId() {
	return ProjectId;
}
public void setProjectId(Long projectId) {
	ProjectId = projectId;
}
public String getProjectLink() {
	return ProjectLink;
}
public void setProjectLink(String projectLink) {
	ProjectLink = projectLink;
}
public String getProjectDesc() {
	return ProjectDesc;
}
public void setProjectDesc(String projectDesc) {
	ProjectDesc = projectDesc;
}
public String getProjectTitle() {
	return ProjectTitle;
}
public void setProjectTitle(String projectTitle) {
	ProjectTitle = projectTitle;
}
public String getProjectTech() {
	return ProjectTech;
}
public void setProjectTech(String projectTech) {
	ProjectTech = projectTech;
}
public Project(Long projectId, String projectLink, String projectDesc, String projectTitle, String projectTech) {
	super();
	ProjectId = projectId;
	ProjectLink = projectLink;
	ProjectDesc = projectDesc;
	ProjectTitle = projectTitle;
	ProjectTech = projectTech;
}
public Project() {
	super();
	
}


}
