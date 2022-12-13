package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.UserLogs;

@Repository
public interface UserLogRepository extends JpaRepository<UserLogs, Integer>{

}
