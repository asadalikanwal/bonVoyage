<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Welcome back!!</h1> <%--<spring:message code="${login.mainLine}"/>--%>
        </div>
    </div>
</section>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please sign in</h3><%--<spring:message code="${login.pleaseSignin}"/>--%>
                </div>
                <div class="panel-body">
                    <c:if test="${not empty error}">
                        <div class="alert alert-danger">
<%--                            <spring:message--%>
<%--                                    code="login.badCredentials"/>--%>
                                Incorrect username or password.
                            <br/>
                        </div>
                    </c:if>

                    <spring:url value="/postlogin" var="action"/>

                    <form action="${action}" method="post">
<%--                    <div class="alert alert-danger">--%>
<%--                        <form code="login.badCredentials" path="*">Incorrect username or password.</form>--%>
<%--                    </div>--%>
                        <security:csrfInput/>
                        <fieldset>
                            <div class="form-group">
                                <input class="form:input-large" placeholder="User Name"
                                       id="username" name="username" type="text"/>
                            </div>
                            <div class="form-group">
                                <input class=" form:input-large" placeholder="Password"
                                       id="password" name="password" type="password"/>
                            </div>
                            <input class="btn btn-lg btn-success btn-mini" type="submit"
                                   value="Login">
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>