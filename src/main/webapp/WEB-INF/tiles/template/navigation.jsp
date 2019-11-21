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
            ADDTRIP
        </button>
    </a>

</li>
<li>
    <a href="<spring:url value="/driver_Trip" />">
        <button type="button" class="btn btn-info">
            MY TRIP
        </button>
    </a>
</li>