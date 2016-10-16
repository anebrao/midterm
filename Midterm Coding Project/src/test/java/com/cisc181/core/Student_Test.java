package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import exceptions.PersonExceptions;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		Course physics = new Course(UUID.randomUUID(), "PHYS208", 100, eMajor.PHYSICS);
		Course compsci = new Course(UUID.randomUUID(), "CISC181", 200, eMajor.CHEM);
		Course econ = new Course(UUID.randomUUID(), "ECON101", 150, eMajor.BUSINESS);

		ArrayList<Course> springCourses = new ArrayList<Course>();
		springCourses.add(physics);
		springCourses.add(compsci);
		springCourses.add(econ);

		Date fallStart = new Date(26, 8, 27); 
		Date fallEnd = new Date(26, 12, 19); 
		Date springStart = new Date(27, 2, 7); 
		Date springEnd = new Date(27, 5, 29); 

		Semester fall = new Semester(UUID.randomUUID(), fallStart, fallEnd);
		Semester spring = new Semester(UUID.randomUUID(), springStart, springEnd);

		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);
		
		Section physicsFall = new Section(fall.getSemesterID(), physics.getCourseID(), UUID.randomUUID(), 20801);
		Section physicsSpring = new Section(spring.getSemesterID(), physics.getCourseID(), UUID.randomUUID(), 20802);
		Section compsciFall = new Section(fall.getSemesterID(), compsci.getCourseID(), UUID.randomUUID(), 18101);
		Section compsciSpring = new Section(spring.getSemesterID(), compsci.getCourseID(), UUID.randomUUID(), 18102);
		Section econFall = new Section(fall.getSemesterID(), econ.getCourseID(), UUID.randomUUID(), 10101);
		Section econSpring = new Section(spring.getSemesterID(), econ.getCourseID(), UUID.randomUUID(), 10102);

		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(physicsFall);
		sections.add(physicsSpring);
		sections.add(compsciFall);
		sections.add(compsciSpring);
		sections.add(econFall);
		sections.add(econSpring);

		Student stud01 = new Student("John", "Jacob", "Jingleheimer", new Date(), eMajor.BUSINESS, "100 Main Street",
				"5555555555", "myemail01@gmail.com");
		Student stud02 = new Student("Smith", "His", "Name", new Date(), eMajor.PHYSICS, "100 Main Street",
				"5555555555", "myemail02@gmail.com");
		Student stud03 = new Student("Is", "My", "Name", new Date(), eMajor.CHEM, "100 Main Street", "5555555555",
				"myemail03@gmail.com");
		Student stud04 = new Student("Too", "Wherever", "We", new Date(), eMajor.COMPSI, "100 Main Street",
				"5555555555", "myemail04@gmail.com");
		Student stud05 = new Student("Go", "Out", "The", new Date(), eMajor.NURSING, "100 Main Street", "5555555555",
				"myemail05@gmail.com");
		Student stud06 = new Student("People", "Always", "Shout", new Date(), eMajor.BUSINESS, "100 Main Street",
				"5555555555", "myemail06@gmail.com");
		Student stud07 = new Student("John", "Jacob", "Jingle", new Date(), eMajor.PHYSICS, "100 Main Street",
				"5555555555", "myemail07@gmail.com");
		Student stud08 = new Student("Heimer", "Schmitt", "Bush", new Date(), eMajor.CHEM, "100 Main Street",
				"5555555555", "myemail08@gmail.com");
		Student stud09 = new Student("Albus", "Percival", "Dumbledore", new Date(), eMajor.COMPSI, "100 Main Street",
				"5555555555", "myemail09@gmail.com");
		Student stud10 = new Student("James", "Malcolm", "Fraser", new Date(), eMajor.NURSING, "100 Main Street",
				"5555555555", "myemail10@gmail.com");

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(stud01);
		students.add(stud02);
		students.add(stud03);
		students.add(stud04);
		students.add(stud05);
		students.add(stud06);
		students.add(stud07);
		students.add(stud08);
		students.add(stud09);
		students.add(stud10);

		Enrollment stud01Physics = new Enrollment(stud01.getStudentID(), physicsSpring.getSectionID());
		stud01Physics.setGrade(75);
		Enrollment stud01Econ = new Enrollment(stud01.getStudentID(), compsciSpring.getSectionID());
		stud01Econ.setGrade(80);
		Enrollment stud01Compsci = new Enrollment(stud01.getStudentID(), compsciFall.getSectionID());
		stud01Compsci.setGrade(85);

		Enrollment stud02Physics = new Enrollment(stud02.getStudentID(), physicsSpring.getSectionID());
		stud02Physics.setGrade(75);
		Enrollment stud02Econ = new Enrollment(stud02.getStudentID(), compsciFall.getSectionID());
		stud02Econ.setGrade(81);
		Enrollment stud02Compsci = new Enrollment(stud02.getStudentID(), compsciSpring.getSectionID());
		stud02Compsci.setGrade(85);

		Enrollment stud03Physics = new Enrollment(stud03.getStudentID(), physicsFall.getSectionID());
		stud03Physics.setGrade(85);
		Enrollment stud03Econ = new Enrollment(stud03.getStudentID(), compsciSpring.getSectionID());
		stud03Econ.setGrade(84);
		Enrollment stud03Compsci = new Enrollment(stud03.getStudentID(), compsciSpring.getSectionID());
		stud03Compsci.setGrade(85);

		Enrollment stud04Physics = new Enrollment(stud04.getStudentID(), physicsSpring.getSectionID());
		stud04Physics.setGrade(97);
		Enrollment stud04Econ = new Enrollment(stud04.getStudentID(), compsciSpring.getSectionID());
		stud04Econ.setGrade(67);
		Enrollment stud04Compsci = new Enrollment(stud04.getStudentID(), compsciSpring.getSectionID());
		stud04Compsci.setGrade(57);

		Enrollment stud05Physics = new Enrollment(stud05.getStudentID(), physicsFall.getSectionID());
		stud05Physics.setGrade(85);
		Enrollment stud05Econ = new Enrollment(stud05.getStudentID(), compsciFall.getSectionID());
		stud05Econ.setGrade(88);
		Enrollment stud05Compsci = new Enrollment(stud05.getStudentID(), compsciFall.getSectionID());
		stud05Compsci.setGrade(88);

		Enrollment stud06Physics = new Enrollment(stud06.getStudentID(), physicsSpring.getSectionID());
		stud06Physics.setGrade(75);
		Enrollment stud06Econ = new Enrollment(stud06.getStudentID(), compsciSpring.getSectionID());
		stud06Econ.setGrade(86);
		Enrollment stud06Compsci = new Enrollment(stud06.getStudentID(), compsciFall.getSectionID());
		stud06Compsci.setGrade(95);

		Enrollment stud07Physics = new Enrollment(stud07.getStudentID(), physicsSpring.getSectionID());
		stud07Physics.setGrade(79);
		Enrollment stud07Econ = new Enrollment(stud07.getStudentID(), compsciFall.getSectionID());
		stud07Econ.setGrade(60);
		Enrollment stud07Compsci = new Enrollment(stud07.getStudentID(), compsciSpring.getSectionID());
		stud07Compsci.setGrade(75);

		Enrollment stud08Physics = new Enrollment(stud08.getStudentID(), physicsFall.getSectionID());
		stud08Physics.setGrade(85);
		Enrollment stud08Econ = new Enrollment(stud08.getStudentID(), compsciSpring.getSectionID());
		stud08Econ.setGrade(88);
		Enrollment stud08Compsci = new Enrollment(stud08.getStudentID(), compsciSpring.getSectionID());
		stud08Compsci.setGrade(89);

		Enrollment stud09Physics = new Enrollment(stud09.getStudentID(), physicsSpring.getSectionID());
		stud04Physics.setGrade(91);
		Enrollment stud09Econ = new Enrollment(stud09.getStudentID(), compsciSpring.getSectionID());
		stud09Econ.setGrade(65);
		Enrollment stud09Compsci = new Enrollment(stud09.getStudentID(), compsciSpring.getSectionID());
		stud09Compsci.setGrade(77);

		Enrollment stud10Physics = new Enrollment(stud10.getStudentID(), physicsFall.getSectionID());
		stud10Physics.setGrade(95);
		Enrollment stud10Econ = new Enrollment(stud10.getStudentID(), compsciFall.getSectionID());
		stud10Econ.setGrade(98);
		Enrollment stud10Compsci = new Enrollment(stud10.getStudentID(), compsciFall.getSectionID());
		stud05Compsci.setGrade(98);

	}

	@Test
	public void test() throws PersonExceptions {

		
		
		

		double stud01GPA = (((stud01Physics.getGrade() + stud01Econ.getGrade() + stud01Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud01GPA == ((((75 + 80 + 85) / 3) / 20) - 1));

		double stud02GPA = (((stud02Physics.getGrade() + stud02Econ.getGrade() + stud02Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud02GPA == ((((75 + 81 + 85) / 3) / 20) - 1));

		double stud03GPA = (((stud03Physics.getGrade() + stud03Econ.getGrade() + stud03Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud03GPA == ((((85 + 84 + 85) / 3) / 20) - 1));

		double stud04GPA = (((stud04Physics.getGrade() + stud04Econ.getGrade() + stud04Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud04GPA == ((((97 + 67 + 57) / 3) / 20) - 1));

		double stud05GPA = (((stud05Physics.getGrade() + stud05Econ.getGrade() + stud05Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud05GPA == ((((85 + 88 + 88) / 3) / 20) - 1));

		double stud06GPA = (((stud06Physics.getGrade() + stud06Econ.getGrade() + stud06Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud06GPA == ((((75 + 86 + 95) / 3) / 20) - 1));

		double stud07GPA = (((stud01Physics.getGrade() + stud01Econ.getGrade() + stud01Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud07GPA == ((((79 + 60 + 75) / 3) / 20) - 1));

		double stud08GPA = (((stud08Physics.getGrade() + stud08Econ.getGrade() + stud08Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud08GPA == ((((85 + 88 + 89) / 3) / 20) - 1));

		double stud09GPA = (((stud09Physics.getGrade() + stud09Econ.getGrade() + stud09Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud09GPA == ((((91 + 65 + 77) / 3) / 20) - 1));

		double stud10GPA = (((stud10Physics.getGrade() + stud10Econ.getGrade() + stud10Compsci.getGrade()) / 3) / 20)
				- 1;
		assert (stud10GPA == ((((95 + 98 + 98) / 3) / 20) - 1));

		double physicsAvgGrade = (stud01Physics.getGrade() + stud02Physics.getGrade() + stud03Physics.getGrade()
				+ stud04Physics.getGrade() + stud05Physics.getGrade() + stud06Physics.getGrade()
				+ stud07Physics.getGrade() + stud08Physics.getGrade() + stud09Physics.getGrade()
				+ stud10Physics.getGrade()) / 10;
		assert (physicsAvgGrade == (75 + 75 + 85 + 97 + 85 + 75 + 79 + 85 + 91 + 98) / 10);

		double econAvgGrade = (stud01Econ.getGrade() + stud02Econ.getGrade() + stud03Econ.getGrade()
				+ stud04Econ.getGrade() + stud05Econ.getGrade() + stud06Econ.getGrade() + stud07Econ.getGrade()
				+ stud08Econ.getGrade() + stud09Econ.getGrade() + stud10Econ.getGrade()) / 10;
		assert (econAvgGrade == (80 + 81 + 84 + 67 + 88 + 86 + 60 + 88 + 65 + 98) / 10);

		double compsciAvgGrade = (stud01Compsci.getGrade() + stud02Compsci.getGrade() + stud03Compsci.getGrade()
				+ stud04Compsci.getGrade() + stud05Compsci.getGrade() + stud06Compsci.getGrade()
				+ stud07Compsci.getGrade() + stud08Compsci.getGrade() + stud09Compsci.getGrade()
				+ stud10Compsci.getGrade()) / 10;
		assert (compsciAvgGrade == (85 + 85 + 85 + 57 + 88 + 95 + 75 + 89 + 77 + 98) / 10);

		eMajor stud01OldMajor = stud01.getMajor();
		stud01.setMajor(eMajor.COMPSI);
		assert (stud01OldMajor != stud01.getMajor());
	}
}