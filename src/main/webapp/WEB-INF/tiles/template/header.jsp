<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"
      rel="stylesheet">
<div class="jumbotron">
    <div>
        <c:choose>
            <c:when test="${sessionScope.username} eq ''">
                <c:out value="Please login."/>
            </c:when>
            <c:otherwise>
                <c:out value="${sessionScope.username}"/>
            </c:otherwise>
        </c:choose>
    </div>
    <div>
        <c:choose>
            <c:when test="${sessionScope.role} eq ''">
                <c:out value="Please login."/>
            </c:when>
            <c:otherwise>
                <c:out value="${sessionScope.role}"/>
            </c:otherwise>
        </c:choose>
    </div>
</div>
