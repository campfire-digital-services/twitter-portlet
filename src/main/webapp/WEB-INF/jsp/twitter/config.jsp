
<%@ include file="init.jsp"%>

<h4>Configure Twitter Query</h4>

<%@ page import="com.liferay.portal.kernel.util.Constants" %> 

<portlet:defineObjects />

<form action="<liferay-portlet:actionURL portletConfiguration="true" />" method="post" name="<portlet:namespace />fm"> 
	<input name="<portlet:namespace /><%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" /> 
	Twitter User name: <input name="username" value="<c:out value="${username}"/>"> <br/>
	<br/>
	<br/>
	Number of Post: <input name="numpost" value="<c:out value="${numpost}"/>"> <br/>

	<input type="button" value="Save" onClick="submitForm(document.<portlet:namespace />fm);" /> 
</form>