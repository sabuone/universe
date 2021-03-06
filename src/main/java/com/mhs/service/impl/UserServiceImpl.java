package com.mhs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mhs.service.UserService;
import com.mhs.service.mapper.UserMapper;
import com.mhs.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserVO> selectAllUser() {
		return userMapper.selectAllUser();
	}

	@Override
	public UserVO selectOneUser(String id) {
		return userMapper.selectOneUser(id);
	}

	@Transactional
	@Override
	public void insertUser(UserVO user) {
		userMapper.insertUser(user);
	}
	
	@Transactional
	@Override
	public void updateUser(UserVO user) {
		userMapper.updateUser(user);
	}

	@Transactional
	@Override
	public void deleteUser(String id) {
		userMapper.deleteUser(id);
	}

}
