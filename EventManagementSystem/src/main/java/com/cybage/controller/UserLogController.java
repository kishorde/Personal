package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.UserLogs;
import com.cybage.service.UserLogService;


@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/userLog")
public class UserLogController {


	@Autowired UserLogService userLogService;
	
	@PostMapping("/adduserLog")
	public ResponseEntity<String> addUserLog(@RequestBody UserLogs userLogs)
	{
		UserLogs userLog1 = userLogService.addUserLog(userLogs);
		return new ResponseEntity<String>("UserLog done Successfully!!!",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUserLog")
	public ResponseEntity<List<UserLogs>> getAllUserLog()
	{
		List<UserLogs> userLogList = userLogService.getAllUserLogs();
		return new ResponseEntity<List<UserLogs>>(userLogList,HttpStatus.OK);
	}
	
	@GetMapping("/{userLogId}")
	public ResponseEntity<UserLogs> getUserLogById(@PathVariable int userLogId)
	{
		UserLogs userLogs1 = userLogService.getUserLogsById(userLogId);

		if(userLogs1==null)
			throw new RecordNotFoundException("UserLogs not found!!");
		return new ResponseEntity<UserLogs>(userLogs1,HttpStatus.OK);
	}
	
	
}


