package com.taohan.online.exam.service;

import com.taohan.online.exam.po.CourseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseInfoService {

	public List<CourseInfo> getCourses(CourseInfo course);

	public int isUpdateCourse(CourseInfo course);

	public int isAddCourse(CourseInfo course);

	public int isDelCourse(int courseId);
	
	public CourseInfo getCourseById(int courseId);
}
