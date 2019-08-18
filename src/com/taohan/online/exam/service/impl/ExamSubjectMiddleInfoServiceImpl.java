package com.taohan.online.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taohan.online.exam.dao.ExamSubjectMiddleInfoMapper;
import com.taohan.online.exam.po.ExamSubjectMiddleInfo;
import com.taohan.online.exam.service.ExamSubjectMiddleInfoService;

@Service
public class ExamSubjectMiddleInfoServiceImpl implements
		ExamSubjectMiddleInfoService {

	@Autowired
	private ExamSubjectMiddleInfoMapper examSubjectMiddleInfoMapper;
	
	//查询试卷-试题信息
	public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(
			ExamSubjectMiddleInfo esm) {
		return examSubjectMiddleInfoMapper.getExamPaperWithSubject(esm);
	}

	public int isAddESM(Map<String, Object> map) {
		return examSubjectMiddleInfoMapper.isAddESM(map);
	}

	public int removeSubjectWithExamPaper(Map<String, Object> map) {
		return examSubjectMiddleInfoMapper.removeSubjectWithExamPaper(map);
	}

	public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm) {
		return examSubjectMiddleInfoMapper.getEsmByExamIdWithSubjectId(esm);
	}

}
