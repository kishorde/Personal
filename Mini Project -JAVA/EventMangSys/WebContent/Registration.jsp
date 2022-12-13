<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="main">


<section class="signup">
	<div class="container">
	<div class="signup-content">
	<div class="signup-form">
	<h2 class="form-title">Sign up</h2>
					
	<form method="post" action="RegistrationServlet" class="register-form" 	id="register-form">
		
		<div class="form-group">
		<label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
		 <input type="text" name="username" id="name" placeholder="Your Name"  required="required"/>
			</div>
					
					
		<div class="form-group">
		<label for="email"><i class="zmdi zmdi-email"></i></label>
		 <input type="email" name="useremail" id="email" placeholder="Your Email" required="required"/>
		</div>
							
							
		<div class="form-group">
		<label for="pass"><i class="zmdi zmdi-lock"></i></label> 
		<input 	type="password" name="userpassword" id="password" placeholder="Password" required="required" />
		</div>
							
		<div class="form-group"><label>Role</label>
		</div>
		<div class="form-group">		
		<select name="userrole">  
		<option>User</option>
		<option>Organizer</option>
		</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;					
								
		</div>	
					
		<div class="form-group">
		<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
		<input type="text" name="usercontact" id="contact"	placeholder="Contact no" required="required" />
		</div>
			
		
							
							
		<div class="form-group form-button">
		<input type="submit" name="signup" id="signup"	class="form-submit" value="Register" />
		</div>
		</form>
		</div>
					
		
		</div>
		</div>
		</section>


	</div>
	
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>

</body>
</html>