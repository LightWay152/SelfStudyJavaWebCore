<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Home Page</title>
	<script type="text/javascript">
		function Display() {
			var xhttp;
			var name = document.myform.name.value;
			var url = "HomeController?name="+name;
			
			if(window.XMLHttpRequest){
				//code for chrome, firefox, IE7+, Opera, Safari
				xhttp = new XMLHttpRequest();
			}
			else{
				//code for IE6, IE5
				xhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			
			xhttp.onreadystatechange = function(){
				if(xhttp.readyState == 4){
					var data = xhttp.responseText;
					document.getElementById("ketqua").innerHTML=data;
				}
			}
			xhttp.open("POST",url,true);
			xhttp.send();
		}
	</script>
</head>
<body>
	<p id="ketqua"></p>
	<form name="myform">
		<input type="text" name="name"/>
		<br/>
		<br/>
		<input type="button" value="Display" onclick="Display()"/>	
	</form>
</body>
