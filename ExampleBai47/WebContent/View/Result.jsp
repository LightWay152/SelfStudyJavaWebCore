<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
	<meta content="text/html; charset=UTF-8">
	<title>Result Page</title>
	<link rel="stylesheet" type="text/css" href="Template/css/style.css" media="screen"/>
	        <style>
	            body{
	                background: #a7c7dc url(bg.png) repeat-x top left;
	                font-family: verdana;
	                padding:0px;
	                margin:0px;
	                letter-spacing:2px;
	            }
	            .header{
	                position:absolute;
	                top:0px;
	                left:0px;
	                width:100%;
	                height:80px;            
	            }
	            .header h1{
	                color:#fff;
	                font-size: 38px;
	                margin:0px 0px 0px 30px;
	                font-weight:100;
	                line-height:80px;
	                padding:0px;
	            }
	            .footer{
	                width:100%;
	                margin:10px 0px 5px 0px;
	            }
	            a img{
	                border:none;
	                outline:none;
	            }
	            .content{
	                margin-top:100px;
	                padding:0px;
	                bottom:0px;
	            }
	            .about{
	                width:100%;
	                height:400px;
	                background:transparent url(about.png) repeat-x top left;
	                border-top:2px solid #ccc;
	                border-bottom:2px solid #000;
	            }
	            .about .text{
	                width:16%;
	                margin:5px 2% 10px 2%;
	                height:380px;
	                float:left;
	                color:#FCFEF3;
	                font-size: 16px;
	                text-align:justify;
	                letter-spacing:0px;
	            }
	            .about .text h1{
	                border-bottom: 1px dashed #ccc;
	                color:#fff;
	            }
	            .demo{
	                width:580px;
	                padding:10px;
	                margin:10px auto;
	                border: 1px solid #fff;
	                background-color:#f7f7f7;
	            }
	            h1{
	                color:#404347;
	                margin:5px 30px 20px 0px;
	                font-weight:100;
	            }
				.pagedemo{
					border: 1px solid #CCC;
					width:310px;
					margin:2px;
	                padding:50px 10px;
	                text-align:center;
					background-color:white;	
				}
	        </style>
</head>
<body>
	<h4>Note: <%=request.getAttribute("message")!=null?request.getAttribute("message"):" "%></h4>
	
	<div class="content">
            
			<div id="paginationdemo" class="demo">
                <h1>Demo 5</h1>
                <div id="p1" class="pagedemo _current" style="">Click page 2 to view the quiz</div>
				
				<c:forEach items="${listexam}" var ="list">
					<div id="p${list.stt+1}" class="pagedemo" style="display:none;">
							<p>${list.stt}</p>
							<p>${list.cauhoi}</p>
							<p>${list.dapan1}</p>
							<p>${list.dapan2}</p>
							<p>${list.dapan3}</p>
							<p>${list.dapan4}</p>
					</div>
				</c:forEach>
				<div id="demo5">                   
                </div>
            </div>
        </div>
          
       
       
		<script type="text/javascript" src="Template/jquery-1.3.2.js"></script>
		<script src="Template/jquery.paginate.js" type="text/javascript"></script>
		<script type="text/javascript">
		
			$(function() 
			{
				$("#demo5").paginate({
					count 		: 10,
					start 		: 1,
					display     : 7,
					border					: true,
					border_color			: '#fff',
					text_color  			: '#fff',
					background_color    	: 'black',	
					border_hover_color		: '#ccc',
					text_hover_color  		: '#000',
					background_hover_color	: '#fff', 
					images					: false,
					mouse					: 'press',
					onChange     			: function(page){
												$('._current','#paginationdemo').removeClass('_current').hide();
												$('#p'+page).addClass('_current').show();
											  }
				});
			});
		</script>
	
</body>
