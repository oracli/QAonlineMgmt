package com.bp.wei.service;


import com.bp.wei.model.Followerinfo;
import com.bp.wei.model.QAOnlineWithBLOBs;


public interface QAOnlineService {
	
	//search follower
	Followerinfo getFollowerInfo(String wechatUserid);
	
	//search follower QA online
	Followerinfo getFollowerQAOnlineList(String id);
	
	//set QA online
	int setQAOnlineinfo(QAOnlineWithBLOBs record, String followerid);
	
	//get QA Online info for view
	QAOnlineWithBLOBs getQAOnlineInfo(String id);
	
	
	///////////////////for follower
	//example
	Followerinfo getFollowerlist(String id);	
}
