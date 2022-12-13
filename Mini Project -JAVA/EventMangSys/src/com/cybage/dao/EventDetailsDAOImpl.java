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

			String query = "insert into event_details ( event_name, category_id, event_city,event_date, event_price) values(?,?,?,?,?)";
			PreparedStatement preparedstatement = connection.prepareStatement(query);

			preparedstatement.setString(1, eventdetails.getEventName());
			preparedstatement.setString(2, eventdetails.getEventCategory());
			preparedstatement.setString(3, eventdetails.getEventCity());
			preparedstatement.setString(4, eventdetails.getEventDate());
			preparedstatement.setInt(5, eventdetails.getEventPrice());


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
	public EventDetails getEventDetailsById(int eventId) {
		// TODO Auto-generated method stub
		try (Connection connection = JDBCUtility.getConnection();) {

			String query = "select event_id , event_name, event_price ,event_city,event_date,event_category.category_name as category_name,event_category.category_id as categoryId, event_organizer.event_organizer_id as eventOrgnaizerID, event_organizer.event_organizer_name as eventOrganizerName, event_organizer.event_organizer_email as eventOrganizerEmail from event_details join event_category on event_details.category_id= event_category.category_id join event_organizer on event_details.event_organizer_id=event_organizer.event_organizer_id where event_id= ?";
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			preparedstatement.setInt(1, eventId);

			ResultSet resultset = preparedstatement.executeQuery();
			
			while (resultset.next()) {
				EventDetails eventdetails=new EventDetails();
				
				eventdetails.setEventId(resultset.getInt("eventId"));
				eventdetails.setEventName(resultset.getString("eventName"));
				eventdetails.setEventCategory(resultset.getString("eventCategory"));
				eventdetails.setEventCity(resultset.getString("eventCity"));
				eventdetails.setEventDate(resultset.getString("eventDate"));
				eventdetails.setEventPrice(resultset.getInt("eventPrice"));
				eventdetails.setEventOrganizerId(resultset.getInt("eventOrganizerId"));
				eventdetails.setApprovalStatus(resultset.getString("approvalStatus"));
				eventdetails.setCategoryId(resultset.getInt("categoryId"));
				eventdetails.setEventOrganizerEmail(resultset.getString("eventOrganizerEmail"));
				
				
				return eventdetails;
				//System.out.println(id + "  " + name + "  " + salary);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return null;

	
	}
	
	
	
	@Override
	public List<EventDetails> getAllEventDetails(int OrganizerId) {
		Connection connection = JDBCUtility.getConnection();
		List<EventDetails> list = new ArrayList<>();

		try (Statement statement = connection.createStatement()) 
		{
										
			String query="select event_id , event_name, event_price ,event_city,event_date,event_category.category_name as category_name,event_category.category_id as categoryId, event_organizer.event_organizer_id as eventOrgnaizerID, event_organizer.event_organizer_name as eventOrganizerName, event_organizer.event_organizer_email as eventOrganizerEmail from event_details join event_category on event_details.category_id= event_category.category_id join event_organizer on event_details.event_organizer_id=event_organizer.event_organizer_id where event_details.event_organizer_id=?";
			
			PreparedStatement preparedstatement=connection.prepareStatement(query);
			
			preparedstatement.setInt(1, OrganizerId);
			ResultSet resultset=preparedstatement.executeQuery();
			
			while (resultset.next()) {

				EventDetails eventdetails = new EventDetails();

				eventdetails.setEventId(resultset.getInt("event_id"));
				eventdetails.setEventName(resultset.getString("event_name"));
				eventdetails.setEventCategory(resultset.getString("category_name"));
				eventdetails.setEventCity(resultset.getString("event_city"));
				eventdetails.setEventDate(resultset.getString("event_date"));
				eventdetails.setEventPrice(resultset.getInt("event_price"));
//				eventdetails.setEventOrganizerId(resultset.getInt("event_organizer_id"));
//				eventdetails.setApprovalStatus(resultset.getString("approval_status"));
//				eventdetails.setCategoryId(resultset.getInt("category_id"));
//				eventdetails.setEventOrganizerEmail(resultset.getString("event_organizer_email"));
				

				list.add(eventdetails);
				

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		return list;
		
	}
	
	public boolean deleteEventDetails(int eventId) 
	{
		Connection connection = JDBCUtility.getConnection();
		int no=0;
		try {
			String Query = "delete from event_details where event_id=?";
			PreparedStatement preStmt = connection.prepareStatement(Query);

			preStmt.setInt(1, eventId);

			no = preStmt.executeUpdate();
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.closeConnection();
		}
		if(no>0) {
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
			preparedstatement.setInt(2, eventdetails.getCategoryId());
			preparedstatement.setString(2, eventdetails.getEventCity());
			preparedstatement.setString(3, eventdetails.getEventDate());
			preparedstatement.setInt(4, eventdetails.getEventPrice());
			
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
	
	
	
	
	
}
