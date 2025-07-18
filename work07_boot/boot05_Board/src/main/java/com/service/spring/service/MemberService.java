package com.service.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.spring.dao.MemberDAO;
import com.service.spring.domain.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public Member selectUser(Member pvo) {
		System.out.println("MemberService...selectUser");
		return memberDAO.selectUser(pvo);
	}
}
