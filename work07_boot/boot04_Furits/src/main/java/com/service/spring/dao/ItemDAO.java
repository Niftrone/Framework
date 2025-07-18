package com.service.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.spring.domain.Item;

/*
 * Presistence Layer 빈
 * 해당 레이어는 디비에 저장된 raw data 와 직접적인 연결이 된다.
 * */

@Repository
public class ItemDAO {
	public static final String NS = "ns.sql.FruitMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	public Item getItem(Integer itemId) throws Exception{
		return sqlSession.selectOne(NS+"getItem", itemId);
	}
	
	public List<Item> getItemList() throws Exception{
		return sqlSession.selectList(NS + "getItemList");
	}
}
