package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.UserLogs;
import com.cybage.model.UserReports;
import com.cybage.repository.UserLogRepository;
import com.cybage.repository.UserReportRepository;

@Service
public class UserReportService {

	
@Autowired UserReportRepository userReportRepository;

	public UserReports addUserReports(UserReports userReports)
	{
		return userReportRepository.save(userReports);
	}
	
	public List<UserReports> getAllUserReports()
	{
		return userReportRepository.findAll();
	}
		
	public UserReports getUserReportIdById(int userReportId)
	{
		return userReportRepository.findById(userReportId).orElse(null);
	}

}
