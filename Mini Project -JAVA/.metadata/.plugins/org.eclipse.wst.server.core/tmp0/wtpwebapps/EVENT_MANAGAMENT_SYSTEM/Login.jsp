
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


<section class="sign-in">
<div class="container">
	<div class="signin-content">
	<div class="signin-image">
	<figure>
	<img src="images/pic1.jpg" alt="sing in image">
	</figure>
	<a href="Registration.jsp" class="signup-image-link">Create an	account</a>
					</div>

	<div class="signin-form">
	<h2 class="form-title">Log In</h2>
	
	<form method="post" action="LoginServlet" class="register-form"	id="login-form">
	
	<div class="form-group">
	<label for="username"><i class="zmdi zmdi-account material-icons-name"></i></label>
	 <input	type="text" name="email" id="username"	placeholder="Enter email"  required="required"/>
		</div>
							
							
	<div class="form-group">
	<label for="password"><i class="zmdi zmdi-lock"></i></label>
	 <input type="password" name="password" id="password" placeholder="Password" required="required"  />
	</div>
						
	<div class="form-group form-button">
	<input type="submit" name="signin" id="signin"
	class="form-submit" value="Log in"  />
	</div>
	
	
	</form>
						
	</div>
	</div>
	</div>
	</div>
	</section>

	</div>


	<%@ include file="navbar/footerCommon.jsp" %> 
	
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	
</body>

</html>
