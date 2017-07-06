<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Upload single file</title>
</head>
<body>
	<h1>Upload single file</h1>
	<form method="POST" enctype="multipart/form-data" action="HomeController">
	  File to upload: <input type="file" name="file">
	  <br/>
	  <br/>
	  <input type="submit" value="Upload single file">
	</form>
</body>
