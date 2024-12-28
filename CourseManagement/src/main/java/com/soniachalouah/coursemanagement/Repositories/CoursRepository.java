package com.soniachalouah.coursemanagement.Repositories;

import com.soniachalouah.coursemanagement.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
