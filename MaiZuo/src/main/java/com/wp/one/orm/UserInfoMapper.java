package com.wp.one.orm;

import org.apache.ibatis.annotations.Param;

import com.wp.one.pojo.UserInfo;

public interface UserInfoMapper {

	UserInfo getById(@Param("id") int id);
}
