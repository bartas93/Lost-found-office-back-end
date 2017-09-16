package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dataaccess.dao.UserRepository;
import com.capgemini.mappers.UserMapper;
import com.capgemini.service.UserService;
import com.capgemini.to.UserTo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserTo> getAllUsers() {
		return UserMapper.map(userRepository.findAll());
	}

}
