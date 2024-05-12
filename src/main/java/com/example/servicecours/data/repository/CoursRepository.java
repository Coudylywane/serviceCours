package com.example.servicecours.data.repository;

import com.example.servicecours.data.entity.Cours;
import com.example.servicecours.data.enums.CoursStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {
    List<Cours> findAllByStatus(CoursStatus courseStatus);
}
