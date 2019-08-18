package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CourseInfo {

	private Integer courseId;
	private String courseName;
	private Integer division;
	private GradeInfo grade;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getDivision() {
		return division;
	}

	public void setDivision(Integer division) {
		this.division = division;
	}

	public GradeInfo getGrade() {
		return grade;
	}

	public void setGrade(GradeInfo grade) {
		this.grade = grade;
	}

	public CourseInfo(Integer courseId) {
		super();
		this.courseId = courseId;
	}

	public CourseInfo() {
		super();
	}

	@Override
	public String toString() {
		return "CourseInfo [courseId=" + courseId + ", courseName="
				+ courseName + ", division=" + division + "]";
	}

}
