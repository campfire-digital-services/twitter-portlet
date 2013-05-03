package com.permeance.portlet.twitter.services.impl;


import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.permeance.portlet.twitter.services.TwitterService;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TwitterServiceImpl extends BasePersistenceImpl implements TwitterService {
    public static Logger _log = Logger.getLogger(TwitterServiceImpl.class);

}
