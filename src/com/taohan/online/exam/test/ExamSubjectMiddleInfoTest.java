package com.taohan.online.exam.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class ExamSubjectMiddleInfoTest {

	private SqlSessionFactory sqlSessionFactory;
	
	public void init() throws Exception {
		InputStream is = Resources.getResourceAsStream("test/SqlMapConfig-test.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	}
	
	@Test
	public void addTest() throws Exception {
		init();
		
		SqlSession session = sqlSessionFactory.openSession();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("examPaperId", 2);
		ArrayList<Integer> subjectIds = new ArrayList<Integer>();
		subjectIds.add(100);
		subjectIds.add(200);
		subjectIds.add(300);
		subjectIds.add(400);
		map.put("subjectIds", subjectIds);
		
		session.insert("isAddESM", map);
		session.commit();
	}
}
