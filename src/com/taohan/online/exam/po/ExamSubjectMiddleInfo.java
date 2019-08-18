package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ExamSubjectMiddleInfo {

	private Integer esmId;
	private ExamPaperInfo examPaper;
	private SubjectInfo subject;

	public Integer getEsmId() {
		return esmId;
	}

	public void setEsmId(Integer esmId) {
		this.esmId = esmId;
	}

	public ExamPaperInfo getExamPaper() {
		return examPaper;
	}

	public void setExamPaper(ExamPaperInfo examPaper) {
		this.examPaper = examPaper;
	}

	public SubjectInfo getSubject() {
		return subject;
	}

	public void setSubject(SubjectInfo subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ExamSubjectMiddleInfo [esmId=" + esmId + ", examPaper="
				+ examPaper + ", subject=" + subject + "]";
	}
}
