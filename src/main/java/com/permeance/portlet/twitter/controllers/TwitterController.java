package com.permeance.portlet.twitter.controllers;



import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import com.permeance.portlet.twitter.beans.TwitterForm;
import com.permeance.portlet.twitter.services.TwitterService;

/**
 * Spring Twitter Portlet Controller
 * 
 * @author Rajeev Kumar
 */
@Controller("twitterController")
@RequestMapping("view")
public class TwitterController {
    public static Logger _log = Logger.getLogger(TwitterController.class);

    @Autowired
    private TwitterService twitterService;

    @RenderMapping
    public String handleViewPage(RenderRequest request, ModelMap model, @ModelAttribute("twitterForm") TwitterForm twitterForm) {

        return "view";
    }

    @ActionMapping("twitter")
    public void getReport(ActionRequest request, ActionResponse response, ModelMap model,
            @ModelAttribute("twitterForm") TwitterForm twitterForm) {

        try {

                      
        	response.setRenderParameter("destination", "twitter");
        	
        } catch (Exception e) {
            model.addAttribute("exception", e);
            response.setRenderParameter("destination", "error");
        }
    }

    @RenderMapping(params = "destination=twitter")
    public String renderResults(RenderRequest request, ModelMap model) {
        return "twitter";
    }

    @RenderMapping(params = "destination=error")
    public String renderError(RenderRequest request, ModelMap model) {
        return "error";
    }

    
}
