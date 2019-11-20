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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>




	<style type="text/css">

	</style>

</head>

<body>

<div class="container">

	<div class="bs-example">
		<nav class="navbar navbar-expand-md navbar-light bg-info">
			<a href="#" class="navbar-brand">Bon Voyage</a>
			<button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<div class="navbar-nav">
					<tiles:insertAttribute name="navigation" />
				</div>
				<div class="navbar-nav ml-auto">



					<c:choose>
						<c:when test="${sessionScope.username eq ''}">
							<p>
								Hello, <c:out value="${sessionScope.username}"/>
							</p>
							<a href="<spring:url value="/login/" />">
								<button type="button" class="btn btn-info">
									SIGN OUT
								</button>
							</a>
						</c:when>
						<c:otherwise>

							<a href="<spring:url value="/login/" />">
								<button type="button" class="btn btn-info">
									SIGN IN / JOIN US!
								</button>
							</a>



						</c:otherwise>
					</c:choose>

				</div>
<%--				<div class="navbar-nav ml-auto">--%>
<%--					<a href="<spring:url value="/login/" />">--%>
<%--						<button type="button" class="btn btn-info">--%>
<%--							SIGN OUT--%>
<%--						</button>--%>
<%--					</a>--%>
<%--				</div>--%>

			</div>
		</nav>
	</div>



	<div id="demo" class="carousel slide" data-ride="carousel">

		<!-- Indicators -->
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
		</ul>

		<!-- The slideshow -->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="d-block w-100"  src="<spring:url value="/resources/images/image_one.jpg" />" alt="First slide"/>

			</div>
			<div class="carousel-item">
				<img class="d-block w-100"  src="<spring:url value="/resources/images/image_one.jpg" />" alt="First slide"/>

			</div>
			<div class="carousel-item">
				<img class="d-block w-100"  src="<spring:url value="/resources/images/image_one.jpg" />" alt="First slide"/>

			</div>
		</div>

		<!-- Left and right controls -->
		<a class="carousel-control-prev" href="#demo" data-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</a>
		<a class="carousel-control-next" href="#demo" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>

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