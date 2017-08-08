package com.wp.one.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2017年8月8日 下午5:26:44
 */
@Configuration
@MapperScan("com.wp.one.orm")
//@PropertySource("classpath:mybatis/UserInfoMapper.xml")  //不知道为什么不行
public class UserInfoMybatisConfig {
	

}
