package com.wms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wms.entities.Role;
import com.wms.entities.User;
import com.wms.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	public User validate(User user)
	{
		return loginRepository.validate(user.getUsername(), user.getPassword());
	}
}
