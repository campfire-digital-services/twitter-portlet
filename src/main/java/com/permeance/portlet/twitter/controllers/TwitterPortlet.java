package com.permeance.portlet.twitter.controllers;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class TwitterPortlet extends MVCPortlet {
    public static final Log log = LogFactoryUtil.getLog(TwitterPortlet.class);

    public static final String VIEW_PAGE = "/html/portlet/twitter/view.jsp";
    public static final String ERROR_PAGE = "/html/portlet/twitter/error.jsp";
    public static final String CONFIG_PAGE = "/html/portlet/twitter/config.jsp";

    public static final String DEFAULT_LINK = "<a class=\"twitter-timeline\" data-dnt=\"true\" href=\"https://twitter.com/search?q=%23cityofperth\" data-widget-id=\"331734964825620482\">Tweets about \"#cityofperth\"</a>";

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        try {
            PortletPreferences prefs = renderRequest.getPreferences();
            String conflink = prefs.getValue("conflink", DEFAULT_LINK);
            renderRequest.setAttribute("conflink", conflink);
            include(VIEW_PAGE, renderRequest, renderResponse);
        } catch (final Exception e) {
            log.warn(e);
            include(ERROR_PAGE, renderRequest, renderResponse);
        }
    }

}
