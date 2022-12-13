package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Booking;
import com.cybage.model.EventDetails;
import com.cybage.utility.JDBCUtility;

public class BookingDAOImpl implements BookingDAO {

	
	
	public boolean BookEvent(Booking bookevent)
	{
		try (Connection connection = JDBCUtility.getConnection();) {

			String query = "insert into book_event (event_id,user_id,event_organizer_id,booking_status) values (?,?,?,?)";
			
			PreparedStatement preparedstatement = connection.prepareStatement(query);

			preparedstatement.setInt(1, bookevent.getEventId());
			preparedstatement.setInt(2, bookevent.getUserId());
			preparedstatement.setInt(3, bookevent.getOrganizerId());
			preparedstatement.setString(4, "Pending");
		


			int rowcount = preparedstatement.executeUpdate();
			
			if (rowcount > 0) {
				System.out.println("Event Booked");
			} else {
				System.out.println("Error in book event");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return true;
	}
	
	
	
	public List<Booking> getBookedEventDetailsByUserId(int userId)
	{
		
		List<Booking> bookinguserlist = new ArrayList<Booking>();
		
		try (Connection connection = JDBCUtility.getConnection();) 
		{

			String query="select * from book_event where user_id=?";
			
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, userId);
			System.out.println(userId);

			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next()) {
				
				
				Booking booking = new Booking();

				booking.setEventId(resultset.getInt("event_id"));
				booking.setBookingId(resultset.getInt("booking_id"));
				booking.setOrganizerId(resultset.getInt("event_organizer_id"));
				booking.setStatus(resultset.getString("booking_status"));
				
		
				bookinguserlist.add(booking);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return bookinguserlist;
	}
	
	public List<Booking> getBookedEventDetailsByOrganizerId(int organizerId)
	{
		
		List<Booking> bookingOrglist = new ArrayList<Booking>();
		
		try (Connection connection = JDBCUtility.getConnection();) 
		{

			String query="select * from book_event where event_organizer_id=?";
			
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, organizerId);

			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next()) {
				
				
				Booking booking = new Booking();

				booking.setEventId(resultset.getInt("event_id"));
				booking.setBookingId(resultset.getInt("booking_id"));
//				booking.setOrganizerId(resultset.getInt("event_organizer_id"));
				booking.setStatus(resultset.getString("booking_status"));
				
		
				bookingOrglist.add(booking);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return bookingOrglist;
	}
}
