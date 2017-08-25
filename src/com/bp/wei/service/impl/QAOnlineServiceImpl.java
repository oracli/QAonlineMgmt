package com.bp.wei.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bp.wei.dao.FollowerinfoDao;
import com.bp.wei.dao.QAOnlineDao;
import com.bp.wei.dao.QAOnlineToFollowerDao;
import com.bp.wei.model.Followerinfo;
import com.bp.wei.model.QAOnlineToFollower;
import com.bp.wei.model.QAOnlineWithBLOBs;
import com.bp.wei.service.QAOnlineService;

@Service
public class QAOnlineServiceImpl implements QAOnlineService {
	
	public static Logger log = LoggerFactory.getLogger(QAOnlineService.class);
	
	@Resource
	private FollowerinfoDao fldao;
	
	@Resource
	private QAOnlineDao qadao;
	
	@Resource
	private QAOnlineToFollowerDao qatofldao;	
			
	//search follower
	public Followerinfo getFollowerInfo(String wechatUserid) {
		Followerinfo followerinfo = fldao.selectFollowerInfoByKey(wechatUserid);
		return followerinfo;
	}
	
	//search follower QA online
	public Followerinfo getFollowerQAOnlineList(String id) {
		Followerinfo followerinfo = fldao.selectFollowerQAOnlineList(id);
		return followerinfo;
	}
	
	//set QA online
	public int setQAOnlineinfo(QAOnlineWithBLOBs record, String followerid) {
		//insert QA Online
		int result = qadao.insertQAOnlineInfo(record);
		
		//insert relation to follower
		QAOnlineToFollower qatofl = new QAOnlineToFollower();
		qatofl.setEc1QaOnlineEc1Followerec1FollowerIda(followerid);
		qatofl.setEc1QaOnlineEc1Followerec1QaOnlineIdb(record.getId());
		
		result = qatofldao.insertQAOnlineToFollower(qatofl);
		
		return result;
	}	
	
	//get QA Online info for view
	@Override
	public QAOnlineWithBLOBs getQAOnlineInfo(String id) {
		QAOnlineWithBLOBs qaonline = qadao.selectQAOnlineByKey(id);
		return qaonline;
	}	
		
	
	////////////////for follower
	//example
	public Followerinfo getFollowerlist(String id) {
		Followerinfo followerinfo = fldao.selectMyFollowerListByKey(id);
		return followerinfo;
	}
	
}
