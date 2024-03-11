package com.ckael.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ckael.portfolio.model.Experiences;

@Repository
public interface ExperiencesRepository extends JpaRepository<Experiences, Long> {

}
