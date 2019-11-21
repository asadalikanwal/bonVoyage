<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>

<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
        <script src="../resources/js/admin.js"></script>

</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Approvals</h3>
                </div>
                <div class="panel-body">
                    <div id="accordion">

                        <c:forEach items="${users}" var="user">
                            <div class="card card-${user.id}">
                                <div class="card-header" id="headingOne-${user.id}">
                                    <h5 class="mb-0">
                                        <button style="text-decoration: none;" class="btn btn-link"
                                                data-toggle="collapse" data-target="#collapseOne-${user.id}"
                                                aria-expanded="true" aria-controls="collapseOne">
                                                ${user.firstName} ${user.lastName} - <span
                                                style="color: #ccc; text-decoration: none;">(Click here for user details)</span>
                                        </button>

                                    </h5>
                                </div>

                                <div id="collapseOne-${user.id}" class="collapse" aria-labelledby="headingOne"
                                     data-parent="#accordion">
                                    <div class="card-body">
                                        <p><strong>Id:</strong> ${user.id}</p>
                                        <p><strong>First name:</strong> ${user.firstName}</p>
                                        <p><strong>Last name:</strong> ${user.lastName}</p>
                                        <p><strong>Email:</strong> ${user.email}</p>

                                        <a class="btn btn-success approve" data-userid="${user.id}" style="color: #fff">Approve
                                        </a>
                                        <button type="button" class="btn btn-link" data-toggle="collapse"
                                                data-target="#collapseOne-${user.id}">Close
                                        </button>

                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>