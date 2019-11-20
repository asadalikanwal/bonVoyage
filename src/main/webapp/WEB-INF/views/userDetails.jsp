<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%--
  Created by IntelliJ IDEA.
  User: Aser Ahmad
  email: aaahmad@mum.edu
  Date: 11/19/2019
  Time: 10:40 PM
  This page shows user details after a successful signup.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Congratulations! You are now a member of our community!</h1> <%--<spring:message code="${login.mainLine}"/>--%>
        </div>
    </div>
</section>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Here are your main membership data</h3><%--<spring:message code="${login.pleaseSignin}"/>--%>
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <label id="name">Name: ${savedUser.firstName} ${savedUser.lastName}</label>
                    </div>
                    <div class="form-group">
                        <label id="savedUser.username">Username: ${savedUser.username}</label>
                    </div>
                    <a href="../welcome" class="btn btn-lg btn-success btn-mini">Start looking for trips</a> |
                    <a href="<spring:url value='/updateUser/${savedUser.username}'/>" class="btn btn-lg btn-success btn-mini">Change my data</a>
                </div>
            </div>
        </div>
    </div>
</div>