<%@ include file="init.jsp"%>

<h4>Error</h4>

An error occurred: ${exception.message}

<portlet:renderURL var="viewUrl"/>
<a href="${viewUrl}">Back to twitter</a>