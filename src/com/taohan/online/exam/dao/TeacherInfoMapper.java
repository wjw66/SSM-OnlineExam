package com.taohan.online.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.TeacherInfo;

@Repository
public interface TeacherInfoMapper {

	//获取教师集合
	//public List<TeacherInfo> getTeachers(TeacherInfo teacher);
	public List<TeacherInfo> getTeachers(Map<String, Object> map);
	
	//根据教师账户获取教师信息
	public TeacherInfo getTeacherByAccount(String teacherAccount);
	
	//获取教师数据总量
	public int getTeacherTotal();
	
	//修改教师班主任状态
	public int updateTeacherIsWork(TeacherInfo teacherInfo);
	
	//根据教师编号获取教师信息
	public TeacherInfo getTeacherById(int teacherId);
	
	//修改教师信息
	public int isUpdateTeacherInfo(TeacherInfo teacher);
	
	//添加教师信息
	public int isAddTeacherInfo(TeacherInfo teacher);
	
	//删除教师信息
	public int isDelTeacherInfo(int teacherId);
}
