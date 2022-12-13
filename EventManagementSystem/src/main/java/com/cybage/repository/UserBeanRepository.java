package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.EventBooking;
import com.cybage.model.UserBean;

@Repository
public interface UserBeanRepository extends JpaRepository<UserBean, Integer>{

	@Query("SELECT u FROM UserBean u WHERE u.emailId = ?1")
	UserBean findByEmailId(String email);

	@Query("SELECT u FROM UserBean u WHERE u.authenticationCode = ?1")
	public UserBean findByAuthenticationCode(String code);
	
	@Query("From UserBean where userRole='organizer'")
	public List<UserBean> findByUserRole();
	
	@Query("From UserBean where userRole='user'")
	public List<UserBean> findByUserRoleOrganizer();
	
	
	@Query(value="update registration set password = CASE WHEN password = ?1 THEN ?2 ELSE password END WHERE user_id = ?3",nativeQuery=true)
	public UserBean updatePassword(String oldpass,String newpass,int userId);
	
	@Query(value="update registration set attempt  where user_id = ?1;",nativeQuery=true)
	public UserBean updateAttempt(int userId);
	
	
}
