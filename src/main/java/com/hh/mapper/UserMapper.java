package com.hh.mapper;

import org.apache.ibatis.annotations.Select;

import com.hh.model.User;


public interface UserMapper {
	@Select("SELECT * FROM User WHERE userPhoneNumber = #{userPhoneNumber}")
	public User getUser(String userPhoneNumber);
	
	
}
