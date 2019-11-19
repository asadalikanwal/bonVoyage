<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<c:set var="title">
	<tiles:getAsString name="title" />
</c:set>
<title><spring:message code="${title}" /></title>

	<link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.css">
	<link rel="stylesheet" href="http://getbootstrap.com/examples/jumbotron/jumbotron.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>

<body>

	<div class="container">
		<div class="header">
			<ul class="nav nav-pills pull-right">
				<tiles:insertAttribute name="navigation" />
			</ul>
			<h3 class="text-muted">Bon Voyage</h3>
		</div>






		<div class="row">
			<tiles:insertAttribute name="body" />
		</div>

		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>
