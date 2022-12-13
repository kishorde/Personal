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
import com.cybage.model.AdminCategory;
import com.cybage.model.Event;
import com.cybage.model.EventBooking;
import com.cybage.model.UserBean;
import com.cybage.repository.AdminCategoryRepository;
import com.cybage.repository.EventBookingRepository;
import com.cybage.repository.UserBeanRepository;

import net.bytebuddy.utility.RandomString;

@Service
public class EventBookingService {

	@Autowired
	private EventBookingRepository eventBookingRepository;
	
	@Autowired
	private UserBeanRepository userBeanRepository;

	@Autowired
	private JavaMailSender mailSender;

	public EventBooking addEventBooking(EventBooking eventBooking) {
		return eventBookingRepository.save(eventBooking);
	}

	public List<EventBooking> getAllEventBooking() {
		return eventBookingRepository.findAll();
	}

	public EventBooking getEventBookingById(int bookingId) {
		return eventBookingRepository.findById(bookingId).orElse(null);
	}

	public void deleteEventBooking(int bookingId) {
		eventBookingRepository.deleteById(bookingId);
	}

	public EventBooking updateEventBooking(int bookingId, EventBooking eventBooking) {
		EventBooking eventBooking1 = eventBookingRepository.findById(bookingId).get();
//		if(eventBooking.()!=null)
//			eventBooking1.(eventBooking.());
//		
		if (eventBooking.getEventFeedback() != null)
			eventBooking1.setEventFeedback(eventBooking.getEventFeedback());

		return eventBookingRepository.save(eventBooking1);
	}

	public List<EventBooking> getAllEventBookingsByOrganizerId(int orgId) {
		return eventBookingRepository.findBookingByOrgId(orgId);
	}

	public List<EventBooking> getAllEventBookingsByUserId(int userId) {
		return eventBookingRepository.findBookingByUserId(userId);
	}

	public EventBooking confirmBooking(int bookingId, int userId) throws UnsupportedEncodingException, MessagingException {
		
		UserBean user = userBeanRepository.findById(userId).get();
		EventBooking confirmBooking = eventBookingRepository.findById(bookingId).get();
		confirmBooking.setStatus("Confirmed");

		eventBookingRepository.save(confirmBooking);
		
		return bookingConfirmationEmail(user);
	}
	
	private EventBooking bookingConfirmationEmail(UserBean user)
			throws UnsupportedEncodingException, MessagingException {
		String toAddress = user.getEmailId();
		String fromAddress = "Trng2@evolvingsols.com";
		String senderName = "Utsav Event Management";

		String subject = "Booking Confirmation";

		String content = "<p>Hello " + user.getFirstName() + "</p>" + "<h1 style=\"color:green\"> Your Booking has been Confirmed</h1>"
				+ "<p>Thank you</p>";

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom(fromAddress, senderName);
		helper.setTo(toAddress);
		helper.setSubject(subject);

		helper.setText(content, true);

		mailSender.send(message);

		return null;
	}

	public EventBooking cancelBooking(int bookingId, int userId) throws UnsupportedEncodingException, MessagingException 
	{

		UserBean user = userBeanRepository.findById(userId).get();
		EventBooking confirmBooking = eventBookingRepository.findById(bookingId).get();
		confirmBooking.setStatus("Cancelled");
		eventBookingRepository.save(confirmBooking);
		return bookingCancellationEmail(user);

	}
	
	private EventBooking bookingCancellationEmail(UserBean user)
			throws UnsupportedEncodingException, MessagingException {
		String toAddress = user.getEmailId();
		String fromAddress = "Trng2@evolvingsols.com";
		String senderName = "Utsav Event Management";

		String subject = "Booking Cancelled";

		String content = "<p>Hello " + user.getFirstName() + "</p>" + "<h1 style=\"color:red\"> Your Booking has been Cancelled by Organizer</h1>"
				+ "<p>Thank you</p>";

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom(fromAddress, senderName);
		helper.setTo(toAddress);
		helper.setSubject(subject);

		helper.setText(content, true);

		mailSender.send(message);

		return null;
	}
	
	public EventBooking updateFeedbackAndRating(String feedback,int rating,int bookingid)
	{
		EventBooking feedbackRating = eventBookingRepository.findById(bookingid).get();
		
		feedbackRating.setEventFeedback(feedback);
		feedbackRating.setRating(rating);
	
		return eventBookingRepository.save(feedbackRating);
		
	}
	

}
