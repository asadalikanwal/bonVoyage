<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<li>
    <a href="<spring:url value="/welcome" />">
        <button type="button" class="btn btn-info">
            Home
        </button>
    </a>
</li>

<li>
    <a href="<spring:url value="/users/signup" />">
        <button type="button" class="btn btn-info">
            Join us!
        </button>
    </a>

</li>
<%--<li>--%>
<%--    <a href="<spring:url value="/products/add" />">--%>

<%--        <button type="button" class="btn btn-info">--%>
<%--            Add Product--%>
<%--        </button>--%>
<%--    </a>--%>

<%--</li>--%>
<li>
    <a href="<spring:url value="/login" />">
        <button type="button" class="btn btn-info">
            Login
        </button>
    </a>
</li>
<li>
    <a href="<spring:url value="/addTrip" />">
        <button type="button" class="btn btn-info">
            AddTrip
        </button>
    </a>

</li>
