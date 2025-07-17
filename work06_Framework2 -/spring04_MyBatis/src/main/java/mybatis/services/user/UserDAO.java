package mybatis.services.user;

import java.util.List;

import mybatis.services.domain.User;

/*
 * 비즈니스 로직 테스트
 * ~mapping 10.xml 에 있는 쿼리 id  비즈니스 로직 함수명이다
 * addUser/updateUser/removeUser
 */

public interface UserDAO {
	int addUser(User user) throws Exception;
	int updateUser(User userId) throws Exception;
	int removeUser(String userId) throws Exception;
	
	User getUser(String userId) throws Exception;
	
	List< User> getUserList (User user) throws Exception;
	
	
	
	
}
