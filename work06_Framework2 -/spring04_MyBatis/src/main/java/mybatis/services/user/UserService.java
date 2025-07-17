package mybatis.services.user;

import java.util.List;

import mybatis.services.domain.User;

public interface UserService {
	void addUser(User user) throws Exception;
	void updateUser(User userId) throws Exception;
	
	// 데이터 가공과 가장 깊은건 여기 select부분
	User getUser(String userId) throws Exception;
	List< User> getUserList (User user) throws Exception;
	
}
