package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.EventDetails;
import com.cybage.utility.JDBCUtility;

public class EventDetailsDAOImpl implements EventDetailsDAO {
	public boolean addEvent(EventDetails eventdetails)
	{
		try (Connection connection = JDBCUtility.getConnection();) {

			String query = "insert into event_details ( event_name,event_organizer_id, category_id, event_city,event_date, event_price) values(?,?,?,?,?,?)";
			PreparedStatement preparedstatement = connection.prepareStatement(query);

			preparedstatement.setString(1, eventdetails.getEventName());
			preparedstatement.setInt(2,eventdetails.getEventOrganizerId());
			preparedstatement.setString(3, eventdetails.getEventCategory());
			preparedstatement.setString(4, eventdetails.getEventCity());
			preparedstatement.setString(5, eventdetails.getEventDate());
			preparedstatement.setInt(6, eventdetails.getEventPrice());


			int rowcount = preparedstatement.executeUpdate();
			if (rowcount > 0) {
				System.out.println("Event added");
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return true;
	}
	
	
	@Override
	public List<EventDetails> getEventDetailsById(int orgId) {
		// TODO Auto-generated method stub
		List<EventDetails> eventDetailsList = new ArrayList<EventDetails>();
		
		try (Connection connection = JDBCUtility.getConnection();) {

			String query="select event_id , event_name, event_price ,event_city,event_date,category_id from event_details where event_organizer_id=?;";
			

			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, orgId);

			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next()) {
				
				
				EventDetails eventDetails = new EventDetails();

				eventDetails.setEventId(resultset.getInt("event_id"));
				eventDetails.setEventName(resultset.getString("event_name"));
				eventDetails.setCategoryId(resultset.getInt("category_id"));
				eventDetails.setEventCity(resultset.getString("event_city"));
				eventDetails.setEventDate(resultset.getString("event_date"));
				eventDetails.setEventPrice(resultset.getInt("event_price"));
		
				eventDetailsList.add(eventDetails);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return eventDetailsList;
	
	}
	
	
	
	
	
	public boolean deleteEventDetails(int eventId) 
	{
		Connection connection = JDBCUtility.getConnection();
		int rowcount=0;
		try {
			String Query = "delete from event_details where event_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(Query);

			preparedstatement.setInt(1, eventId);

			rowcount = preparedstatement.executeUpdate();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		if(rowcount>0) {
			return true;
		}else {
			return false;
		}
		
	}
	public boolean updateEventDetails(EventDetails eventdetails)
	{
		int no=0;
		try (Connection connection = JDBCUtility.getConnection();) {

			String updateQuery = "update event_details set event_name=?, event_city=?,event_date=?, event_price=? where event_id=?";
			PreparedStatement preparedstatement = connection.prepareStatement(updateQuery);

			preparedstatement.setString(1, eventdetails.getEventName());
//			preparedstatement.setInt(2, eventdetails.getCategoryId());
			preparedstatement.setString(2, eventdetails.getEventCity());
			preparedstatement.setString(3, eventdetails.getEventDate());
			preparedstatement.setInt(4, eventdetails.getEventPrice());
			preparedstatement.setInt(5, eventdetails.getEventId());
			
			System.out.println(eventdetails.getEventId());
//			preparedstatement.setInt(6, );

			
			 no = preparedstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0) {
				System.out.println("Employee update successfully");
			} else {
				System.out.println("Some error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		if(no>0) 
		{
		return true;
		}
		else 
		{
		return false;
		}
	}
	
	@Override
	public EventDetails getEventByIdForUpdate(int eventId) {
		
		EventDetails eventDetails = new EventDetails();
		try (Connection connection = JDBCUtility.getConnection();) {

			System.out.println("eventid:"+eventId);
			
			 String query= "select event_id,event_name,event_city,event_date,event_price from event_details where event_id=?";
			 
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, eventId);

			ResultSet resultset = preparedstatement.executeQuery();
			while (resultset.next()) 
			{
				
				
				eventDetails.setEventId(resultset.getInt("event_id"));
				
				eventDetails.setEventName(resultset.getString("event_name"));
				eventDetails.setEventCity(resultset.getString("event_city"));
				eventDetails.setEventDate(resultset.getString("event_date"));
				eventDetails.setEventPrice(resultset.getInt("event_price"));
				

				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		
		System.out.println(eventDetails.toString());
		return eventDetails;

	}
	
	
	
	public List<EventDetails> getAllEventList()
	{
		
		List<EventDetails> eventsList = new ArrayList<EventDetails>();
		
		try (Connection connection = JDBCUtility.getConnection();) {

			String query="select * from event_details;";
			
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			
			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next()) {
				
				
				EventDetails events = new EventDetails();

				events.setEventId(resultset.getInt("event_id"));
				events.setEventName(resultset.getString("event_name"));
				events.setEventOrganizerId(resultset.getInt("event_organizer_id"));
				events.setCategoryId(resultset.getInt("category_id"));
				events.setEventCity(resultset.getString("event_city"));
				events.setEventDate(resultset.getString("event_date"));
				events.setEventPrice(resultset.getInt("event_price"));
				
				
				eventsList.add(events);
				//System.out.println(id + "  " + name + "  " + salary);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return eventsList;
		
	}
	
	
}
