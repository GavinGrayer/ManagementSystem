<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
	<link rel="stylesheet" type="text/css" href="./jquery.datetimepicker.css"/>

</head>

<body>
	

  <h3>DateTimePickers selected by class</h3>
	<input type="text" class="some_class" value="" id="some_class_1"/>
	
	

</body>




<script src="./jquery.js"></script>
<script src="build/jquery.datetimepicker.full.js"></script>
<script>

	//日期插件
	$.datetimepicker.setLocale('en');
	
	
	$('.some_class').datetimepicker();


</script>
</html>
