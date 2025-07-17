package com.service.spring.dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.dao.BookDAO;
import com.service.spring.domain.Book;

@Repository
public class BookDAO {
	public static final String NS = "ns.sql.BookMapper.";
	
	@Autowired	
	private SqlSession sqlSession;
	
	public int insertBook(Book vo) throws Exception{
		System.out.println( "BookDAO... insertBook");
		return sqlSession.insert(NS+"insertBook", vo);
	}
	
	public List<Book> getBooks() throws Exception{
		System.out.println( "BookDAO... getBooks");
		return sqlSession.selectList(NS+"getBooks");
	}
	
	public List<Book> searchByTitle(String word) throws Exception{
		System.out.println( "BookDAO... searchByTitle");
		return sqlSession.selectList(NS+"searchByTitle", word);
	}

	public List<Book> searchByPublisher(String word) throws Exception{
		System.out.println( "BookDAO... searchByPublisher");
		return sqlSession.selectList(NS+"searchByPublisher", word);
	}
	
	public List<Book> searchByPrice(int price) throws Exception{
		System.out.println( "BookDAO... searchByPrice");
		return sqlSession.selectList(NS+"searchByPrice", price);
	}

	public Book searchByIsbn(String word) throws Exception{        
		System.out.println( "BookDAO... searchByIsbn");
		return sqlSession.selectOne(NS+"searchByIsbn", word);
	}

	
	public void delete(String word) throws Exception{
		System.out.println( "BookDAO... searchByIsbn");
		sqlSession.delete(NS+"delete", word);
	}
	
	
	public Book getIsbn(String word) throws Exception{
		System.out.println( "BookDAO... getIsbn");
		return sqlSession.selectOne(NS+"getIsbn", word);
	}
	
	public void update(Book vo) throws Exception{
		System.out.println( "BookDAO... update");
		sqlSession.update(NS+"update", vo);
	}	
	
}
