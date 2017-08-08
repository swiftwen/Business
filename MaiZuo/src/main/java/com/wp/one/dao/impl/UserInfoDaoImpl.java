package com.wp.one.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wp.one.dao.UserInfoDao;
import com.wp.one.orm.UserInfoMapper;
import com.wp.one.pojo.UserInfo;

@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Override
	public UserInfo getById(int id) {
		// TODO Auto-generated method stub
		return userInfoMapper.getById(id);
	}

}
