package mybatis.services.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;

public class MyBatisUserDAOImpl10  implements UserDAO {
	
//Sqlseesion을 주입한 의존성  1. 필드로 선언 2. 주입(set/생성자) 
private  SqlSession sqlsession ;

private static final String ns ="UserMapper10."; //  sqlsession에 있는 맵핑 들어가는거


public void setSqlsession(SqlSession sqlsession) {
	this.sqlsession = sqlsession;
}

//---- 이 두코드가 선언 하고 주입하고

@Override
public int addUser(User user) throws Exception {
	int result=sqlsession.insert(ns+"addUser", user);
	sqlsession.commit();
	return result;
}

@Override
public int updateUser(User userId) throws Exception {
	int result= sqlsession.update(ns+"updateUser", userId);
		sqlsession.commit();
	return result;
}


@Override
public User getUser(String userId) throws Exception {
   
    return sqlsession.selectOne(ns + "getUser", userId);
    
}

@Override
public List<User> getUserList(User user) throws Exception {
    return sqlsession.selectList(ns + "getUserList", user);
 
}

@Override
public int removeUser(String string) throws Exception {
	int result=sqlsession.delete(ns+"removeUser", string);
	sqlsession.commit();
	return result;
}

}