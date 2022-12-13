package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cybage.model.UserLogs;
import com.cybage.repository.UserLogRepository;

@Service
public class UserLogService {

	
@Autowired UserLogRepository userLogRepository;

	public UserLogs addUserLog(UserLogs userLogs)
	{
		return userLogRepository.save(userLogs);
	}
	
	public List<UserLogs> getAllUserLogs()
	{
		return userLogRepository.findAll();
	}
		
	public UserLogs getUserLogsById(int userLogId)
	{
		return userLogRepository.findById(userLogId).orElse(null);
	}

}
