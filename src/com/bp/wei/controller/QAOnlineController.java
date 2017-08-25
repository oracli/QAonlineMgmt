package com.bp.wei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bp.wei.model.Followerinfo;
import com.bp.wei.service.QAOnlineService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping
public class QAOnlineController {
	public static Logger log = LoggerFactory.getLogger(QAOnlineController.class);
	
	@Autowired
	QAOnlineService qaonlineService;
	
	

}
