<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<li>
    <a href="<spring:url value="/welcome" />">
        <button type="button" class="btn btn-info">
            HOME
        </button>
    </a>
</li>

<li>
    <a href="<spring:url value="/addTrip" />">
        <button type="button" class="btn btn-info">
            ADD TRIP
        </button>
    </a>

</li>

<li>
    <a href="<spring:url value="/registerDriver" />">
        <button type="button" class="btn btn-info">
            BECOME DRIVER
        </button>
    </a>

</li>