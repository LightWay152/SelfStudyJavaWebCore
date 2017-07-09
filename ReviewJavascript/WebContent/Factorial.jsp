<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Factorial</title>
	<script type="text/javascript">
		function CalculateFactorial(){
			var n=document.myform.number.value;
			var number=parseInt(n);//convert n from string to int
			var i=1;
			var result=1;
			
			while(i<=number){
				result*=i;
				i++;
			}
			
			document.getElementById("displayResult").innerHTML="Result: "+result;
		}		
	</script>
</head>
<body>
	<!-- Need to config web.xml file to Factorial.jsp to run this file -->	
	<form name="myform">
		Enter number need to calculate factorial: <br/>
		<input type="text" name="number"/>
		<input type="button" value="Calculate Factorial" onclick="CalculateFactorial()"/>
	</form>	
	<div id="displayResult"></div>
</body>
