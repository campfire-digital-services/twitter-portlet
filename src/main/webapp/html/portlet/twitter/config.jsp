
<%@page import="com.permeance.portlet.twitter.controllers.TwitterPortlet"%>
<%@ include file="init.jsp"%>

<h4>Configure Twitter Query</h4>

<portlet:defineObjects />

<form action="<liferay-portlet:actionURL portletConfiguration="true" />" method="post" name="<portlet:namespace />fm"> 
	Twitter Timeline Configuration:<br/>
	<textarea rows="5" style="width: 100%"><c:out value="${conflink}"/></textarea>
	<br/>

	<input type="submit" value="Save" /> 
</form>
<br/><br/>
<br/><br/>
<h4>Information</h4>

This portlet is a thin wrapper around the <a href="https://dev.twitter.com/docs/embedded-timelines">Twitter Embedded Timeline Widgets</a>.
<br/><br/>
It is configured via a link that looks like:<br/>
<textarea readonly="readonly" style="width: 100%" rows="2"><c:out value="<%=TwitterPortlet.DEFAULT_LINK %>"/></textarea>
<br/>
The data-widget-id references a widget created via <a href="https://twitter.com/settings/widgets">Widget Settings</a> of a Twitter account.
The search term, e.g. "#permeance", is saved there. It is NOT possible to change the query term here. If you want to change the query term,
you need to go to twitter, create a widget based on that query term, and then paste in the link or data-widget-id here.
<br/><br/>
There are, however, a number of other customization settings allowed on the link:<br/>
<br/>Theme: Set by adding a data-theme="dark" attribute to the embed code.
<br/><br/>
Link color: Theme: Set by adding a data-link-color="#cc0000" attribute. Note that some icons in the widget will also appear this color.
<br/><br/>
Width: Set using the standard HTML width attribute on the embed code (units are pixels.)
<br/><br/>
Height: Set using the standard HTML height attribute on the embed code (units are pixels.)
<br/><br/>
Chrome: Control the widget layout and chrome by using the data-chrome="nofooter transparent" attribute on the embed code. Use a space-separated set of the following options:<br/>
+ noheader: Hides the timeline header. Please refer to the timeline display requirements when implementing your own header.<br/>
+ nofooter: Hides the timeline footer and Tweet box, if included.<br/>
+ noborders: Removes all borders within the widget (between Tweets, cards, around the widget.) See also: border-color.<br/>
+ noscrollbar: Crops and hides the main timeline scrollbar, if visible. Please consider that hiding standard user interface components can affect the accessibility of your website.<br/>
+ transparent: Removes the background color.
<br/><br/>
Border color: Change the border color used by the widget. Takes an #abc123 hex format color e.g. data-border-color="#cc0000"
<br/><br/>
Language: The widget language is detected from the page, based on the HTML lang attribute of your content. You can also set the HTML lang attribute on the embed code itself.
<br/><br/>
Tweet limit: To fix the size of a timeline to a preset number of Tweets, use the data-tweet-limit="5" attribute with any value between 1 and 20 Tweets. The timeline will render the specified number of Tweets from the timeline, expanding the height of the widget to display all Tweets without scrolling. Since the widget is of a fixed size, it will not poll for updates when using this option.
<br/><br/>
Web Intent Related Users: As per the Tweet and follow buttons, you may provide a comma-separated list of user screen names as suggested followers to a user after they reply, Retweet, or favorite a Tweet in the timeline. Use a data-related="benward,endform" attribute on the embed code.
<br/><br/>
ARIA politeness. ARIA is an accessibility system that aids people using assistive technology interacting with dynamic web content. Read more about ARIA on W3C's website. By default, the embedded timeline uses the least obtrusive setting: aria-polite="polite". If you're using an embedded timeline as a primary source of content on your page, you may wish to override this to the assertive setting, using data-aria-polite="assertive".
<br/><br/>