<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Upload multiple file</title>
	<script src="js/jquery-3.2.1.min.js">
		</script>
		<script>
		    $(document)
		            .ready(
		                    function() {
		                        //add more file components if Add is clicked
		                        $('#addFile')
		                                .click(
		                                        function() {
		                                            var fileIndex = $('#fileTable tr')
		                                                    .children().length - 1;
		                                            $('#fileTable')
		                                                    .append(
		                                                            '<tr><td>'
		                                                                    + '   <input type="file" name="files['+ fileIndex +']" />'
		                                                                    + '</td></tr>');
		                                        });
		 
		                    });
	</script>
</head>
<body>
	<h1>Upload multiple file</h1>
	<form method="POST" enctype="multipart/form-data" action="HomeController">
	   <table id="fileTable">
	   		<tr>
                <td><input name="files[0]" type="file" /></td>
            </tr>
            <tr>
                <td><input name="files[1]" type="file" /></td>
            </tr>
	  </table>
	  <br/>
	  <input type="submit" value="Upload">
	  <input id="addFile" type="button" value="Add File" />
	</form>
</body>
