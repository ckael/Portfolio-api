package com.ckael.portfolio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ckael.portfolio.model.Education;
@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

}
