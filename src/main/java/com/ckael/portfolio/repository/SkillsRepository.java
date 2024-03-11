package com.ckael.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ckael.portfolio.model.Skills;
@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {

}
