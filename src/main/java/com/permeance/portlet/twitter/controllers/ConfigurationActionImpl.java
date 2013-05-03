package com.permeance.portlet.twitter.controllers;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * ConfigurationActionImpl to call the twitter configuration page Override the
 * liferay struts ConfigurationAction
 * 
 * @author rkumar
 */

public class ConfigurationActionImpl implements ConfigurationAction {

    private static Log log = LogFactoryUtil.getLog(ConfigurationActionImpl.class);

    public void processAction(PortletConfig config, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

        String portletResource = ParamUtil.getString(actionRequest, "portletResource");

        PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);

        // Read, validate, and then set form parameters as portlet prerferences
        prefs.setValue("username", actionRequest.getParameter("username"));
        prefs.setValue("numpost", actionRequest.getParameter("numpost"));

        prefs.store();

        SessionMessages.add(actionRequest, config.getPortletName() + ".doConfigure");
    }

    public String render(PortletConfig config, RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
    	
    	String portletResource = ParamUtil.getString(renderRequest, "portletResource");
        PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest, portletResource);

        renderRequest.setAttribute("username", prefs.getValue("username", ""));
        renderRequest.setAttribute("numpost", prefs.getValue("numpost", "5"));
        return "/WEB-INF/jsp/twitter/config.jsp";
    }

}