package mybatis.services.user.impl;

import java.util.List;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;
import mybatis.services.user.UserService;

public class MyBatisUserServiceImpl11 implements UserService{
private UserDAO userdao;

public void setUserdao(UserDAO userdao) {
	this.userdao = userdao;
}

@Override
public void addUser(User user) throws Exception {
	userdao.addUser(user);
	
}

@Override
public void updateUser(User userId) throws Exception {
	// TODO Auto-generated method stub
	userdao.updateUser(userId);
	
}

@Override
public User getUser(String userId) throws Exception {
	
	return userdao.getUser(userId);
}

@Override
public List<User> getUserList(User user) throws Exception {
	// TODO Auto-generated method stub
	return userdao.getUserList(user);
}


}
