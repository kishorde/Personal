<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form </title>


<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">


<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="NavBar" style=" height: 3.75em; width : 100%; background-color:#173F5F;">
		<img src="images/cec.png" alt="CEC" style="height:3.75em; width:4.75em; padding-left:1em;  text-align:center;">
		
</div>

<div class="topOne" style=" left: 0; top: 0;height:2em; width: 100%; background-color:#3CAEA3; color: black; text-align: center;"><b>Welcome to City Events Corporation. Where Events meet Intelligence !!!</b></b></div>
<br>
<br>
	<br>

	<div class="main">


<section class="signup">
	<div class="container">
	<div class="signup-content">
	<div class="signup-form">
	<h2 class="form-title">Registration form</h2>
					
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
							
		<div class="form-group"><label><p>Select Role</p></label>
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
					
		<div class="signup-image">
		<figure>
		<img src="images/best-event-company.jpg" alt="sing up image">
		</figure>
		<a href="Login.jsp" class="signup-image-link"> Already User then Sign In</a>
		</div>
		</div>
		</div>
		</section>


	</div>
	
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>


	<%@ include file="navbar/footerCommon.jsp" %>


</body>

</html>