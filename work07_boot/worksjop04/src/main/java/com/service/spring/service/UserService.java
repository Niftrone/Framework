package com.service.spring.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.UserDAO;
import com.service.spring.domain.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public User getUser(User vo) throws SQLException{
		System.out.println("UserService...getUser");
		return userDAO.getUser(vo);
	}
	public void addUser(User vo) throws Exception{
		System.out.println("UserService...getUser");
		userDAO.addUser(vo);
	}

}
