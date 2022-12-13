package com.cybage.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Random;

import javax.mail.MessagingException;
//import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.UserBean;
import com.cybage.repository.UserBeanRepository;
import com.cybage.service.UserBeanService;

import net.bytebuddy.utility.RandomString;


@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/registration")
public class UserBeanController {
	
	@Autowired UserBeanRepository userBeanRepository;
	
	@Autowired UserBeanService userBeanService;
	
	
	@PostMapping("/registerUser")
	public void registerUser(@RequestBody UserBean registration,HttpServletRequest request) throws UnsupportedEncodingException, MessagingException
	{
		userBeanService.registerUser(registration,getSiteURL(request));
	}
	
	private String getSiteURL(HttpServletRequest request) {
		String siteURL = request.getRequestURL().toString();
		return siteURL.replace(request.getServletPath(), "");
	}
	
	@GetMapping("/getAllRegisteredUser")
	public ResponseEntity<List<UserBean>> getAllRegisteredUser()
	{
		List<UserBean> list =userBeanService.getAllRegisteredUser();
		return new ResponseEntity<List<UserBean>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getRegisteredUserById/{id}")
	public ResponseEntity<UserBean> getRegisteredUserById(@PathVariable int id)
	{
		UserBean userBean = userBeanService.getRegisteredUserById(id);
		return new ResponseEntity<UserBean>(userBeanService.getRegisteredUserById(id),HttpStatus.OK);
	} 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRegisteredUser(@PathVariable int id)
	{
		userBeanService.deleteRegisteredUser(id);
		return new ResponseEntity<String>("User Deleted Successfully!",HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateRegisteredUser(@PathVariable int id,@RequestBody UserBean userBean)
	{
		userBeanService.updateRegisteredUser(id, userBean);
		return new ResponseEntity<String>("user values updated Successfully!!!",HttpStatus.CREATED);
	}
	
	
	
	
	@GetMapping("/verify")
	public String activateAccount(@Param("code") String code)
	{
		boolean isAccountVerified = userBeanService.verify(code);
		if(isAccountVerified)
		{
			return "<p>Hello</p>" + "<h1> Your Account Verified</h1>" +"<a href='http://localhost:4200/login'>Click Here!!</a>"
					+ "<p>Thank you</p>";
		}
		else
		{
			return "<p>Hello</p>" + "<h1> Your Booking has been Confirmed</h1>"
					+ "<p>Thank you</p>";
		}
	}
	
	
	
	@GetMapping("/getRegisteredUserByEmail/{emailid}")
	public ResponseEntity<UserBean> getUserByEmailId(@PathVariable String emailid)
	{
		UserBean userList =userBeanService.getUserByEmailId(emailid);
		return new ResponseEntity<UserBean>(userList,HttpStatus.OK);
	}
	
	@GetMapping("/orgList")
	public ResponseEntity<List<UserBean>> getAllOrganizer()
	{
		List<UserBean> orgList =userBeanService.getAllOrganizers();
		return new ResponseEntity<List<UserBean>>(orgList,HttpStatus.OK);
	}
	
	
	@GetMapping("/userList")
	public ResponseEntity<List<UserBean>> getAllUser()
	{
		List<UserBean> userList =userBeanService.getAllUsers();
		return new ResponseEntity<List<UserBean>>(userList,HttpStatus.OK);
	}
	
	
	@GetMapping("/changePassword/{oldpass}/{newpass}/{userId}")
	public ResponseEntity<String> updatePassword(@PathVariable String oldpass,@PathVariable String newpass,@PathVariable int userId)
	{
		userBeanService.changePassword(oldpass, newpass, userId);
		return new ResponseEntity<String>("passeord updated successfully.",HttpStatus.OK);
	}
	
	
	

	
	
	
	
	//rest- template

//	@Autowired
//	private RestTemplate restTemplate;
//	
//	private String baseUrl="http://localhost:8085/registration";
//	
//	@PostMapping("/registerUser")
//	public ResponseEntity<String> registerUser(@RequestBody Registrationdemo registrationdemo)
//	{
//		return restTemplate.postForEntity(baseUrl+"/registerUser",registrationdemo,String.class);
//	}

//	
//	@GetMapping("/getAllRegisteredUser")
//	public ResponseEntity<Registrationdemo[]> getAllRegisteredUser()
//	{
//		return restTemplate.getForEntity(baseUrl + "/getAllRegisteredUser", Registrationdemo[].class);
//	}
//	
//	@GetMapping("/getRegisteredUserById/{id}")
//	public ResponseEntity<Registrationdemo> getRegisteredUserById(@PathVariable int id)
//	{
//		return restTemplate.getForEntity(baseUrl + "/getRegisteredUserById/"+id, Registrationdemo.class);
//	} 
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<String> deleteRegisteredUser(@PathVariable int id)
//	{
//		restTemplate.delete(baseUrl + "/"+id, String.class);
//		return new ResponseEntity<String>("User Deleted Successfully!",HttpStatus.CREATED);
//	}
//	
//	@PutMapping("/{id}")
//	public ResponseEntity<String> updateRegisteredUser(@PathVariable int id,@RequestBody Registrationdemo registrationdemo)
//	{
//		restTemplate.put(baseUrl + "/"+id,registrationdemo, String.class);
//		return new ResponseEntity<String>("User values updated Successfully!!!",HttpStatus.CREATED);
//	}
//		
//	@GetMapping("/getRegisteredUserByEmail/{email}")
//	public ResponseEntity<Registrationdemo> getRegisteredUserByEmail(@PathVariable String email)
//	{
//		return restTemplate.getForEntity(baseUrl + "/getRegisteredUserByEmail/"+email, Registrationdemo.class);
//	} 
	
	
}
