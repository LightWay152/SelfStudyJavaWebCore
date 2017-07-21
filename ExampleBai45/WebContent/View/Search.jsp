<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Search Page</title>
	<script type="text/javascript">		
		function Search(){
			var xhttp;
			var name = document.myform.name.value;
			
			if(name!=""){
				var url = "SearchController?name="+name;
				
				if(window.XMLHttpRequest){
					xhttp = new XMLHttpRequest();
				}
				else{
					xhttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
				
				xhttp.onreadystatechange = function(){
					if(xhttp.readyState == 4){//4: high level state -> completed request
						var data = xhttp.responseText;
						document.getElementById("searchresult").innerHTML = data;
					}	
				}
				
				xhttp.open("POST",url,true);
				xhttp.send();
			}
			else{
				document.getElementById("searchresult").innerHTML = "";
			}
		}
	</script>
</head>
<body>
	<form name="myform">
		<input type="text" name="name" onkeyup="Search()"/>
	</form>
	<div id="searchresult"></div>
</body>
