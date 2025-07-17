package com.service.spring;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.service.spring.domain.Book;

public class BookServiceUnitTest {
	public static void main(String[] args) throws IOException {
		
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		SqlSession sqlSession = factory.openSession();
		
		String NS = "ns.sql.BookMapper.";
		
		Book book1 = new Book("1234-123-123", "Java Programming", "Programming", "USA", "2023-04-01", "Pearson", "John Doe", 5000, "A comprehensive guide to Java programming.");
		Book book2 = new Book("8654-234-155", "Mastering Python", "Programming", "UK", "2022-08-15", "O'Reilly", "Jane Smith", 4500, "A deep dive into Python for advanced developers.");
		
		int a = sqlSession.insert(NS+"insertBook", book1);
		sqlSession.insert(NS+"insertBook", book2);
		System.out.println(a != 1 ? "삽입 실패" : "삽입 성공" );
        List<Book> booksByTitle = sqlSession.selectList(NS + "searchByTitle", "Java Programming");
        booksByTitle.forEach(book -> System.out.println("Book by title: " + book));

        // 출판사로 책 검색
        List<Book> booksByPublisher = sqlSession.selectList(NS + "searchByPublisher", "Pearson");
        booksByPublisher.forEach(book -> System.out.println("Book by publisher: " + book));

        // 특정 가격 이상인 책 검색
        List<Book> booksByPrice = sqlSession.selectList(NS + "searchByPrice", 4500);
        booksByPrice.forEach(book -> System.out.println("Book by price: " + book));

        // ISBN으로 책 검색
        Book bookByIsbn = sqlSession.selectOne(NS + "searchByIsbn", "1234-123-123");
        System.out.println("Book by ISBN: " + bookByIsbn);

        // ISBN으로 책 삭제
        sqlSession.delete(NS + "delete", "1234-123-123");
        sqlSession.commit();
        System.out.println("삭제 완료");

        // ISBN으로 책 수정
        Book updatedBook = new Book("8654-234-155", "Mastering Python Updated", "Programming", "UK", "2022-08-15", "O'Reilly", "Jane Smith", 4600, "Updated description.");
        sqlSession.update(NS + "update", updatedBook);
        sqlSession.commit();
        System.out.println("수정 완료");

        // ISBN 확인
        String isbn = sqlSession.selectOne(NS + "getIsbn", "8654-234-155");
        System.out.println("ISBN 확인: " + isbn);
		
		
	}
}
