package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.UserReports;

@Repository
public interface UserReportRepository extends JpaRepository<UserReports, Integer>{

}
