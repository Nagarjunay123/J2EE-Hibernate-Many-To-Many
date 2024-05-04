package controller;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import dto.Course;
import dto.Student;

public class SaveBoth {

	public static void main(String[] args) {
		
		Course course1=new Course();
		course1.setCourseName("java");
		course1.setCourseDuration(3);
		course1.setCourseFees(30000);
		course1.setCourseTrainer("Kashi sir");
		
		Course course2=new Course();
		course2.setCourseName("j2ee");
		course2.setCourseDuration(3);
		course2.setCourseFees(40000);
		course2.setCourseTrainer("sharath sir");
		
		Course course3=new Course();
		course3.setCourseName("sql");
		course3.setCourseDuration(1);
		course3.setCourseFees(10000);
		course3.setCourseTrainer("yasin sir");
		
		Student student1=new Student();
		student1.setStudentName("dinga");
		student1.setStudentAge(22);
		student1.setStudentAddress("india");
		student1.setStudentPhone(12345678l);
		
		Student student2=new Student();
		student2.setStudentName("dingi");
		student2.setStudentAge(21);
		student2.setStudentAddress("china");
		student2.setStudentPhone(99345678l);
		
		Student student3=new Student();
		student3.setStudentName("donga");
		student3.setStudentAge(24);
		student3.setStudentAddress("us");
		student3.setStudentPhone(42345678l);
		
		List<Course> package1=new ArrayList<Course>();
		package1.add(course1);
		package1.add(course2);
		package1.add(course3);
		
		List<Course> package2=new ArrayList<Course>();
		package2.add(course1);
		package2.add(course2);
		
		List<Course> package3=new ArrayList<Course>();
		package3.add(course3);
		
		student1.setCourse(package1);
		student2.setCourse(package2);
		student3.setCourse(package3);
		
		StudentDao studentDao=new StudentDao();
		studentDao.saveBoth(student1);
		studentDao.saveBoth(student2);
		studentDao.saveBoth(student3);
	}
}
