package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class BbsDAO {
	@Autowired
	SqlSessionTemplate my;

//	public ArrayList<BbsVO> list() {
//		
//		return list;
//
//	}
//
//	
//	public BbsVO one(int no) {
//		
//		return bag;
//
//	}
//
	public int delete2(int no) {
		int result = my.delete("bbs.del", no);
		return result;
	}
//
	public int update2(BbsVO bag) {
		int result = my.update("bbs.up", bag);
		return result;
}

	// public void add2() {
	public int insert2(BbsVO bag) {
		int result = my.insert("bbs.create", bag);
//		namespace.id
		return result;

	}

}
