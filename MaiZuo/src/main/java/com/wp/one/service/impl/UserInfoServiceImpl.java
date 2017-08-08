package com.wp.one.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.one.dao.UserInfoDao;
import com.wp.one.dto.resp.UserInfoDetailRespDto;
import com.wp.one.pojo.UserInfo;
import com.wp.one.service.UserInfoService;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfoDetailRespDto getById(int id) {
		
		UserInfo userInfo = userInfoDao.getById(id);
		
		UserInfoDetailRespDto dto = new UserInfoDetailRespDto();
		if(null!=userInfo) {
			dto.setUserName(userInfo.getUserName());
			dto.setGender(userInfo.getGender());
		}
		
		return dto;
	}

	
}
