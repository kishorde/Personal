package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.AdminCategory;

@Repository
public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Integer>{

}
