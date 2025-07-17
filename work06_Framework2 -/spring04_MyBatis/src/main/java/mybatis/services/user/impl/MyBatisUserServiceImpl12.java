package mybatis.services.user.impl;

import java.util.List;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;
import mybatis.services.user.UserService;

public class MyBatisUserServiceImpl12 implements UserService{
private UserDAO userDAO;

public void setUserdao(UserDAO userDAO) {
	this.userDAO = userDAO;
}

@Override
public void addUser(User user) throws Exception {
	userDAO.addUser(user);
	
}

@Override
public void updateUser(User userId) throws Exception {
	// TODO Auto-generated method stub
	userDAO.updateUser(userId);
	
}

@Override
public User getUser(String userId) throws Exception {
	
	return userDAO.getUser(userId);
}

@Override
public List<User> getUserList(User user) throws Exception {
	// TODO Auto-generated method stub
	return userDAO.getUserList(user);
}


}
