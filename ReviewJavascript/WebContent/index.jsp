<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Example JavaScript</title>
	<script type="text/javascript">
		
		/*alert-document.write*/
// 		alert("Hello JavaScript");
// 		document.write("Hell JavaScript");
		
		/*data type in javascript*/
// 		var a = 10;//int
// 		var str = "JavaScript";//string
// 		var check = false;//boolean
		
		/*if-else*/
// 		var score = 17;
// 		if(score > 8){
// 			alert("You're exellent student!");
// 		}else{
// 			alert("You're good student!");
// 		}
		
		/*for*/
// 		var num = 5;
// 		var result = 1;
// 		for(var i=1;i<=num;i++){
// 			result *= i;
// 		}
// 		alert(result);

		/*while*/
// 		var num=5;
// 		var i=1;
// 		var result=1;
// 		while(i<=num){
// 			result*=i;
// 			i++;
// 		}
// 		alert(result);
		
// 		function DisplayInfo(){
// 			alert("Hello World!");
// 		}	

		function CheckInfo(){
			var name=document.myform.name.value;
			if(name==null || name==""){
				alert("Input field do not be empty!");
				return false;
			}
		}	
		
	</script>
</head>
<body>
	<!-- >form name="myform">
		<input type="text" name="name"/>
	</form-->
	
	<!-- input type="button" value="Display Info" onclick="DisplayInfo()"/-->

	<form name="myform" action="DemoJavaScript" method="POST" onsubmit="return CheckInfo()">
		<input type="text" name="name"/>
		<input type="submit" value="Display Info"/>
	</form>
</body>
