package com.cybage.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.cybage.exception.PasswordNotMatched;
import com.cybage.model.UserBean;
import com.cybage.repository.UserBeanRepository;

import net.bytebuddy.utility.RandomString;

@Service
public class UserBeanService {

	@Autowired
	UserBeanRepository userBeanRepository;

	@Autowired
	private JavaMailSender mailSender;

	public void registerUser(UserBean userBean, String siteURL)
			throws UnsupportedEncodingException, MessagingException {
		

		String randomCode = RandomString.make(15);
		userBean.setAuthenticationCode(randomCode);
		userBean.setEnable(false);

		 userBeanRepository.save(userBean);

		 sendVerificationEmail(userBean, siteURL);
	}

	private void sendVerificationEmail(UserBean userBean, String siteURL)
			throws MessagingException, UnsupportedEncodingException {
		String toAddress = userBean.getEmailId();
		String fromAddress = "Trng2@evolvingsols.com";
		String senderName = "Utsav Event Management";
		String subject = "Account Activation Link";

		String content = "<p> Hello " + userBean.getFirstName() + " " + userBean.getLastName() + ",</p>";


		String verifyURL = siteURL + "/registration/verify?code=" + userBean.getAuthenticationCode();

		content += "<h4> <a href=\"" + verifyURL + "\">click here to activate your account</a></h4>";
		
		content += "<p> Thank you <br>Utsav Event Management</p>";

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom(fromAddress, senderName);
		helper.setTo(toAddress);
		helper.setSubject(subject);
		helper.setText(content, true);

		mailSender.send(message);

	}

	public boolean verify(String authenticationCode) {
		// public String verify(String verificationCode) {
		UserBean userBean = userBeanRepository.findByAuthenticationCode(authenticationCode);

		if (userBean == null || userBean.isEnable()) {
			return false;
		} 
		else 
		{
			userBean.setEnable(true);
			userBean.setAuthenticationCode("verified");
			userBeanRepository.save(userBean);
			return true;
		}
	}
	
	
	
	

	public List<UserBean> getAllRegisteredUser() {
		// TODO Auto-generated method stub
		return userBeanRepository.findAll();
	}
	
	public UserBean getRegisteredUserById(int registeredId)
	{
		return userBeanRepository.findById(registeredId).orElse(null);
	}
	
	public void deleteRegisteredUser(int registeredId)
	{
		userBeanRepository.deleteById(registeredId);
	}
	
	public UserBean updateRegisteredUser(int id,UserBean userBean)
	{
		UserBean registrationdemo1=userBeanRepository.findById(id).get();
		
		if(userBean.getFirstName()!=null)
			registrationdemo1.setFirstName(userBean.getFirstName());
		
		if(userBean.getLastName()!=null)
			registrationdemo1.setLastName(userBean.getLastName());
		
		if(userBean.getContactNo()!=null)
			registrationdemo1.setContactNo(userBean.getContactNo());
		
		if(userBean.getProfilePhoto()!=null)
			registrationdemo1.setProfilePhoto(userBean.getProfilePhoto());
		
		if(userBean.getAddress()!=null)
			registrationdemo1.setAddress(userBean.getAddress());
		
		if(userBean.getPassword()!=null)
			registrationdemo1.setPassword(userBean.getPassword());
		
		
		
		return 	userBeanRepository.save(registrationdemo1);
	}
	
	

	
	public UserBean getUserByEmailId(String email)
	{
		return userBeanRepository.findByEmailId(email);
	}
	
	
	
	public List<UserBean> getAllOrganizers()
	{
		return userBeanRepository.findByUserRole();
	}
	
	public List<UserBean> getAllUsers()
	{
		return userBeanRepository.findByUserRoleOrganizer();
	}
	
	public UserBean changePassword(String oldpass,String newpass,int userId)
	{
		UserBean user = userBeanRepository.findById(userId).get();
		
		if(oldpass.equals(user.getPassword()))
		{
			user.setPassword(newpass);
			return userBeanRepository.save(user);
		}
		else
		{
			throw new PasswordNotMatched("old Password not matched");
		}
		
	}
	
	
	
	
	
}
