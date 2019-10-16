package com.wms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.wms.entities.Role;
import com.wms.entities.User;
import com.wms.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public User validate(@RequestBody User user)
	{
		return loginService.validate(user);
	}
}
