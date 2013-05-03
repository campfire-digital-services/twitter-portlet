package com.permeance.portlet.twitter.beans;

import java.io.Serializable;

/**
 * Holds a twitter form.
 * 
 * @author Rajeev Kumar
 * 
 */

public class TwitterForm implements Serializable {

    private static final long serialVersionUID = -5722838825139350607L;

    private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
