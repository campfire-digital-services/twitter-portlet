package com.permeance.portlet.twitter.exceptions;

public class TwitterException extends Exception {

    private static final long serialVersionUID = 1153461637019078455L;

    public TwitterException(Throwable e) {
        super(e);
    }

    public TwitterException(String message) {
        super(message);
    }

    public TwitterException(String message, Throwable e) {
        super(message, e);
    }
}
