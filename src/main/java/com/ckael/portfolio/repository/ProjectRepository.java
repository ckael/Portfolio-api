package com.ckael.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ckael.portfolio.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
