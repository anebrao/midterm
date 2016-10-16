package com.cisc181.core;

import java.util.*;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	public Semester(UUID SemID, Date SDate, Date EDate) {
		setSemesterID(SemID);
		setStartDate(SDate);
		setEndDate(EDate);
	}

	// Getter and Setter SemesterID
	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	// Getter and Setter StartDate
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	// Getter and Setter EndDate
	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
}
