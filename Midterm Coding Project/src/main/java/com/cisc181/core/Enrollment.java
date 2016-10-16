package com.cisc181.core;

import java.util.*;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {

	}

	public Enrollment(UUID studID, UUID secID){
		StudentID = studID;
		SectionID = secID;
		EnrollmentID = UUID.randomUUID();
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
}
