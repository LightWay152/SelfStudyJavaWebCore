<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Home Page</title>
	<script type="text/javascript">
		function Validate(){
			var username = document.myform.username.value;
			var password = document.myform.password.value;
			
			if(username == ""){
				document.getElementById("errorname").innerHTML="Do not empty the username!";
			}
			else{
				document.getElementById("errorname").innerHTML="";
			}
			
			if(password==""){
				document.getElementById("errorpass").innerHTML="Do not empty the password!";
			}
			else{
				document.getElementById("errorpass").innerHTML="";
				if(password.length<7){
					document.getElementById("errorpass").innerHTML="Password length must be greater than 6 letters!";
				}
				else{
					document.getElementById("errorpass").innerHTML="";
				}
			}
		}
	</script>
</head>
<body>
	<form name="myform">
		<input type="text" name="username" onkeyup="Validate()"/> 
		<p id="errorname"></p>
		
		<input type="password" name="password" onkeyup="Validate()"/> 
		<p id="errorpass"></p>
		
		<input type="button" value="Validate" onclick="Validate()"/>
	</form>
</body>
