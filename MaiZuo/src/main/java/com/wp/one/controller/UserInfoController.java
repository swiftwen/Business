package com.wp.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wp.one.dto.resp.UserInfoDetailRespDto;
import com.wp.one.service.UserInfoService;
/**
 * 
 * @desc 
 * @Author wenpeng
 * @2017年8月8日 下午5:16:01
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	/**
	 * 
	 * @desc 获取用户详细信息
	 * @return 
	 * @Author wenpeng
	 * @2017年8月8日 下午5:16:49
	 */
	@RequestMapping("/getUserInfoDetail")
	@ResponseBody
    public UserInfoDetailRespDto getUserInfoDetail() {
		/*UserInfoDetailRespDto userInfoDetail = new UserInfoDetailRespDto();
		userInfoDetail.setUserName("wenpeng");
		userInfoDetail.setAge(23);
		userInfoDetail.setGender((byte)1);*/
		return userInfoService.getById(1);
    }
}
