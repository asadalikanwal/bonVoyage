<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<style>
    .alert-danger {
        display: block;
        margin-top: 10px;
        padding: 5px 10px;
        font-size: 14px;
    }
</style>
<div class="container">
    <div class="jumbotron">
        <h1>Welcome to our community!!</h1> <%--<spring:message code="${login.mainLine}"/>--%>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please fill in your data to sign
                        up</h3><%--<spring:message code="${login.pleaseSignin}"/>--%>
                </div>
                <div class="panel-body">
                    <spring:url value="/users/signup" var="action"/>
                    <%--@elvariable id="newUser" type="com.bonvoyage.domain.User"--%>
                    <form:form action="${action}" method="post" modelAttribute="newUser">
                        <fieldset>
                            <table>
                                <tr>
                                    <td class="form-group" width="150px" valign="top">
                                        <label for="firstName">First name:</label>
                                    </td>
                                    <td width="80%">
                                        <form:input class="form:input-large" id="firstName" path="firstName"
                                                    type="text"/>
                                        <br/><form:errors class="alert alert-danger" path="firstName"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="lastName">Last name:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="lastname" path="lastName"/>
                                        <br/><form:errors class="alert alert-danger" path="lastName"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="birthdate">Birthdate:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="birthdate" path="birthdate"
                                                    type="date"/>
                                        <br/><form:errors class="alert alert-danger" path="birthdate"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="email">Email:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="email" path="email"/>
                                        <br/><form:errors class="alert alert-danger" path="email"/>
                                    </td>
                                </tr>
                                    <%--                                <tr>--%>
                                    <%--                                    <td class="form-group" valign="top">--%>
                                    <%--                                        <label for="photo">Photo:</label>--%>
                                    <%--                                    </td>--%>
                                    <%--                                    <td class="form-group" valign="top">--%>
                                    <%--                                        <form:input class=" form:input-large" id="photo" path="photo"/>--%>
                                    <%--                                        <br/><form:errors class="alert alert-danger" path="email"/>--%>
                                    <%--                                    </td>--%>
                                    <%--                                </tr>--%>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label>Phone No:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="area" path="phoneNo.area"/>-
                                        <form:input class=" form:input-large" id="prefix" path="phoneNo.prefix"/>-
                                        <form:input class=" form:input-large" id="number" path="phoneNo.number"/>
                                        <br/><form:errors class="alert alert-danger" path="phoneNo.area"/>
                                        <br/><form:errors class="alert alert-danger" path="phoneNo.prefix"/>
                                        <br/><form:errors class="alert alert-danger" path="phoneNo.number"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label>Address:</label>
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="address.door">Door No:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="door" path="address.door"/>
                                        <br/><form:errors class="alert alert-danger" path="address.door"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="address.street">Street:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="street" path="address.street"/>
                                        <br/><form:errors class="alert alert-danger" path="address.street"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="address.city">City:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="city" path="address.city"/>
                                        <br/><form:errors class="alert alert-danger" path="address.city"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="address.state">State:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="state" path="address.state"/>
                                        <br/><form:errors class="alert alert-danger" path="address.state"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label>Zip Code:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="state"
                                                    path="address.zipCode.basicCode"/>-
                                        <form:input class=" form:input-large" id="state"
                                                    path="address.zipCode.plusFour"/>
                                        <br/><form:errors class="alert alert-danger" path="address.zipCode.basicCode"/>
                                        <br/><form:errors class="alert alert-danger" path="address.zipCode.plusFour"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="username">Username:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="username" path="username"/>
                                        <br/><form:errors class="alert alert-danger" path="username"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="form-group" valign="top">
                                        <label for="password">Password:</label>
                                    </td>
                                    <td class="form-group" valign="top">
                                        <form:input class=" form:input-large" id="password" path="password"
                                                    type="password"/>
                                        <br/><form:errors class="alert alert-danger" path="password"/>
                                    </td>
                                </tr>
                            </table>
                                <%--                            <input id="userRole" name="userRole" type="hidden" value="NONE">--%>
                            <form:button class="btn btn-lg btn-success btn-mini"
                                         type="submit">I'm ready for trips!</form:button>
                        </fieldset>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>