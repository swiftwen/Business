package com.wp.one.service;

import com.wp.one.dto.resp.UserInfoDetailRespDto;

public interface UserInfoService {

	UserInfoDetailRespDto getById(int id);
}
