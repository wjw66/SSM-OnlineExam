package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GradeInfo {

	private Integer gradeId;
	private String gradeName;

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public GradeInfo(Integer gradeId) {
		super();
		this.gradeId = gradeId;
	}

	public GradeInfo() {
		super();
	}

	@Override
	public String toString() {
		return "GradeInfo [gradeId=" + gradeId + ", gradeName=" + gradeName
				+ "]";
	}

}
