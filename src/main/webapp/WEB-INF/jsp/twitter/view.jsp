
<%@ include file="init.jsp"%>

<h4>Tweets</h4>

<a class="twitter-timeline"  href="https://twitter.com/rkumar4all"  data-widget-id="329901222939201536">Tweets by @rkumar4all</a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>


<portlet:actionURL name="twitter" var="twitterUrl" />
<form:form id="twitterForm" name="twitterForm" modelAttribute="twitterForm" method="post" action="${twitterUrl}">


</form:form>
