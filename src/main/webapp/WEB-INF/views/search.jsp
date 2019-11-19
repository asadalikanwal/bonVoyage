<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>ComPro Taxi</title>
    <!--  <style type="text/css">@import url("<spring:url value="/resources/css/main.css"/>");</style>
     <style type="text/css">@import url("<spring:url value="/resources/css/map.css"/>");</style> -->
    
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>

.carousel-inner img {
      width: 50%;
      height: 60%;
  }
  
  

</style>     
</head>
 
 <body>
 
 
 <div class="container">  



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






<div style="margin-top:50px;"></div>





<div class="shadow-lg p-3 mb-5 bg-white rounded">

<div class="row justify-content-center align-items-center">
<form class="form-inline">
  
     <div class="form-group mb-2">
       <span class="glyphicon glyphicon-map-marker"></span>
       <input type="text" class="form-control" id="origin" placeholder="Origin"/>
     </div>
    <div class="form-group mx-sm-3 mb-2">
      <input type="text" class="form-control" id="destination" placeholder="Destination"/>
    </div>
    
    <div class="form-group mx-sm-3 mb-2">
        <button type="button" class="btn btn-info">
          <span class="glyphicon glyphicon-search"></span> Search
        </button>
    </div>
 
</form>
</div>
</div>
 
 
 
<div class="card">
  <h5 class="card-header">Featured</h5>
  <div class="card-body">
  <div id="map" class="float-right" style="width:200px; height:200px;">
    </div>
    <h5 class="card-title">Special title treatment</h5>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    
    
    <a href="#" class="btn btn-info">JOIN TRIP</a>
  </div>
</div>

<div style="margin-top:50px;"></div>


</div>




<script>


/* function initMap() {
	var mapProp= {
	  center:new google.maps.LatLng(51.508742,-0.120850),
	  zoom:5,
	};
	var map = new google.maps.Map(document.getElementById("map"),mapProp);
} */



function initMap() {
	  var pointA = new google.maps.LatLng(51.7519, -1.2578),
	    pointB = new google.maps.LatLng(50.8429, -0.1313),
	    myOptions = {
	      zoom: 7,
	      center: pointA
	    },
	    map = new google.maps.Map(document.getElementById('map'), myOptions),
	    // Instantiate a directions service.
	    directionsService = new google.maps.DirectionsService,
	    directionsDisplay = new google.maps.DirectionsRenderer({
	      map: map
	    }),
	    markerA = new google.maps.Marker({
	      position: pointA,
	      title: "point A",
	      label: "A",
	      map: map
	    }),
	    markerB = new google.maps.Marker({
	      position: pointB,
	      title: "point B",
	      label: "B",
	      map: map
	    });

	  // get route from A to B
	  calculateAndDisplayRoute(directionsService, directionsDisplay, pointA, pointB);

	}


function calculateAndDisplayRoute(directionsService, directionsDisplay, pointA, pointB) {
	  directionsService.route({
	    origin: pointA,
	    destination: pointB,
	    travelMode: google.maps.TravelMode.DRIVING
	  }, function(response, status) {
	    if (status == google.maps.DirectionsStatus.OK) {
	      directionsDisplay.setDirections(response);
	    } else {
	      window.alert('Directions request failed due to ' + status);
	    }
	  });
	}




</script>
  
  
  
 <script
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAPa16UTP31DOP2Yp688Tymq3DHGzSQ6kg&libraries=places&callback=initMap"
        async defer></script>
</body>
</html>
