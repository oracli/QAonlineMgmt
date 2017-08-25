package com.bp.wei.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bp.wei.dao.FollowerinfoDao;
import com.bp.wei.model.Followerinfo;
import com.bp.wei.service.QAOnlineService;

@Service
public class QAOnlineServiceImpl implements QAOnlineService {
	
	public static Logger log = LoggerFactory.getLogger(QAOnlineService.class);
	
	

	
	@Resource
	private FollowerinfoDao fldao;
	

	
	////////////////for follower
	//myfollower
	public Followerinfo getFollowerlist(String id) {
		Followerinfo followerinfo = fldao.selectMyFollowerListByKey(id);
		return followerinfo;
	}
		
	

}
